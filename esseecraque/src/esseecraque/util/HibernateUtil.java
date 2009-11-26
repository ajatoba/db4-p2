package esseecraque.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	
	//private static SessionFactory sessionFactory;
	
	static{
		try{
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		}catch(Throwable ex){
			System.err.println("Criação da SessionFactory inicial falhou. " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	/**
	static {
		try {
			final AnnotationConfiguration cfg = new AnnotationConfiguration();
			sessionFactory = cfg.configure().buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.err.println("Erro: " + e);
		}
	}
	**/
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
}
