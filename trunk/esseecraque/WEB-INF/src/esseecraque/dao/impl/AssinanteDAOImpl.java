package esseecraque.dao.impl;

import org.apache.taglibs.string.SqueezeTag;
import org.hibernate.Query;
import org.hibernate.Session;

import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import esseecraque.bean.Assinante;
import esseecraque.dao.AssinanteDAO;
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
		q.setString("lt", letra);
		List resultado = q.list();
		session.getTransaction().commit();
		return resultado;
	}	
	
	public List<Assinante> search(Assinante assinante){
		
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
				
		String sQuery="SELECT DISTINCT a FROM Assinante a WHERE ";
		
		if(assinante.getNome() != null){
			sQuery += "a.nome LIKE :nome ";
		}else if (assinante.getPosition() !=null) {
			if(assinante.getNome() != null){
				sQuery += " OR ";
			}			
			sQuery += "a.position LIKE :position ";
		}else if (assinante.getCidade()!=null) {
			if(assinante.getNome() != null || assinante.getPosition()!= null){
				sQuery += " OR ";
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
	
}
