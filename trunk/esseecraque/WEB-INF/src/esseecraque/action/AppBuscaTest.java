package esseecraque.action;

import java.util.Iterator;
import java.util.List;

import org.apache.lucene.analysis.StopAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.struts.util.MessageResources;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
		
		String keyWord = "nome: Alessandro AND position: ATA AND cidade: Rio de Janeiro";
		
		//if(keyWord==null || keyWord.equals("")){
			//req.setAttribute(Constants.VIDEOS_BUSCA, null);
			//return mapping.findForward(Constants.RESULT_BUSCA);
		//}
		
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MessageResources messageResources = null;
		
		try {
		
			//messageResources = getResources(req);
			
			FullTextSession fullTextSession = Search.getFullTextSession(session);
			Transaction tx = fullTextSession.beginTransaction();

			String[] fields = new String[]{"nome","position", "cidade"};
			MultiFieldQueryParser parser = new MultiFieldQueryParser(fields, new StandardAnalyzer());
			org.apache.lucene.search.Query query = parser.parse(keyWord);

			org.hibernate.Query hibQuery = fullTextSession.createFullTextQuery(query, Assinante.class);

			List result = hibQuery.list();
			
			tx.commit();
			session.close();
			
			System.out.println(result.size());
			
			Iterator it = result.iterator();
			
			
			
			while (it.hasNext()) {
				Assinante element = (Assinante) it.next();
				System.out.println(element.getNome());
			}
			
			
			
			//req.setAttribute(Constants.VIDEOS_BUSCA, result);
			//return mapping.findForward(Constants.RESULT_BUSCA);
			
		} catch (Exception e) {
			e.printStackTrace();
			//req.setAttribute(Constants.VIDEOS_BUSCA, "ERRO NA BUSCA:" +e.getMessage());
			//return mapping.findForward(Constants.RESULT_BUSCA);
			
		}		    
			  
		      

	}
	

}
