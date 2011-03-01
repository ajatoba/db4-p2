package esseecraque.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;
import org.hibernate.CacheMode;
import org.hibernate.FlushMode;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.util.Constants;
import esseecraque.util.HibernateUtil;

public class UpdateIndexAction extends DispatchAction{

	public ActionForward updateAssinanteIndex(ActionMapping mapping, 
			ActionForm form, 
			HttpServletRequest req, 
			HttpServletResponse resp) throws Exception {
		
		int BATCH_SIZE = 10*1024;//Integer.parseInt((String) System.getProperty("batch_size"))*1024;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		FullTextSession fullTextSession = Search.getFullTextSession(session);
		Transaction transaction = fullTextSession.beginTransaction();
		MessageResources messageResources = null;
		
		try {
		
			messageResources = getResources(req);
			fullTextSession.setFlushMode(FlushMode.MANUAL);
			fullTextSession.setCacheMode(CacheMode.IGNORE);
			transaction = fullTextSession.beginTransaction();
			
			ScrollableResults results = fullTextSession.createCriteria( Assinante.class )
			    .setFetchSize(BATCH_SIZE)
			    .scroll( ScrollMode.FORWARD_ONLY );
			int index = 0;
			while( results.next() ) {
			    index++;
			    fullTextSession.index( results.get(0) ); //index each element
			    if (index % BATCH_SIZE == 0) {
			        fullTextSession.flushToIndexes(); //apply changes to indexes
			        fullTextSession.clear(); //clear since the queue is processed
			    }
			}
			transaction.commit();
			
			req.setAttribute("mensagem",messageResources.getMessage("indice_atualizado"));
			return mapping.findForward(Constants.UPDATE_INDEX_OUT);
			
		}catch(Exception e){
			e.printStackTrace();
			req.setAttribute("mensagem",e.getMessage());
			return mapping.findForward(Constants.UPDATE_INDEX_OUT);
			
		}
		
	
	}

	public ActionForward updateVideoIndex(ActionMapping mapping, 
			ActionForm form, 
			HttpServletRequest req, 
			HttpServletResponse resp) throws Exception {
		
		int BATCH_SIZE = 10*1024;//Integer.parseInt((String) System.getProperty("batch_size"))*1024;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		FullTextSession fullTextSession = Search.getFullTextSession(session);
		Transaction transaction = fullTextSession.beginTransaction();
		MessageResources messageResources = null;
		
		try {
		
			messageResources = getResources(req);
			fullTextSession.setFlushMode(FlushMode.MANUAL);
			fullTextSession.setCacheMode(CacheMode.IGNORE);
			transaction = fullTextSession.beginTransaction();
			
			ScrollableResults results = fullTextSession.createCriteria( Video.class )
			    .setFetchSize(BATCH_SIZE)
			    .scroll( ScrollMode.FORWARD_ONLY );
			int index = 0;
			while( results.next() ) {
			    index++;
			    fullTextSession.index( results.get(0) ); //index each element
			    if (index % BATCH_SIZE == 0) {
			        fullTextSession.flushToIndexes(); //apply changes to indexes
			        fullTextSession.clear(); //clear since the queue is processed
			    }
			}
			transaction.commit();
			
			req.setAttribute("mensagem",messageResources.getMessage("indice_atualizado"));
			return mapping.findForward(Constants.UPDATE_INDEX_OUT);
			
		}catch(Exception e){
			e.printStackTrace();
			req.setAttribute("mensagem",e.getMessage());
			return mapping.findForward(Constants.UPDATE_INDEX_OUT);
			
		}
		
	
	}

	
}
