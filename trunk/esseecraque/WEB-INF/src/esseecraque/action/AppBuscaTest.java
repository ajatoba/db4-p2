package esseecraque.action;

import java.util.List;

import org.apache.lucene.analysis.StopAnalyzer;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
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


public class AppBuscaTest {


	@SuppressWarnings("unchecked")
	public static void main(final String[] args) throws Exception {
		
		try{
			
			final Session session = HibernateUtil.getSessionFactory().openSession();
			final FullTextSession ftSession = Search.getFullTextSession(session);
			//final List<Assinante> assinantes = session.createCriteria(Assinante.class).list();
			final List<Video> videos = session.createCriteria(Video.class).list();
		
			//for(Assinante a : assinantes) {
				//ftSession.index(a);
			//}
		
			for(Video v : videos) {
				ftSession.index(v);
			}
		
			
			final String[] stopWords = {"de","do","da","dos","das","a","o","na","no","em"};    
	    	final MultiFieldQueryParser parser = new MultiFieldQueryParser(new String[]{"Video.assinante.nome","Video.description"} , new StopAnalyzer(stopWords));
	    	final Query query = parser.parse("Moraes Flamengo");
	    	final FullTextQuery fullTextQuery = ftSession.createFullTextQuery(query, Video.class);
	    	
	    	//TermQuery query = new TermQuery(new Term("Video.assinante.nome", "Moraes"));
	    	//FullTextQuery fullTextQuery = ftSession.createFullTextQuery(query, Video.class);
	    	
	    	final List<Video> list = fullTextQuery.list();
	    	
	    	
	    	HibernateUtil.getSessionFactory().close();
	    		    
			
			if (list==null || list.size()==0){
				System.out.println("Nenhum Vídeo encontrado.");
			}else{
			
				//for(Assinante a : list) {
					//System.out.println(a.getNome());
					//for (Video v : a.getVideos()) {
					for (Video v : list) {
						System.out.println("   " + v.getTitle());
					}
				//}
				
			}
	    
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
