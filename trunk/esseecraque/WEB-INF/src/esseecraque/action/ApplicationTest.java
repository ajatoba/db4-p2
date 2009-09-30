package esseecraque.action;

import java.util.List;

import org.apache.lucene.analysis.StopAnalyzer;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.search.Query;
import org.apache.struts.util.MessageResources;
import org.hibernate.Session;
import org.hibernate.search.FullTextQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import esseecraque.bean.Assinante;  
import esseecraque.bean.Video;
import esseecraque.util.Constants;
import esseecraque.util.HibernateUtil;

import esseecraque.bean.Assinante;
import esseecraque.dao.AssinanteDAO;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;
import esseecraque.form.AssinanteForm;
import esseecraque.form.AssinanteLoginForm;


public class ApplicationTest {


	@SuppressWarnings("unchecked")
	public static void main(final String[] args) throws Exception {
		final Session session = HibernateUtil.getSessionFactory().openSession();
		final FullTextSession ftSession = Search.getFullTextSession(session);
		final List<Assinante> assinantes = session.createCriteria(Assinante.class).list();
		final List<Video> videos = session.createCriteria(Video.class).list();
		
		for(Assinante a : assinantes) {
			ftSession.index(a);
		}
		
		for(Video v : videos) {
			ftSession.index(v);
		}
		
	    final String[] stopWords = {"de","do","da","dos","das","a","o","na","no","em"};    
//	    final QueryParser parser = new QueryParser("nome",new StopAnalyzer(stopWords));
	    final MultiFieldQueryParser parser = new MultiFieldQueryParser(new String[]{"nome","Videos.description"} , new StopAnalyzer(stopWords));
	    final Query query = parser.parse("Flamengo Moraes");
	    final FullTextQuery fullTextQuery = ftSession.createFullTextQuery(query, Assinante.class);
	    final List<Assinante> list = fullTextQuery.list();
	    HibernateUtil.getSessionFactory().close();
	    
	    for(Assinante a : list) {
	    	System.out.println(a.getNome());
	    	for (Video v : a.getVideos()) {
	            System.out.println("   " + v.getTitle());
	        }
	    }
	    
	}
	

}
