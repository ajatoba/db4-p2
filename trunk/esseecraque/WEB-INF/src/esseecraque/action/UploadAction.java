package esseecraque.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import java.io.*;

import be.telio.mediastore.ui.upload.*;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;

import esseecraque.encoding.SysCommandExecutor;
import esseecraque.util.*;


public class UploadAction extends DispatchAction {

	
	public ActionForward uploadVideo(ActionMapping mapping,
			ActionForm form, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {

		//*********** PAR�METROS DE UPLOAD
		String docRoot 				= (String) SiteManager.getInstance().getProperties().get("docroot");
		String videoFolder 			= (String) SiteManager.getInstance().getProperties().get("video_folder");
		String maxVideoUploadSize 	= (String) SiteManager.getInstance().getProperties().get("max_video_upload_size_mb");
		//*********************************
		
		//***********PAR�METROS DE ENCODING
		String videoBitrate			= (String) SiteManager.getInstance().getProperties().get("video_bitrate");
		String frameRate			= (String) SiteManager.getInstance().getProperties().get("frame_rate");
		String videoSize			= (String) SiteManager.getInstance().getProperties().get("video_size");
		String videoFormat			= (String) SiteManager.getInstance().getProperties().get("video_format");
		String audioCodec			= (String) SiteManager.getInstance().getProperties().get("audio_codec");
		String audioBitrate			= (String) SiteManager.getInstance().getProperties().get("audio_bitrate");
		String audioFrequency		= (String) SiteManager.getInstance().getProperties().get("audio_frequency");
		String audioChannels		= (String) SiteManager.getInstance().getProperties().get("audio_channels");
		//**********************************
				
		MessageResources messageResources = getResources(req);
		
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
			
			if (isMultipart) {  
				ServletFileUpload upload = new ServletFileUpload(factory);
		
				upload.setSizeMax(Integer.parseInt(maxVideoUploadSize)*1024*1024);
				
				List items = upload.parseRequest(req);  
				Iterator it = items.iterator();
				
				FileItem fi = (FileItem)it.next();  
				
				name=fi.getName();  
				size=fi.getSize();
			
				//****** COMPOSI��O DOS NOMES (COM OS PATHS) DOS ARQUIVOS
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
				
				if(arquivo.exists()){
					//****** OBTENDO A DURA��O DO V�DEO (DO LOG DE EXECU��O DO COMANDO)
					String duration = cmdError.substring(cmdError.indexOf("Duration:")+10, cmdError.indexOf("Duration:")+18);
					String[] time = duration.split(":");
					
					if (time.length <3) throw new Exception("Erro ao calcular o tempo do v�deo");
					
					int seconds = (Integer.parseInt(time[0])*3600)+(Integer.parseInt(time[1])*60) + (Integer.parseInt(time[2]));
					
					int i = 1 + (int)(Math.random() * seconds) ;
					String generateThumbnail="ffmpeg -itsoffset -"+ i +"  -i "+ encodedFileName +" -vcodec mjpeg -vframes 1 -an -f rawvideo -s "+ videoSize +" -y " + encodedFileName.substring(0,encodedFileName.lastIndexOf(".")+1)+"jpg";
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
	    }catch (FileUploadException e){
	        e.printStackTrace();
	        req.setAttribute("mensagem_erro", e.getMessage());
	    }finally{
	    	//******* APAGANDO O ARQUIVO ORIGINAL
	    	if(arquivo != null && arquivo.exists())arquivo.delete();
	    	//************************************
	    }				
		
	    return mapping.findForward("video_upload_sucess");

	}
	
}