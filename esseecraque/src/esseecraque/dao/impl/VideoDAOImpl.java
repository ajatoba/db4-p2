package esseecraque.dao.impl;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

//import esseecraque.bean.Vid;
import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;
import esseecraque.util.Constants;
import esseecraque.util.HTMLReader;
import esseecraque.util.HibernateUtil;

public class VideoDAOImpl implements VideoDAO{

	private Session session;
		
	public VideoDAOImpl(){
			
	}
		
	public Video salvar(Video video){
		HibernateUtil hu = new HibernateUtil();

		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(video);
		session.getTransaction().commit();
		
		return video;
	}
	
	public List buscarMeusVideos(Long id){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("SELECT v FROM Video v WHERE v.idAssinante=:idSession and v.status=1");
		q.setParameter("idSession", id);
		List resultado = q.list();
		session.getTransaction().commit();
		return resultado;
	}
	
	public List<Video> buscarUltimosVideos(){
		
		
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();		
		
		Query q = session.createQuery("SELECT v FROM Video v ORDER BY v.id DESC LIMIT 0,4");
		//Traz no máximo 4 resultados
		List resultado = q.list();		
		
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
	
	public void removerVideo(Video v){
		
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction(); 
		session.delete(v);
		session.getTransaction().commit();
		
	}
	
	public List<Video> listAllVideos(){

		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction(); 
		Query q = session.createQuery("SELECT v FROM Video v ORDER BY v.dataUpload DESC");
		List<Video> lv = q.list();
		session.getTransaction().commit();
		return lv;
		
	}
	
	
	public void atualizar(Video video){
		HibernateUtil hu = new HibernateUtil();
		session = hu.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(video);
		session.getTransaction().commit();
	}	
		
}
