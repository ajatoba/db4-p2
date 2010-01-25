package esseecraque.model.dao;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import esseecraque.model.vo.VideoVO;

public interface EsseECraqueDAO {
	
	public void atualizaVideo(VideoVO videoVO)  throws SQLException, NamingException ;
	
	public String consultaEmailAssinante(long codigoAssinante)  throws SQLException, NamingException ;
	
	public String consultaPathArquivo(long idVideo)  throws SQLException, NamingException ;
	
	public List<VideoVO>  listaUltimosVideos() throws SQLException,NamingException;

}
