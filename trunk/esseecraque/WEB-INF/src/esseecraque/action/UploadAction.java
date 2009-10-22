package esseecraque.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;
import java.io.*;

import be.telio.mediastore.ui.upload.*;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;

import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.encoding.SysCommandExecutor;
import esseecraque.util.*;

import esseecraque.dao.*;

public class UploadAction extends DispatchAction {

	
	public ActionForward uploadVideo(ActionMapping mapping,
			ActionForm form, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {

		MessageResources messageResources = getResources(req);
		
		HttpSession objSession = req.getSession();
		
		//*********** OBTENDO VÍDEO DA SESSÃO
		
		Video video = (Video)objSession.getAttribute(Constants.TEMP_VIDEO);
		
		if(video == null) throw new Exception(messageResources.getMessage("video_session_expired"));		
		//***************************************
				
		//*********** OBTENDO ASSINANTE DA SESSÃO
		Assinante assinante = (Assinante)objSession.getAttribute(Constants.ASSINANTE_BEAN);
		if(assinante == null) throw new Exception(messageResources.getMessage("user_session_expired"));	
		//***************************************
		
		//*********** PARÂMETROS DE UPLOAD
		String docRoot 				= (String) SiteManager.getInstance().getProperties().get("docroot");
		String videoFolder 			= (String) SiteManager.getInstance().getProperties().get("video_folder");
		String maxVideoUploadSize 	= (String) SiteManager.getInstance().getProperties().get("max_video_upload_size_mb");
		//*********************************
		
		//***********PARÂMETROS DE ENCODING
		String videoBitrate			= (String) SiteManager.getInstance().getProperties().get("video_bitrate");
		String frameRate			= (String) SiteManager.getInstance().getProperties().get("frame_rate");
		String videoSize			= (String) SiteManager.getInstance().getProperties().get("video_size");
		String videoFormat			= (String) SiteManager.getInstance().getProperties().get("video_format");
		String audioCodec			= (String) SiteManager.getInstance().getProperties().get("audio_codec");
		String audioBitrate			= (String) SiteManager.getInstance().getProperties().get("audio_bitrate");
		String audioFrequency		= (String) SiteManager.getInstance().getProperties().get("audio_frequency");
		String audioChannels		= (String) SiteManager.getInstance().getProperties().get("audio_channels");
		//**********************************
				
		
		
		UploadListener listener = new UploadListener(req, 30);
	    FileItemFactory factory = new MonitoredDiskFileItemFactory(listener);
	    
	    String name="", can_path="", userFolder="";
	    long size=0;
	    
	    userFolder = (String) SiteManager.getInstance().getProperties().get("user_folder") + assinante.getUsername() + System.getProperty("file.separator");
	    
	    /*
	     * Caso o diretório do usuário não exista 
	     * (Por algum motivo não foi criado no cadastro), 
	     * é criado na hora
	     */
	    File userRoot = new File(docRoot + userFolder);
	    	if(!userRoot.exists()) userRoot.mkdir();
	    
	    /**************/
	    	
	    File objfile = new File(docRoot + userFolder + videoFolder);  
	    File arquivo = null;
	    if(!objfile.exists()) objfile.mkdir();
	    
	    can_path = objfile.getCanonicalPath();
	    
	    try
	    {
	        boolean isMultipart = FileUpload.isMultipartContent(req);  
			
			if (isMultipart) {  
				ServletFileUpload upload = new ServletFileUpload(factory);
		
				upload.setSizeMax(Integer.parseInt(maxVideoUploadSize)*1024*1024);
				
				List items = upload.parseRequest(req);  
				Iterator it = items.iterator();
				
				FileItem fi = (FileItem)it.next();  
				
				name=fi.getName();  
				size=fi.getSize();
			
				//****** COMPOSIÇÃO DOS NOMES (COM OS PATHS) DOS ARQUIVOS
				String uploadedFileName = can_path + System.getProperty("file.separator") + name;
				//String encodedFileName = uploadedFileName.substring(0, uploadedFileName.lastIndexOf(".")+1)+videoFormat;
				String encodedFileName = can_path + System.getProperty("file.separator") + System.currentTimeMillis() + "." + videoFormat;
				//*******************************************************
				
				arquivo = new File(uploadedFileName);  
				fi.write(arquivo); 	
				
				req.setAttribute("name", name);
				req.setAttribute("size", String.valueOf(size/1024));
				
				//COMANDO DE ENCODING 								
				String encoderCommand = "ffmpeg -i "+ uploadedFileName +" -b "+ videoBitrate+ " -r "+ frameRate +" -s "+ videoSize 
				+ " -sameq -ss -hq -deinterlace -ab "+ audioBitrate +" -f "+ videoFormat 
				+ " -acodec "+ audioCodec +" -ar "+ audioFrequency +" -ac "+ audioChannels +" -y "+ encodedFileName;

				//System.out.println("COMANDO:" + encoderCommand);

				//****** FAZENDO O ENCODING				
				SysCommandExecutor cmdExecutor = new SysCommandExecutor(); 		
				int exitStatus = -1;
				String cmdError = "", cmdOutput = "";

				exitStatus 	= cmdExecutor.runCommand(encoderCommand);
				cmdError 	= cmdExecutor.getCommandError();
				cmdOutput 	= cmdExecutor.getCommandOutput();
				
				//************************
				
				//GERANDO THUMBNAIL E FINALIZANDO O PROCESSO
				String imagePath="";
				if(arquivo.exists()){
					//****** OBTENDO A DURAÇÃO DO VÍDEO (DO LOG DE EXECUÇÃO DO COMANDO)
					String duration = cmdError.substring(cmdError.indexOf("Duration:")+10, cmdError.indexOf("Duration:")+18);
					String[] time = duration.split(":");
					
					if (time.length <3) throw new Exception("Erro ao calcular o tempo do vídeo");
					
					int seconds = (Integer.parseInt(time[0])*3600)+(Integer.parseInt(time[1])*60) + (Integer.parseInt(time[2]));
					
					int i = 1 + (int)(Math.random() * seconds) ;
					
					imagePath=encodedFileName.substring(0,encodedFileName.lastIndexOf(".")+1)+"jpg";
					
					String generateThumbnail="ffmpeg -itsoffset -"+ i +"  -i "+ encodedFileName +" -vcodec mjpeg -vframes 1 -an -f rawvideo -s "+ videoSize +" -y " + imagePath;
					cmdExecutor.runCommand(generateThumbnail);					
				}
				
				//*************************
								
				//************ SALVANDO EM BANCO  ******************
				
				String videoUrl=(String) SiteManager.getInstance().getProperties().get("video_host")+"/"+ assinante.getUsername()+"/"+encodedFileName.substring(encodedFileName.lastIndexOf(System.getProperty("file.separator"))+1,encodedFileName.length());
				
				String imageWebPath = (String) SiteManager.getInstance().getProperties().get("user_folder_web") + assinante.getUsername() + "/" + videoFolder.substring(0, videoFolder.lastIndexOf(System.getProperty("file.separator"))) +"/" + imagePath.substring(imagePath.lastIndexOf(System.getProperty("file.separator"))+1,imagePath.length()) ;
				
				video.setRealPath(encodedFileName);
				video.setPathImage(imageWebPath);
				video.setUrl(videoUrl);
				
				VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
				vDAO.salvar(video);
					
				//ATUALIZA O NÚMERO DE VÍDEOS
				String str_idAssinant = String.valueOf(video.getIdAssinante());
				int idAssinante = Integer.parseInt(str_idAssinant);
				Long qtd = (Long)vDAO.qtdVideo(idAssinante);
				objSession.setAttribute(Constants.QUANTIDADE_VIDEO, qtd);

				
				//**************************************************
				
				
				if (exitStatus >=0 && cmdError.indexOf("Output #")>=0) {
					req.setAttribute("mensagem", messageResources.getMessage("video_upload_sucess"));
				}else if(cmdError.indexOf("Output #")< 0){ 
					req.setAttribute("mensagem", messageResources.getMessage("video_encoding_error"));
				}else {
					req.setAttribute("mensagem", messageResources.getMessage("video_upload_error"));
				}
								
			}
	    }catch (FileUploadException e){
	        e.printStackTrace();
	        req.setAttribute("mensagem", e.getMessage());
	    }finally{
	    	//******* APAGANDO O ARQUIVO ORIGINAL
	    	if(arquivo != null && arquivo.exists())arquivo.delete();
	    	//************************************
	    	
	    	//********* REMOVENDO O VÍDEO TEMPORÁRIO DA SESSÃO
	    	objSession.removeAttribute(Constants.TEMP_VIDEO);
	    	//************************************************
	    }				
	    
	    return mapping.findForward("video_upload_sucess");

	}
	
}