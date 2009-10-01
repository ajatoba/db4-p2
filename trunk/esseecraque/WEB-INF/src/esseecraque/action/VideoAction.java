package esseecraque.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;

import be.telio.mediastore.ui.upload.MonitoredDiskFileItemFactory;
import be.telio.mediastore.ui.upload.UploadListener;

import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.dao.VideoDAO;
import esseecraque.dao.DAOFactory;
import esseecraque.encoding.SysCommandExecutor;
import esseecraque.form.VideoForm;
import esseecraque.util.Constants;
import esseecraque.util.SiteManager;

public final class VideoAction  extends DispatchAction{
	
	public ActionForward add(ActionMapping mapping, 
							 ActionForm form, 
							 HttpServletRequest req, 
							 HttpServletResponse resp) throws Exception {
		
		HttpSession objSession = req.getSession();
		
		MessageResources messageResources = getResources(req);
		
//		*********** PARÂMETROS DE UPLOAD
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
	    
	    //userFolder="test"+System.currentTimeMillis()+ System.getProperty("file.separator");
	    
	    File objfile = new File(docRoot + videoFolder + userFolder);  
	    File arquivo = null;
	    if(!objfile.exists()) objfile.mkdir();
	    
	    can_path = objfile.getCanonicalPath();
	    
	    try
	    {
	        boolean isMultipart = FileUpload.isMultipartContent(req);  
			
	        String uploadedFileName="",encodedFileName="", imageName="";
	        
			if (isMultipart) {  
				ServletFileUpload upload = new ServletFileUpload(factory);
				upload.setSizeMax(Integer.parseInt(maxVideoUploadSize)*1024*1024);
				List items = upload.parseRequest(req);  
				Iterator it = items.iterator();
				
				FileItem fi = (FileItem)it.next();  

				name=fi.getName();  
				size=fi.getSize();
				
				//****** COMPOSIÇÃO DOS NOMES (COM OS PATHS) DOS ARQUIVOS
				uploadedFileName = can_path + System.getProperty("file.separator") + name;				
				encodedFileName = can_path + System.getProperty("file.separator") + System.currentTimeMillis() + "." + videoFormat;
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
				
				if(arquivo.exists()){
					//****** OBTENDO A DURAÇÃO DO VÍDEO (DO LOG DE EXECUÇÃO DO COMANDO)
					String duration = cmdError.substring(cmdError.indexOf("Duration:")+10, cmdError.indexOf("Duration:")+18);
					String[] time = duration.split(":");
					
					if (time.length <3) throw new Exception("Erro ao calcular o tempo do vídeo");
					
					int seconds = (Integer.parseInt(time[0])*3600)+(Integer.parseInt(time[1])*60) + (Integer.parseInt(time[2]));
					
					int i = 1 + (int)(Math.random() * seconds) ;
					imageName = encodedFileName.substring(0,encodedFileName.lastIndexOf(".")+1)+"jpg";
					String generateThumbnail="ffmpeg -itsoffset -"+ i +"  -i "+ encodedFileName +" -vcodec mjpeg -vframes 1 -an -f rawvideo -s "+ videoSize +" -y " + imageName;
					cmdExecutor.runCommand(generateThumbnail);					
				}
				
				//*************************
				
				if (exitStatus >=0 && cmdError.indexOf("Output #")>=0) {
					req.setAttribute("mensagem_sucesso", messageResources.getMessage("video_upload_sucess"));
				}else if(cmdError.indexOf("Output #")< 0){ 
					req.setAttribute("mensagem_erro", messageResources.getMessage("video_encoding_error"));
				}else {
					req.setAttribute("mensagem_erro", messageResources.getMessage("video_upload_error"));
				}
								
			}
			
			//******* SALVANDO O VIDEO NO BANCO  
			
			Video v = new Video();
			
			VideoForm vForm = (VideoForm) form;

			//DATA ATUAL
			java.util.Date data = new java.util.Date();   
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");  
            String strData = formato.format(data);

            //SETANDO ATRIBUTOS DO VIDEO
			v.setTitle(vForm.getTitle());
			v.setDescription(vForm.getDescription());		
			v.setIdAssinante(vForm.getId());	        
            v.setDataUpload(strData);
            v.setRealPath(encodedFileName);
            v.setPathImage(imageName);
            
            VideoDAO vDAO = DAOFactory.VIDEO_DAO();
			
			vDAO.salvar(v);
			
			//ATUALIZA O NÚMERO DE VÍDEOS
			String str_idAssinant = String.valueOf(v.getIdAssinante());
			int idAssinante = Integer.parseInt(str_idAssinant);
			Long qtd = (Long)vDAO.qtdVideo(idAssinante);
			objSession.setAttribute(Constants.QUANTIDADE_VIDEO, qtd);

			vForm.reset(mapping, req);

			//******************************
			
			return mapping.findForward(Constants.ADD_VIDEO_SUCESS);
			
	    }catch (FileUploadException e){
	        e.printStackTrace();
	        req.setAttribute("mensagem_erro", e.getMessage());
	        return mapping.findForward(Constants.ADD_VIDEO_ERROR);
	    }finally{
	    	//******* APAGANDO O ARQUIVO ORIGINAL
	    	if(arquivo != null && arquivo.exists())arquivo.delete();
	    	//************************************
	    }				

	}
	
	public ActionForward list(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

			HttpSession objSession = req.getSession();

			try {

				Assinante a = new Assinante();
				
				a = (Assinante)objSession.getAttribute(Constants.ASSINANTE_BEAN);

				if (a==null){
					return mapping.findForward(Constants.LIST_MY_VIDEOS_ERROR);
				}else{
					
					VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
					Long idAssinante = a.getId();
					
					List lVideos = vDAO.buscarMeusVideos(idAssinante);
					
					req.setAttribute(Constants.LIST_MY_VIDEOS, lVideos);

					return mapping.findForward(Constants.LIST_MY_VIDEOS_SUCESS);
				}

			} catch (Exception e) {
				e.printStackTrace();
				return mapping.findForward(Constants.LIST_MY_VIDEOS_ERROR);
			}

	}
	
	public ActionForward carregaHome(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

			HttpSession objSession = req.getSession();

			try {
					
					VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
					List<Video> lv = vDAO.buscarUltimosVideos();
					
					objSession.setAttribute(Constants.LIST_ULTIMOS_VIDEOS, lv);

			} catch (Exception e) {
				e.printStackTrace();
			}

			return mapping.findForward(Constants.REDIRECIONA_INDEX);
			
	}
	
	public ActionForward playerVideo(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

			HttpSession objSession = req.getSession();
			
			Long idVideo;
			String str_idVideo;
			String tipo_secao;
			
			str_idVideo = req.getParameter("idVideo");
			tipo_secao = req.getParameter("secao");
			idVideo = Long.parseLong(str_idVideo);

			try {
					
					VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
					Video v = vDAO.buscarVideo(idVideo);
					
					System.out.println("Real Path: " + v.getRealPath());
					
					objSession.setAttribute(Constants.VIDEO_BEAN, v);

			} catch (Exception e) {
				e.printStackTrace();
			}

			if(tipo_secao.equals("liberada")){
				return mapping.findForward(Constants.PLAYER_SECAO_LIBERADA);
			}else{
				return mapping.findForward(Constants.PLAYER_SECAO_RESTRITA);
			}
						
	}

}

