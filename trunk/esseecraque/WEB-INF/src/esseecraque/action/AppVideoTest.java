package esseecraque.action;

import java.util.List;

import esseecraque.bean.Video;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;

public class AppVideoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			
			VideoDAO vDAO = DAOFactory.VIDEO_DAO();
		
			List<Video> lv = vDAO.buscarUltimosVideos();
		
			for(Video v : lv){
				System.out.println("ID: " + v.getId() + " - " + v.getTitle());
			}
			
		}catch(Exception e){
			e.getStackTrace();
			System.out.println("Exception: " + e);
			e.printStackTrace();
		}

	}

}
