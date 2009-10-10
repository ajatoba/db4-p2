package esseecraque.action;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.annotations.Entity;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.util.HibernateUtil;

public class AtualizaIndice {

	public void refreshIndex(final Class entityClass) {		
			
				Session session = HibernateUtil.getSessionFactory().openSession();

				FullTextSession fullTextSession = Search.getFullTextSession(session);

				Criteria crit = session.createCriteria(entityClass);

				for (Object obj : crit.list()) {
					fullTextSession.index(obj);
				}
		
			}
	
	public static void main(final String[] args) throws Exception {
		
		AtualizaIndice ai = new AtualizaIndice();
		
		ai.refreshIndex(Assinante.class);
		ai.refreshIndex(Video.class);
		
	}

}
