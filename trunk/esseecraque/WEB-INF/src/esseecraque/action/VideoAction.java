package esseecraque.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.dao.VideoDAO;
import esseecraque.dao.DAOFactory;
import esseecraque.form.VideoForm;
import esseecraque.util.Constants;

public final class VideoAction  extends DispatchAction{
	
	public ActionForward add(ActionMapping mapping, 
							 ActionForm form, 
							 HttpServletRequest req, 
							 HttpServletResponse resp) throws Exception {
		
		HttpSession objSession = req.getSession();
		
		try {

			Video v = new Video();
			
			VideoForm vForm = (VideoForm) form;

			v.setTitle(vForm.getTitle());
			v.setDescription(vForm.getDescription());
			v.setUrl(vForm.getUrl());
			v.setRealPath(vForm.getRealPath());
			v.setIdAssinante(vForm.getId());
			//DATA ATUAL
			java.util.Date data = new java.util.Date();   
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");  
            String strData = formato.format(data);
	        
            v.setDataUpload(strData);
            v.setPathImage(vForm.getPathImage());
			
			VideoDAO vDAO = DAOFactory.VIDEO_DAO();
			
			vDAO.salvar(v);
			
			//ATUALIZA O NÚMERO DE VÍDEOS
			String str_idAssinant = String.valueOf(v.getIdAssinante());
			int idAssinante = Integer.parseInt(str_idAssinant);
			Long qtd = (Long)vDAO.qtdVideo(idAssinante);
			objSession.setAttribute(Constants.QUANTIDADE_VIDEO, qtd);

			vForm.reset(mapping, req);
			
			return mapping.findForward(Constants.ADD_VIDEO_SUCESS);
			
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward(Constants.ADD_VIDEO_ERROR);
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

