package esseecraque.dao.impl;

import org.apache.lucene.analysis.StopAnalyzer;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.taglibs.string.SqueezeTag;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.search.FullTextQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.dao.AssinanteDAO;
import esseecraque.util.Constants;
import esseecraque.util.HibernateUtil;


public class AssinanteDAOImpl implements AssinanteDAO{

	private Session session;
	
	public AssinanteDAOImpl(){
		
	}
	
	public void salvar(Assinante assinante){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(assinante);
		session.getTransaction().commit();
	}
	
	public void atualizar(Assinante assinante){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(assinante);
		session.getTransaction().commit();
	}
	
	public List loginAssinante(String e, String p){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT assinante FROM Assinante assinante WHERE assinante.email=:txtemail AND assinante.password=:txtpassword");
		q.setParameter("txtemail", e);
		q.setParameter("txtpassword", p);
		List resultado = q.list();
		session.getTransaction().commit();
		return resultado;
		
	}
	
	public List buscarAssinante(int idAssinante){

		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT a FROM Assinante a WHERE a.id=:id");
		q.setInteger("id", idAssinante);
		List resultado = q.list();
		session.getTransaction().commit();
		return resultado;
	}
	
	public List buscarAssinanteLetra(String letra){

		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT DISTINCT a FROM Assinante a WHERE a.nome LIKE :lt ORDER BY a.nome");
		q.setString("lt", "%"+letra);
		List resultado = q.list();
		session.getTransaction().commit();
		return resultado;
	}	
	
	/*
	public List<Assinante> search(Assinante assinante){
		
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
				
		String sQuery="SELECT DISTINCT a FROM Assinante a WHERE ";
		
		if(assinante.getNome() != null){
			sQuery += "a.nome LIKE :nome ";
		}else if (assinante.getPosition() !=null) {
			if(assinante.getNome() != null){
				sQuery += " AND ";
			}			
			sQuery += "a.position LIKE :position ";
		}else if (assinante.getCidade()!=null) {
			if(assinante.getNome() != null || assinante.getPosition()!= null){
				sQuery += " AND ";
			}
			sQuery += "a.cidade LIKE :cidade ";
		}
		
		sQuery += "ORDER BY a.nome";
		
		Query q = session.createQuery(sQuery);
		
		if(assinante.getNome() != null){
			q.setString("nome", "%"+assinante.getNome()+"%");
		}else if (assinante.getPosition() !=null) {
			q.setString("position", "%"+assinante.getPosition()+"%");
		}else if (assinante.getCidade()!=null) {
			q.setString("cidade", "%"+assinante.getCidade()+"%");
		}
		
		List<Assinante> resultado = q.list();
		session.getTransaction().commit();
		return resultado;
	}
	*/
	
	public List<Assinante> search(Assinante assinanteB) {

		Session session 				= null;
		FullTextSession ftSession 		= null;
		List<Assinante> assinantes 		= null;
		List<Assinante> list			=null;
		
			try{
				
				session = HibernateUtil.getSessionFactory().openSession();
				ftSession = Search.getFullTextSession(session);
				assinantes = session.createCriteria(Assinante.class).list();
							
				for(Assinante a : assinantes) {
					ftSession.index(a);
				}
				
				System.out.println(assinanteB.getNome() + "-" + assinanteB.getCidade() + "-" + assinanteB.getPosition());
				
				final String[] stopWords = {"de","do","da","dos","das","a","o","na","no","em"};    
		    	final MultiFieldQueryParser parser = new MultiFieldQueryParser(new String[]{"nome","position","cidade"} , new StopAnalyzer(stopWords));
		    	final org.apache.lucene.search.Query query = parser.parse(assinanteB.getNome());
		    	
		    	final FullTextQuery fullTextQuery = ftSession.createFullTextQuery(query, Assinante.class);
		    	
		    	list = fullTextQuery.list();
		    	
		    	
		    	HibernateUtil.getSessionFactory().close();
		    	
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return list;
	}
	
	
	public Assinante remindPassword(String email){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT assinante FROM Assinante assinante WHERE assinante.email=:txtemail");
		q.setParameter("txtemail", email);
		
		Assinante a = (Assinante) q.setParameter("txtemail", email).uniqueResult();
		session.getTransaction().commit();
		
		return a;
		
	}
}
