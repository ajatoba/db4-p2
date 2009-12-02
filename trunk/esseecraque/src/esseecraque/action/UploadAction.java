package esseecraque.action;

import java.io.File;
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
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;

import be.telio.mediastore.ui.upload.MonitoredDiskFileItemFactory;
import be.telio.mediastore.ui.upload.UploadListener;
import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;
import esseecraque.model.ejb.VideoSessionFacadeRemote;
import esseecraque.model.util.ServiceLocator;
import esseecraque.model.vo.VideoVO;
import esseecraque.util.Constants;


public class UploadAction extends DispatchAction {

	
	public ActionForward uploadVideo(ActionMapping mapping,
			ActionForm form, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {

		MessageResources messageResources = getResources(req);
		
		HttpSession objSession = req.getSession();
		
		//*********** OBTENDO VÍDEO DA SESSÃO
		
		Video video = (Video)objSession.getAttribute(Constants.TEMP_VIDEO);
				
		if(video == null){
			req.setAttribute("mensagem", messageResources.getMessage("video_upload_error"));
			return mapping.findForward("video_upload_sucess");
		} 		
		//***************************************
		
		//*********** OBTENDO ASSINANTE DA SESSÃO
		Assinante assinante = (Assinante)objSession.getAttribute(Constants.ASSINANTE_BEAN);
		
		if(assinante == null) {
			req.setAttribute("mensagem", messageResources.getMessage("user_session_expired"));
			return mapping.findForward("video_upload_sucess");
		} 	
	
		//***************************************
		
		//*********** PARÂMETROS DE UPLOAD
		String docRoot 				= System.getProperty("docroot");
		String videoFolder 			= System.getProperty("video_folder");
		String maxVideoUploadSize 	= System.getProperty("max_video_upload_size_mb");
		//*********************************
		
				
		String userFolder = (String) System.getProperty("user_folder") + assinante.getUsername() + System.getProperty("file.separator");

		StringBuilder pastaDestino = new StringBuilder()
		.append(userFolder)
		.append(videoFolder);
		
		String pathServVideo = System.getProperty("pathServVideo");
		
		File servidorLocal = new File(docRoot, pastaDestino.toString());
		File servidorVideo = new File(pathServVideo, pastaDestino.toString());
		File uploadedArquivoVideo = null;
		
		String nomeNovoArquivo = String.valueOf(System.currentTimeMillis());			
		
		//**********************************
				
		UploadListener listener = new UploadListener(req, 30);
	    FileItemFactory factory = new MonitoredDiskFileItemFactory(listener);
	    long size=0;
	    	    
	    try
	    {
	    	
	    	if(!servidorLocal.exists()) servidorLocal.mkdirs();
	    	
	        boolean isMultipart = FileUpload.isMultipartContent(req);  
			
			if (isMultipart) {  
				ServletFileUpload upload = new ServletFileUpload(factory);
		
				upload.setSizeMax(Integer.parseInt(maxVideoUploadSize)*1024*1024);
				
				List items = upload.parseRequest(req);  
				Iterator it = items.iterator();				
				FileItem fi = (FileItem)it.next();  
				
				String uploadedNomeArquivo = fi.getName().substring(fi.getName().lastIndexOf(System.getProperty("file.separator"))+1, fi.getName().length());
					 
				size=fi.getSize();
				
				uploadedArquivoVideo = new File(servidorLocal,uploadedNomeArquivo);  
				fi.write(uploadedArquivoVideo); 	
			
				System.out.println("NOME DO ARQUIVO:"+uploadedNomeArquivo);
				
				//****** COMPOSIÇÃO DOS NOMES (COM OS PATHS) DOS ARQUIVOS
				String uploadedFileName = servidorLocal.getCanonicalPath() + System.getProperty("file.separator") + uploadedNomeArquivo.substring(uploadedNomeArquivo.lastIndexOf(System.getProperty("file.separator"))+1, uploadedNomeArquivo.length());						
												
				
				System.out.println("NOME DO ARQUIVO SUBIDO:"+uploadedFileName);
				
								
				req.setAttribute("name", uploadedNomeArquivo);
				req.setAttribute("size", String.valueOf(size/1024));				
								
				//************ SALVANDO EM BANCO  ******************
				
				 
				StringBuilder realPath = new StringBuilder()
				.append(servidorVideo.getCanonicalPath())
				.append(System.getProperty("file.separator"))
				.append(nomeNovoArquivo);
				
				video.setRealPath(realPath.toString());
				
				video.setUrl(pastaDestino.toString().concat(System.getProperty("file.separator")).concat(nomeNovoArquivo.concat(".".concat(System.getProperty("video_format")))));	
				video.setPathImage("");
				video.setStatus(0);
				VideoDAO vDAO = DAOFactory.VIDEO_DAO();					
				video = vDAO.salvar(video);
					
				//ATUALIZA O NÚMERO DE VÍDEOS
				String str_idAssinant = String.valueOf(video.getIdAssinante());
				int idAssinante = Integer.parseInt(str_idAssinant);
				Long qtd = (Long)vDAO.qtdVideo(idAssinante);
				objSession.setAttribute(Constants.QUANTIDADE_VIDEO, qtd);

				//**************************************************				
				
				/***FILA JMS***/
				
				VideoVO videoVO = new VideoVO();
				videoVO.setArquivoOrigem(uploadedFileName);
				videoVO.setIdAssinante(assinante.getId());
				videoVO.setIdVideo(video.getId());
				videoVO.setNomeVideoDestino(nomeNovoArquivo);
				videoVO.setPathDestino(pastaDestino.toString());
				
				VideoSessionFacadeRemote ejb = (VideoSessionFacadeRemote) ServiceLocator.getInstance().locateEJB(VideoSessionFacadeRemote.REMOTE);
				
				ejb.gravarVideo(videoVO);
				
				/******/				
				
				req.setAttribute("mensagem", messageResources.getMessage("video_upload_sucess"));				
			}
			return mapping.findForward("video_upload_sucess");
			
	    }catch (FileUploadException e){
	        e.printStackTrace();	        
	        req.setAttribute("mensagem", e.getMessage());
	        return mapping.findForward("video_upload_sucess");
	    }finally{
	    	//******* APAGANDO O ARQUIVO ORIGINAL
	    	//if(uploadedArquivoVideo != null && uploadedArquivoVideo.exists())uploadedArquivoVideo.delete();
	    	//************************************
	    	
	    	//********* REMOVENDO O VÍDEO TEMPORÁRIO DA SESSÃO
	    	objSession.removeAttribute(Constants.TEMP_VIDEO);
	    	//************************************************
	    }			
	    
	    

	}
	
}