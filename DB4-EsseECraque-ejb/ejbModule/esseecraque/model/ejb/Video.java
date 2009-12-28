package esseecraque.model.ejb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import esseecraque.model.dao.EsseECraqueDAO;
import esseecraque.model.dao.MYSQLEsseECraqueDAO;
import esseecraque.model.util.LoggerUtil;
import esseecraque.model.util.Mailer;
import esseecraque.model.util.SysCommandExecutor;
import esseecraque.model.vo.EmailVO;
import esseecraque.model.vo.VideoVO;

public class Video {
	
	private EsseECraqueDAO dao;
	

	public void gravarVideo(VideoVO videoVO) {
		LoggerUtil.info("Processando vídeo");
				
		try {
			processarVideo(videoVO);
			transferirArquivo(videoVO);			
			dao = new MYSQLEsseECraqueDAO();
			dao.atualizaVideo(videoVO);
			
		} catch (Exception e) {
			LoggerUtil.error(e.getMessage(), e);
			try {
				enviarEmailNotificacao(videoVO,false,e);
			} catch (Exception e1) {
				LoggerUtil.error(e.getMessage(), e);				
			}
			return;
		}
		
		try {
			enviarEmailNotificacao(videoVO,true,null);			
		} catch (Exception e) {
			LoggerUtil.error(e.getMessage(), e);
		}
		
		LoggerUtil.info("Vídeo processado");
	}
	
	//public InputStream 

	private void processarVideo(VideoVO videoVO) throws Exception {

		// ***********PARÂMETROS DE ENCODING
		
		String videoBitrate = System.getProperty("video_bitrate");
		String frameRate = System.getProperty("frame_rate");
		String videoSize = System.getProperty("video_size");
		String videoFormat = System.getProperty("video_format");
		String audioCodec = System.getProperty("audio_codec");
		String audioBitrate = System.getProperty("audio_bitrate");
		String audioFrequency = System.getProperty("audio_frequency");
		String audioChannels = System.getProperty("audio_channels");
		String seek = System.getProperty("seek");
		String highQuality = System.getProperty("high_quality");
		String interlace = System.getProperty("interlace");
		String docRoot 	= System.getProperty("docroot");

		// **********************************
		
		

		String uploadedFileName = videoVO.getArquivoOrigem();		
		String encodedFileName = docRoot +  videoVO.getPathDestino() + videoVO.getNomeVideoDestino() +"."+ videoFormat;

		LoggerUtil.debug("Processando video de origem: " + uploadedFileName + " para "+encodedFileName );
		
		File arquivo = new File(uploadedFileName);

		// COMANDO DE ENCODING
		String encoderCommand = "ffmpeg -i " + uploadedFileName + " -b "
				+ videoBitrate + " -r " + frameRate + " -s " + videoSize
				+ " -sameq ";
		if (seek != null && seek.equals("true")) {
			encoderCommand += " -ss ";
		}
		if (highQuality != null && highQuality.equals("true")) {
			encoderCommand += " -hq ";
		}
		if (interlace != null && interlace.equals("true")) {
			encoderCommand += " -deinterlace ";
		}

		encoderCommand += " -ab " + audioBitrate + " -f " + videoFormat
				+ " -acodec " + audioCodec + " -ar " + audioFrequency + " -ac "
				+ audioChannels + " -y " + encodedFileName;

		LoggerUtil.debug("COMANDO:" + encoderCommand);

		// ****** FAZENDO O ENCODING
		SysCommandExecutor cmdExecutor = new SysCommandExecutor();
		int exitStatus = -1;
		String cmdError = "", cmdOutput = "";

		exitStatus = cmdExecutor.runCommand(encoderCommand);
		cmdError = cmdExecutor.getCommandError();
		cmdOutput = cmdExecutor.getCommandOutput();

		// ************************

		// GERANDO THUMBNAIL E FINALIZANDO O PROCESSO
		String imagePath = "";
		if (arquivo.exists()) {
			// ****** OBTENDO A DURAÇÃO DO VÍDEO (DO LOG DE EXECUÇÃO DO COMANDO)
			String duration = cmdError.substring(
					cmdError.indexOf("Duration:") + 10, cmdError
							.indexOf("Duration:") + 18);
			String[] time = duration.split(":");

			if (time.length < 3)
				throw new Exception("Erro ao calcular o tempo do vídeo");

			int seconds = (Integer.parseInt(time[0]) * 3600)
					+ (Integer.parseInt(time[1]) * 60)
					+ (Integer.parseInt(time[2]));

			int i = 1 + (int) (Math.random() * seconds);

			imagePath = encodedFileName.substring(0, encodedFileName
					.lastIndexOf(".") + 1)
					+ "jpg";

			String generateThumbnail = "ffmpeg -itsoffset -" + i + "  -i "
					+ encodedFileName
					+ " -vcodec mjpeg -vframes 1 -an -f rawvideo -s "
					+ videoSize + " -y " + imagePath;
			cmdExecutor.runCommand(generateThumbnail);
		}

		LoggerUtil.info("Video convertido");
		//apagarArquivoOrigem(new File(uploadedFileName));
		
		// *************************

	}
	
	
	private void apagarArquivoOrigem(File pathOrigem){		
		pathOrigem.delete();		
	}

	
	private void transferirArquivo(VideoVO  videoVO) throws IOException{
		
	
		
		String pathServVideo = System.getProperty("pathServVideo");
		String docRoot 	= System.getProperty("docroot");
		
		File servidorVideo = new File(pathServVideo);
		File destino = new File(servidorVideo, videoVO.getPathDestino());
		
		LoggerUtil.info("Movendo arquivo de" + (docRoot + videoVO.getPathDestino()) + " para: "+ destino.getAbsolutePath());
		
		if(!destino.exists()){
			if(!destino.mkdirs()) throw new IOException("Não foi possível transferir o vídeo para o servidor");
		}	
		
		File origem  = new File(docRoot + videoVO.getPathDestino());
		
		String arquivoVideo = videoVO.getNomeVideoDestino() + ".flv" ;		
		String arquivoImagem =  videoVO.getNomeVideoDestino() + ".jpg" ;
		
		moverArquivo(origem, destino, arquivoVideo);
		moverArquivo(origem, destino, arquivoImagem);
		
		
	}
	
	private void moverArquivo(File origem, File destino, String pathArquivo) throws IOException{
		
		File videoLocal = new File(origem ,  pathArquivo);		
		File videoServ = new File(destino, pathArquivo);
		if(!videoServ.exists()){
			videoServ.createNewFile();
		}
		
		LoggerUtil.debug("Movendo origem: " + videoLocal);
		LoggerUtil.debug("Para destino: " + videoServ);
		
		InputStream inputStream = new FileInputStream(videoLocal);  
		OutputStream outputStream = new FileOutputStream(videoServ);    
		int len ; 
		byte[] buf = new byte[1024];  
		while ((len = inputStream.read(buf)) > 0) {  
		  outputStream.write(buf, 0, len);  
		}  
		inputStream.close();  
		outputStream.close();  	
		
		apagarArquivoOrigem(videoLocal);
		
	}

	
	private void enviarEmailNotificacao(VideoVO videoVO, boolean isSucesso,
			Throwable throwable) throws Exception {
		
		String msgEmail = null;
		if(isSucesso){
			msgEmail = System.getProperty("msgVideoSucesso");
		}else{
			msgEmail = System.getProperty("msgVideoErro").concat(throwable.getMessage());
		}
										
		EmailVO email = new EmailVO();
		email.setCorpo(msgEmail);
		email.setTitulo(System.getProperty("msgVideoTitulo"));
		email.setDestinatario(dao.consultaEmailAssinante(videoVO.getIdAssinante()));
		email.setRemetente(System.getProperty("emailRemetente"));

		Mailer.getInstance().sendMsg(email);
	}	
	
}
