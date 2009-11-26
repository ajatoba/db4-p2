package esseecraque.action;

import java.util.List;

import esseecraque.bean.Assinante;
import esseecraque.bean.Video;
import esseecraque.bean.Voto;
import esseecraque.dao.AssinanteDAO;
import esseecraque.dao.DAOFactory;
import esseecraque.dao.VideoDAO;
import esseecraque.dao.VotoDAO;
import esseecraque.util.Constants;

public class AppTest {

	public static void main(String[] args) {

	/**
		int notaUser = 3;
		
		int qtd = 0;
		double nota = 0;
		double media = 0;
		
		
		try{
			
			Voto vt = new Voto();
			
			VotoDAO vtDAO = DAOFactory.VOTO_DAO();
			
			String idVideo_str = "1";
			Long idVideo = Long.parseLong(idVideo_str);
			
			vt = vtDAO.buscarVoto(idVideo);
			Voto v = new Voto();
			if(vt==null){
				
				v.setQtdVoto(1);
				v.setNota(notaUser);
				v.setIdVideo(idVideo);
				v.setMedia(notaUser);
				
				System.out.println("Sem voto ainda - Média: " + v.getMedia());
				
			}else{
				qtd = vt.getQtdVoto();
				nota = vt.getNota();
				
				System.out.println("Nota do Banco: " + nota);
				System.out.println("Nota dada: " + notaUser);
				
				//Voto v = new Voto();
				
				v.setQtdVoto(qtd + 1);
				v.setNota(nota + notaUser);
				v.setIdVideo(idVideo);

				media = Math.ceil(v.getNota()/v.getQtdVoto());
				
				v.setMedia(media);
				
				System.out.println("Total Quantidade: " + v.getQtdVoto());
				System.out.println("Total Nota: " + v.getNota());
				System.out.println("Média: " + v.getMedia());
				System.out.println("Média Sem tratar: " + v.getNota()/v.getQtdVoto());
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	**/
		
	try{
		
		VideoDAO vDAO = DAOFactory.VIDEO_DAO();
		
		List<Video> list = vDAO.buscarUltimosVideos();
		
		for(Video v : list){
			System.out.println("id: " + v.getId() + " - Título: " + v.getTitle());
		}
		
	}catch (Exception e) {
		e.printStackTrace();
	}

	}

}
