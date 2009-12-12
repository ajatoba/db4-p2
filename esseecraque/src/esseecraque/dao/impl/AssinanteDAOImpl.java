package esseecraque.dao.impl;

import org.apache.lucene.analysis.StopAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.taglibs.string.SqueezeTag;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.search.FullTextQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.jboss.virtual.plugins.context.vfs.AssembledDirectoryHandler;

import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import esseecraque.bean.Assinante;
import esseecraque.bean.Clube;
import esseecraque.bean.Torneio;
import esseecraque.bean.Video;
import esseecraque.dao.AssinanteDAO;
import esseecraque.dao.DAOFactory;
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
	
	public Assinante loginAssinante(String e, String p){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();		
		Query q = session.createQuery("SELECT a FROM Assinante a WHERE a.email= :txtemail AND a.password=:txtpassword");
		q.setString("txtemail", e);
		q.setString("txtpassword", p);
		Assinante resultado = (Assinante)q.uniqueResult();
		
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

		Session session = HibernateUtil.getSessionFactory().openSession();
				
		FullTextSession fullTextSession = Search.getFullTextSession(session);
		Transaction tx = fullTextSession.beginTransaction();

		BooleanQuery query = new BooleanQuery();  
		
		PrefixQuery pQuery = new PrefixQuery(new Term("nome",letra));
		
		query.add(pQuery, Occur.SHOULD);
		
		org.hibernate.Query hibQuery = fullTextSession.createFullTextQuery(query, Assinante.class);

		List result = hibQuery.list();
		
		tx.commit();
		session.close();
		
		return result;
		
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
	
	public int deleteClubesAssinante(Assinante assinante){
		
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		/*
		Query q = session.createQuery("SELECT c FROM Clube c WHERE c.assinante.id=:idAssinante");
		
		q.setParameter("idAssinante", assinante.getId());
		
		List resultado = q.list();
		*/
		Set<Clube> resultado = assinante.getClubes();
		Iterator<Clube> it = resultado.iterator();
		//Clube c = null;
		
		System.out.println("DELETANDO CLUBES");
		
		while (it.hasNext()) {
			//c = (Clube) it.next();
			session.delete(it.next());
		}
		
		session.getTransaction().commit();
		
		return resultado.size();
		
	}
	
	public int deleteTorneiosAssinante(Assinante assinante){
		
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Set<Torneio> resultado = assinante.getTorneios();
		Iterator<Torneio> it = resultado.iterator();
		
		while (it.hasNext()) {
			session.delete(it.next());
		}
		
		session.getTransaction().commit();
		
		return resultado.size();
		
	}
	
	public static void main (String[] x){
		
		AssinanteDAO aDAO = DAOFactory.ASSINANTE_DAO();		
		
		Assinante a = null; 
		/*
		
		a = new Assinante();
		
		a.setNome("Alessandro Jatobbá");
		a.setEmail("jatoba@jatoba.org");
		a.setPassword("jatoba");
		a.setBirthDate("1977-08-24");
		a.setEndereco("teste");
		a.setCidade("Rio de Janeiro");
		a.setPais("Brasil");
		a.setCep("212221");
		a.setEstado("Rio de Janeiro");
		a.setNacionalidade("Brasileiro");
		a.setPhoneNumber("21-3259-0955");
		a.setCellPhoneNumber("21-9124-7740");
		a.setDataCadastro("2009-10-10");
		*/
		a = aDAO.loginAssinante("jatoba@jatoba.org", "jatoba");
		
		try {
			aDAO.deleteClubesAssinante(a);
			
			Set<Clube> clubes = new HashSet<Clube>();
			Clube c1 = new Clube();
			c1.setName("novo clube");
			c1.setCity("Flamengo");
			c1.setStartYear(2003);
			c1.setEndYear(2009);
			c1.setAssinante(a);
			
			Clube c2 = new Clube();
			c2.setName("novo clube");
			c2.setCity("Botafogo");
			c2.setStartYear(2003);
			c2.setEndYear(2009);
			c2.setAssinante(a);
			
			clubes.add(c1);
			clubes.add(c2);
			
			a.setClubes(clubes);
			aDAO.atualizar(a);
			//aDAO.salvar(a);
			System.out.println("ASsinante Atualizado");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
