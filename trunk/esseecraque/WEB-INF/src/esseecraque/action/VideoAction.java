package esseecraque.action;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
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

import esseecraque.bean.*;
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
		
		Assinante assinante = (Assinante) objSession.getAttribute(Constants.ASSINANTE_BEAN);
				
		try
	    {
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
			v.setTagVideo(vForm.getTagVideo());
			v.setIdAssinante(assinante.getId());	        
            v.setDataUpload(strData);
            
            objSession.setAttribute(Constants.TEMP_VIDEO, v);
            
            /*
            VideoDAO vDAO = DAOFactory.VIDEO_DAO();
			
			vDAO.salvar(v);
			
			//ATUALIZA O NÚMERO DE VÍDEOS
			String str_idAssinant = String.valueOf(v.getIdAssinante());
			int idAssinante = Integer.parseInt(str_idAssinant);
			Long qtd = (Long)vDAO.qtdVideo(idAssinante);
			objSession.setAttribute(Constants.QUANTIDADE_VIDEO, qtd);

			vForm.reset(mapping, req);

			//******************************
			*/
			return mapping.findForward(Constants.VIDEO_UPLOAD_FORM);
			
	    }catch (Exception e){
	        e.printStackTrace();
	        req.setAttribute("mensagem_erro", e.getMessage());
	        return mapping.findForward(Constants.ADD_VIDEO_ERROR);
	    }finally{
	    	
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
					
					objSession.setAttribute(Constants.LIST_MY_VIDEOS, lVideos);

					return mapping.findForward(Constants.LIST_MY_VIDEOS_SUCESS);
				}

			} catch (Exception e) {
				e.printStackTrace();
				return mapping.findForward(Constants.LIST_MY_VIDEOS_ERROR);
			}

	}
	
	public ActionForward listVideosAssinante(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

			HttpSession objSession = req.getSession();

			try {
				
				Long idAssinante = Long.parseLong(req.getParameter("id"));
				
				VideoDAO vDAO = DAOFactory.VIDEO_DAO();
							
				List lVideos = vDAO.buscarMeusVideos(idAssinante);
					
				objSession.setAttribute(Constants.LIST_VIDEOS_ASSINANTE, lVideos);

				return mapping.findForward(Constants.LIST_VIDEOS_SUCESS);

			}catch (Exception e) {
				e.printStackTrace();
				return mapping.findForward(Constants.LIST_VIDEOS_ERROR);
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
					
					/*
					List<Video> vLaterais = vDAO.buscarVideosLaterais();
					
					req.setAttribute(Constants.LIST_VIDEOS_LATERAIS, vLaterais);
					*/
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

			MessageResources messageResources = getResources(req);
			
			try {
					
					VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
					Video v = vDAO.buscarVideo(idVideo);
					
					if(v==null){
						req.setAttribute("mensagem_erro",messageResources.getMessage("video_excluido"));
						return mapping.findForward(Constants.REDIRECIONA_INDEX);
					}
					
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
	
	public ActionForward excluirPerg(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

			HttpSession objSession = req.getSession();
			
			Long idVideo;
			String str_idVideo;
			
			str_idVideo = req.getParameter("id");
			idVideo = Long.parseLong(str_idVideo);

			try {
					
					VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
					Video v = vDAO.buscarVideo(idVideo);
					
					objSession.setAttribute(Constants.EXCLUIR_VIDEO_SESSION, v);
					
					return mapping.findForward(Constants.EXCLUIR_VIDEO_RESPOSTA);

			} catch (Exception e) {
				e.printStackTrace();
				return mapping.findForward(Constants.EXCLUI_VIDEO_ERROR);
			}
						
	}
	
	public ActionForward excluir(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

			HttpSession objSession = req.getSession();
			
			Video v = (Video)objSession.getAttribute(Constants.EXCLUIR_VIDEO_SESSION);

			try {
					
					VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
					vDAO.removerVideo(v);
					
					//Recarrega a sessão com meus vídeos
					
					Assinante a = new Assinante();
					
					a = (Assinante)objSession.getAttribute(Constants.ASSINANTE_BEAN);

					if (a==null){
						return mapping.findForward(Constants.LIST_MY_VIDEOS_ERROR);
					}else{
						
						Long idAssinante = a.getId();
						
						String str_idAss = String.valueOf(a.getId());
						int idAss = Integer.parseInt(str_idAss);
						
						List lVideos = vDAO.buscarMeusVideos(idAssinante);
						
						objSession.setAttribute(Constants.LIST_MY_VIDEOS, lVideos);
					
						//Atualiza o número de vídeos
						Long qtd = (Long)vDAO.qtdVideo(idAss);
						objSession.setAttribute(Constants.QUANTIDADE_VIDEO, qtd);
					
						
						return mapping.findForward(Constants.LIST_MY_VIDEOS_SUCESS);
					
					}

			} catch (Exception e) {
				e.printStackTrace();
				return mapping.findForward(Constants.EXCLUI_VIDEO_ERROR);
			}
						
	}

	public ActionForward listLastVideos(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

		MessageResources messageResources = null;
		FileOutputStream os = null;
		PrintStream ps = null;
		DataOutputStream ods = null;
		try {

			messageResources = getResources(req);
			
			VideoDAO vDAO = DAOFactory.VIDEO_DAO();
			
			List<Vid> lv = vDAO.buscarUltimosVideos();
			
			req.setAttribute(Constants.LIST_ULTIMOS_VIDEOS, lv);
			
			String html="";
			Iterator<Vid> it = lv.iterator();
			while (it.hasNext()) {
				Vid video = (Vid) it.next();
				html = "<div class=\"panel\">";
				html +="<a href=\"player.do?act=playerVideo&idVideo="+video.getId()+"&secao=liberada\" >";
				html +="<img src=\""+ video.getPathImage() +"\" width=\"100\" height=\"73\" border=\"0\" alt=\""+video.getTitle()+"\" class=\"imgs\" />";
				html +="</a>";
				html +="</div>";
			}

			
			String docRoot = req.getRealPath("/");//(String)SiteManager.getInstance().getProperties().getProperty("docroot");
			String fileName = "ultimosVideos.html";
			
			String path = docRoot+fileName;

			os = new FileOutputStream(path);		
			
			ps = new PrintStream(os);
			ods = new DataOutputStream(os);
			ods.flush();
			ods.writeBytes(html);	
			
			req.setAttribute("mensagem",messageResources.getMessage("msg.ultimosVideosSucesso"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(os!=null) os.close();
			if(ods!=null) ods.close();
			if(ps!=null) ps.close();
		}
		
		return mapping.findForward(Constants.ULTIMOS_VIDEOS);
			
	}
	
	public ActionForward search(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

			HttpSession objSession = req.getSession();

			try {
							
					VideoDAO vDAO = DAOFactory.VIDEO_DAO();
					
					String keyWord = req.getParameter("busca");
					
					List lVideos = vDAO.search(keyWord);
					
					objSession.setAttribute(Constants.VIDEOS_BUSCA, lVideos);

					return mapping.findForward(Constants.RESULT_BUSCA);				

			} catch (Exception e) {
				e.printStackTrace();
				return mapping.findForward(Constants.LIST_MY_VIDEOS_ERROR);
			}

	}


}

