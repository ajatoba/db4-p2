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
