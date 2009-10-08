package esseecraque.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.lucene.analysis.StopAnalyzer;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.search.Query;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.hibernate.Session;
import org.hibernate.search.FullTextQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;
import esseecraque.util.Constants;
import esseecraque.util.HibernateUtil;

public class BuscaAction extends DispatchAction{

	@SuppressWarnings("unchecked")
	public ActionForward busca(ActionMapping mapping, 
			 ActionForm form, 
			 HttpServletRequest req, 
			 HttpServletResponse resp) throws Exception {

			HttpSession objSession = req.getSession();

			String txt_busca = req.getParameter("busca");
			
			try{
				
				final Session session = HibernateUtil.getSessionFactory().openSession();
				final FullTextSession ftSession = Search.getFullTextSession(session);
				final List<Video> videos = session.createCriteria(Video.class).list();
			
				for(Video v : videos) {
					ftSession.index(v);
				}
			
				
				final String[] stopWords = {"de","do","da","dos","das","a","o","na","no","em"};    
		    	final MultiFieldQueryParser parser = new MultiFieldQueryParser(new String[]{"assinante.nome","title","description"} , new StopAnalyzer(stopWords));
		    	final Query query = parser.parse(txt_busca);
		    	final FullTextQuery fullTextQuery = ftSession.createFullTextQuery(query, Video.class);
		    	
		    	final List<Video> list = fullTextQuery.list();
		    	
		    	
		    	HibernateUtil.getSessionFactory().close();
		    		    
				objSession.setAttribute(Constants.BUSCA_SESSION, list);
		    
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return mapping.findForward(Constants.RESULT_BUSCA);
	}
	
}
