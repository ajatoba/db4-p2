package esseecraque.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import esseecraque.bean.Voto;
import esseecraque.dao.VotoDAO;
import esseecraque.util.HibernateUtil;

public class VotoDAOImpl implements VotoDAO{

private Session session;
	
	public VotoDAOImpl(){
		
	}
	
	public void salvar(Voto voto){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(voto);
		session.getTransaction().commit();
	}
	
	public Voto buscarVoto(Long idVideo){

		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT vt FROM Voto vt WHERE vt.idVideo=:id");
		q.setParameter("id", idVideo);
		Voto resultado = (Voto)q.uniqueResult();
		session.getTransaction().commit();
		return resultado;
	}
	
}
