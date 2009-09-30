package esseecraque.dao;

import esseecraque.dao.impl.AssinanteDAOImpl;
import esseecraque.dao.impl.VideoDAOImpl;


public class DAOFactory {

	public static AssinanteDAOImpl ASSINANTE_DAO(){
		return new AssinanteDAOImpl();
	}
	
	public static VideoDAOImpl VIDEO_DAO(){
		return new VideoDAOImpl();
	}
	
}
