package esseecraque.action;

import java.util.List;

import esseecraque.bean.Vid;
import esseecraque.bean.Video;
import esseecraque.bean.Voto;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;
import esseecraque.dao.VotoDAO;
import esseecraque.util.Constants;

public class AppTest {

	public static void main(String[] args) {

		int notaUser = 5;
		
		int qtd = 0;
		double nota = 0;
		double media = 0;
		
		
		try{
			
			Voto vt = new Voto();
			
			VotoDAO vtDAO = DAOFactory.VOTO_DAO();
			
			String idVideo_str = "2";
			Long idVideo = Long.parseLong(idVideo_str);
			
			vt = vtDAO.buscarVoto(idVideo);
			
			if(vt==null || vt.equals("")){
				vt.setQtdVoto(1);
				vt.setNota(notaUser);
				vt.setIdVideo(idVideo);
				vt.setMedia(notaUser);
			}else{
				qtd = vt.getQtdVoto();
				nota = vt.getNota();
				
				vt.setQtdVoto(qtd + 1);
				vt.setNota(nota + notaUser);
				vt.setIdVideo(idVideo);

				media = Math.ceil(vt.getNota()/vt.getQtdVoto());
				
				vt.setMedia(media);
				
			}
			
			System.out.println("Média: " + vt.getMedia());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
