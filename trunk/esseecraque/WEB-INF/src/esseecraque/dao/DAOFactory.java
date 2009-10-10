package esseecraque.dao;

import esseecraque.dao.impl.AssinanteDAOImpl;
import esseecraque.dao.impl.VideoDAOImpl;
import esseecraque.dao.impl.VotoDAOImpl;


public class DAOFactory {

	public static AssinanteDAOImpl ASSINANTE_DAO(){
		return new AssinanteDAOImpl();
	}
	
	public static VideoDAOImpl VIDEO_DAO(){
		return new VideoDAOImpl();
	}
	
	public static VotoDAOImpl VOTO_DAO(){
		return new VotoDAOImpl();
	}
	
}
