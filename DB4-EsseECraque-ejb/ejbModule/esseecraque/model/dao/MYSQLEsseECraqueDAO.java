package esseecraque.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import esseecraque.model.util.LoggerUtil;
import esseecraque.model.vo.VideoVO;

public class MYSQLEsseECraqueDAO implements EsseECraqueDAO {
	
	private Connection conn;

	private static final String DSNAME = "java:/jdbc/esseecraque";	
	private static  InitialContext CONTEXT;
	
	
	private InitialContext getContext() throws NamingException{
		if(CONTEXT == null) {
			CONTEXT = new InitialContext();
		}
		return CONTEXT;
	}
	

    

    private void openConnection() throws SQLException, NamingException 
    {        
        DataSource ds = (DataSource) getContext().lookup(DSNAME);
        conn = ds.getConnection();      
       
    }

    public void closeConnection()
    {
        try
        {
            if(conn != null)
            {
                conn.close();
            }
        }
        catch(Exception e)
        {
            LoggerUtil.error("close: conn.close falhou" , e);
        }
    }

    protected void closeAll(ResultSet rs, Statement stmt)
    {
        try
        {
            if(rs != null)
            {
                rs.close();
            }
        }
        catch(Exception e)
        {
            LoggerUtil.error("closeAll: resultSet.close falhou" ,e);
        }

        try
        {
            if(stmt != null)
            {
                stmt.close();
            }
        }
        catch(Exception e)
        {
            LoggerUtil.error("closeAll: stmt.close falhou" ,e);
        }
    }

	@Override
	public void atualizaVideo(VideoVO videoVO) throws SQLException, NamingException {
		
		PreparedStatement psmt = null;		
		try {
  
			openConnection();
			psmt = conn.prepareStatement("UPDATE TBL_VIDEO SET NR_STATUS = 1,VC_PATH_IMAGE = ? WHERE NR_ID_VIDEO_PK = ?");			
			psmt.setString(1, "player.do?act=carregarArquivo&tpo=imagem&video=".concat(String.valueOf(videoVO.getIdVideo())));
			
			psmt.setLong(2, videoVO.getIdVideo());
			
			psmt.executeUpdate();	
		
		}finally{			
			closeConnection();			
		}
	}

	@Override
	public String consultaEmailAssinante(long codigoAssinante)  throws SQLException, NamingException  {
		
		Statement stmt = null;
		
		try {
			
			openConnection();
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT VC_EMAIL_ASSINANTE FROM TBL_ASSINANTE WHERE NR_ID_ASSINANTE = ".concat(String.valueOf(codigoAssinante)));			 
			 
			if(rs.next()){
				return rs.getString("VC_EMAIL_ASSINANTE");
			}
						
			return null;			
		
		}finally{			
			closeConnection();			
		}
	}
	
	@Override
	public String consultaPathArquivo(long idVideo) throws SQLException, NamingException {
		
		Statement stmt = null;
		
		StringBuilder sql = new StringBuilder()
		.append("SELECT NR_ID_VIDEO_PK,VC_TITLE,VC_DESCRIPTION,VC_URL,VC_REAL_PATH,NR_ID_ASSINANTE,")
        .append("NR_STATUS,DT_DATE_UPLOAD,VC_PATH_IMAGE,VC_TAG ") 
        .append("FROM TBL_VIDEO ")
        .append("WHERE NR_ID_VIDEO_PK = ")
        .append(idVideo);
		
		try {
			
			openConnection();
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql.toString());			 
			 
			if(rs.next()){
				return rs.getString("VC_REAL_PATH");				
			}
						
			return null;			
		
		}finally{			
			closeConnection();			
		}
	}
	
	@Override
	public List<VideoVO> listaUltimosVideos() throws SQLException, NamingException {
		
		Statement stmt = null;
		
		List<VideoVO> lista = new ArrayList<VideoVO>();
		
		try {
			
			openConnection();
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT  NR_ID_VIDEO_PK,VC_DESCRIPTION,DT_DATE_UPLOAD,VC_PATH_IMAGE FROM TBL_VIDEO WHERE NR_STATUS = 1 ORDER BY NR_ID_VIDEO_PK DESC LIMIT 0,4");			 
			 
			while(rs.next()){
				
				VideoVO video = new VideoVO();
				
				video.setIdVideo(rs.getLong("NR_ID_VIDEO_PK"));
				video.setDescricao(rs.getString("VC_DESCRIPTION"));
				video.setData(rs.getDate("DT_DATE_UPLOAD"));
				video.setPathImage(rs.getString("VC_PATH_IMAGE"));
				lista.add(video);			
			}
						
			return lista;			
		
		}finally{			
			closeConnection();			
		}		
	}

}
