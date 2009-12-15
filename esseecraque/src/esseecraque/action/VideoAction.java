package esseecraque.action;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import esseecraque.bean.*;
import esseecraque.dao.VideoDAO;
import esseecraque.dao.DAOFactory;
import esseecraque.form.VideoForm;
import esseecraque.model.ejb.VideoSessionFacadeRemote;
import esseecraque.model.util.ServiceLocator;
import esseecraque.util.Constants;
import esseecraque.util.HTMLReader;
import esseecraque.util.HibernateUtil;

public final class VideoAction  extends DispatchAction{
	
	public ActionForward add(ActionMapping mapping, 
							 ActionForm form, 
							 HttpServletRequest req, 
							 HttpServletResponse resp) throws Exception {
		
		HttpSession objSession = req.getSession();
				
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
            v.setStatus(vForm.getStatus());
            
            objSession.setAttribute(Constants.TEMP_VIDEO, v);
                        
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

			try {
				
				Long idAssinante = Long.parseLong(req.getParameter("id"));
				
				VideoDAO vDAO = DAOFactory.VIDEO_DAO();
							
				List<Video> lVideos = vDAO.buscarMeusVideos(idAssinante);
					
				req.setAttribute(Constants.LIST_VIDEOS_ASSINANTE, lVideos);
				
				Assinante a = null;

				if (lVideos.size()>0) {
					a = lVideos.get(0).getAssinante();
					req.setAttribute(Constants.ASSINANTE_BEAN_VIDEOS, a);
				}
				
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
			
			String template = HTMLReader.readHTML(req.getRealPath("/") + "templates" + System.getProperty("file.separator")+ "ultimos_videos_template.html");
			String html = "";
			Map<String,String>  tags = null;
			
			VideoDAO vDAO = DAOFactory.VIDEO_DAO();			
			
			List<Video> lv = vDAO.buscarUltimosVideos();
						
			Iterator<Video> it = lv.iterator();
			
			while (it.hasNext()) {
				Video video = (Video) it.next();				
				tags = new HashMap<String, String>();
				
				tags.put("<ID_VIDEO>", String.valueOf(video.getId()));
				tags.put("<DESCRICAO_VIDEO>", video.getDescription());
				tags.put("<DATA_VIDEO>", video.getDataUpload());
				tags.put("<THUMB_VIDEO>", video.getPathImage());
				
				html += HTMLReader.replaceAllTags(template, tags);
			}
			
			String docRoot = req.getRealPath("/");//(String)SiteManager.getInstance().getProperties().getProperty("docroot");
			String fileName = "ultimos_videos.jsp";
			
			String path = docRoot+fileName;

			os = new FileOutputStream(path);		
			
			ps = new PrintStream(os);
			ods = new DataOutputStream(os);
			ods.flush();
			ods.writeBytes(html);	
			
			req.setAttribute("mensagem",messageResources.getMessage("msg.ultimosVideosSucesso"));
			return mapping.findForward(Constants.ULTIMOS_VIDEOS);
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("mensagem",e.getMessage());				
			return mapping.findForward(Constants.ULTIMOS_VIDEOS);
			
		}finally{
			if(os!=null) os.close();
			if(ods!=null) ods.close();
			if(ps!=null) ps.close();
		}
		
	}
	
	public ActionForward search(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {
		
		String keyWord = req.getParameter("busca");
		
		if(keyWord==null || keyWord.equals("")){
			req.setAttribute(Constants.VIDEOS_BUSCA, null);
			return mapping.findForward(Constants.RESULT_BUSCA);
		}
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MessageResources messageResources = null;
		
		try {
		
			messageResources = getResources(req);
			
			FullTextSession fullTextSession = Search.getFullTextSession(session);
			Transaction tx = fullTextSession.beginTransaction();

			String[] fields = new String[]{"title","description"};
			MultiFieldQueryParser parser = new MultiFieldQueryParser(fields, new StandardAnalyzer());
			org.apache.lucene.search.Query query = parser.parse(keyWord);

			org.hibernate.Query hibQuery = fullTextSession.createFullTextQuery(query, Video.class);

			List result = hibQuery.list();
			
			tx.commit();
			session.close();
			
			req.setAttribute(Constants.VIDEOS_BUSCA, result);
			return mapping.findForward(Constants.RESULT_BUSCA);
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute(Constants.VIDEOS_BUSCA, "ERRO NA BUSCA:" +e.getMessage());
			return mapping.findForward(Constants.RESULT_BUSCA);
			
		}		    
		
	}

	public ActionForward listAllVideos(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

		MessageResources messageResources = null;

		try {

			messageResources = getResources(req);
			
			VideoDAO vDAO = DAOFactory.VIDEO_DAO();
			
			List<Video> lv = vDAO.listAllVideos();
			
			if(lv == null || lv.size() <=0){
				req.setAttribute("mensagem",messageResources.getMessage("msg.noVideos"));
				return mapping.findForward(Constants.ADMIN_SAIDA);
			}else{
				req.setAttribute(Constants.LIST_ALL_VIDEOS, lv);
				return mapping.findForward(Constants.LIST_VIDEOS);		
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("mensagem",e.getMessage());
			return mapping.findForward(Constants.ADMIN_SAIDA);
		}
		
	}

	public ActionForward updateStatus(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

		MessageResources messageResources = null;
		
		int status  = Integer.parseInt(req.getParameter("status"));
		long videoId = Integer.parseInt(req.getParameter("videoId"));
		try {
			messageResources = getResources(req);
			
			VideoDAO vDAO = DAOFactory.VIDEO_DAO();
			
			Video video = vDAO.buscarVideo(videoId);
			
			if(video != null){
				video.setStatus(status);			
				vDAO.atualizar(video);
				req.setAttribute("mensagem",messageResources.getMessage("msg.statusAtualizado"));
				return new ActionForward("/admin/video.do?act=listAllVideos");
				
			}else{
				req.setAttribute("mensagem","Erro ao obter ID do vídeo");
				return mapping.findForward(Constants.ADMIN_SAIDA);
			}			
			
		} catch (Exception e) {
			req.setAttribute("mensagem",e.getMessage());
			return mapping.findForward(Constants.ADMIN_SAIDA);
		}
		
	}
	
	public ActionForward carregarArquivo(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest request, 
			 HttpServletResponse response) throws Exception {
		
		String idVideo = request.getParameter("video");
		String tipoRequisicao = request.getParameter("tpo");
		
		VideoDAO vDAO = DAOFactory.VIDEO_DAO();					
		Video video =  vDAO.buscarVideo(Long.valueOf(idVideo));
		
		StringBuilder path = new StringBuilder()
		.append(video.getRealPath());
		
		if("video".equalsIgnoreCase(tipoRequisicao)){
			path.append(".flv");
			response.addHeader("Content-Disposition", "attachment; filename=\"" + System.currentTimeMillis() + ".flv\"");
			response.setContentType("video/x-flv");
		}
		else{
			path.append(".jpg");
		}
		
		
		
		InputStream inputStream = new FileInputStream(path.toString());
		OutputStream outputStream = response.getOutputStream();
		int len ; 
		byte[] buf = new byte[1024];  
		while ((len = inputStream.read(buf)) > 0) {  
		  outputStream.write(buf, 0, len);  
		} 
		
		inputStream.close();  
		outputStream.close();
		
		return null;
	
}
}

