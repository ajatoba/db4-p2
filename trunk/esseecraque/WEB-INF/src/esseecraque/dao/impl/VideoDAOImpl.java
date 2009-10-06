package esseecraque.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import esseecraque.bean.Vid;
import esseecraque.bean.Video;
import esseecraque.dao.VideoDAO;
import esseecraque.util.HibernateUtil;

public class VideoDAOImpl implements VideoDAO{

	private Session session;
		
	public VideoDAOImpl(){
			
	}
		
	public void salvar(Video video){
		HibernateUtil hu = new HibernateUtil();

		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(video);
		session.getTransaction().commit();
	}
	
	public List buscarMeusVideos(Long id){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT v FROM Video v WHERE v.idAssinante=:idSession");
		q.setParameter("idSession", id);
		List resultado = q.list();
		session.getTransaction().commit();
		return resultado;
	}
	
	public List buscarUltimosVideos(){

		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction(); 
			//Criteria criteria = session.createCriteria(Vid.class);
			//criteria.addOrder(Order.desc("id"));
			//List<Vid> resultado = (List<Vid>)criteria.setMaxResults(2);
			//List<Vid> resultado = (List)criteria.setMaxResults(2);
			//List listResul = criteria.setMaxResults(2).list();
			
			
		Query q = session.createQuery("SELECT v FROM Vid v ORDER BY v.id DESC LIMIT 0,2");
		List<Vid> resultado = q.list();
		
		session.getTransaction().commit();
			
		return resultado;
		
	}
	
	public Video buscarVideo(Long id){

		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction(); 
		Query q = session.createQuery("SELECT v FROM Video v WHERE v.id=:idVideo");
		q.setParameter("idVideo", id);
		Video v = (Video)q.uniqueResult();
		session.getTransaction().commit();
		return v;
		
	}
	
	public Long qtdVideo(int idAssinante){
		
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT COUNT(v.idAssinante) FROM Video v WHERE v.idAssinante=:idAssinante");
		q.setInteger("idAssinante", idAssinante);
		Long qtdVideo = (Long)q.uniqueResult();
		return qtdVideo;
		
	}
	
	public List buscarVideosLaterais(){

		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction(); 
		Query q = session.createQuery("SELECT v FROM Video v");
		List<Vid> lv = q.list();
		session.getTransaction().commit();
		return lv;
		
	}
	
}
