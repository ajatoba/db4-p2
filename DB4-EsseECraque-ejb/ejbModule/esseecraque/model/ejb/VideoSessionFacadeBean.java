package esseecraque.model.ejb;

import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.naming.NamingException;

import org.jboss.ejb3.annotation.RemoteBinding;

import esseecraque.model.dao.EsseECraqueDAO;
import esseecraque.model.dao.MYSQLEsseECraqueDAO;
import esseecraque.model.util.LoggerUtil;
import esseecraque.model.vo.VideoVO;

/**
 * Session Bean implementation class VideoSessionFacade
 */
@Stateless
@RemoteBinding(jndiBinding = VideoSessionFacadeRemote.REMOTE)
public class VideoSessionFacadeBean implements VideoSessionFacadeRemote {

	@Resource(mappedName = "ConnectionFactory")
	private ConnectionFactory factory = null;

	@Resource(mappedName = "queue/VideoSender")
	private Destination destination = null;

	private Connection conn = null;

	/**
	 * Default constructor.
	 */
	public VideoSessionFacadeBean() {
		super();
	}

	public void gravarVideo(VideoVO video) {		
		sendJms(video);
	}
	
	public String getPathArquivo(Long idVideo){
		EsseECraqueDAO dao = new MYSQLEsseECraqueDAO();
		try {
			return dao.consultaPathArquivo(idVideo);
		} catch (SQLException e) {
			LoggerUtil.error(e.getMessage(), e);
		} catch (NamingException e) {
			LoggerUtil.error(e.getMessage(), e);
		}
		return null;
		
	}
		

	@SuppressWarnings("unused")
	@PostConstruct
	public void postConstruct() {
		try {
			conn = factory.createConnection();
		} catch (JMSException e) {
			LoggerUtil.error(e.getMessage(), e);
		}
	}

	@SuppressWarnings("unused")
	@PreDestroy
	public void preDestroy() {
		LoggerUtil.debug("VideoSessionFacadeBean @PreDestroy");
		if (conn != null) {
			try {
				conn.close();
			} catch (JMSException e) {
				LoggerUtil.error(e.getMessage(), e);
			}
		}

	}

	
	
	private void sendJms(VideoVO videoVO) {
		Session session = null;
		MessageProducer sender = null;

		try {
			session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			sender = session.createProducer(destination);

			ObjectMessage msg = session.createObjectMessage(videoVO);
			sender.send(msg);
			

		} catch (JMSException e) {			
			e.printStackTrace();
		} finally {
			try {
				if (session != null) {
					session.close();
				}

				if (sender != null) {
					sender.close();
				}
			} catch (JMSException e) {
				LoggerUtil.error(e.getMessage(), e);
			}
		}
	}

}
