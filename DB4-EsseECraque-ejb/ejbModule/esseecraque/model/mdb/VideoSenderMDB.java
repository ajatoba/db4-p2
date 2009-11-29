
package esseecraque.model.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJBException;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import esseecraque.model.ejb.Video;
import esseecraque.model.util.LoggerUtil;
import esseecraque.model.vo.VideoVO;


 @MessageDriven( name="VIDEOMDB", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"), 
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/VideoSender")
})
public class VideoSenderMDB implements MessageListener
{

    
    public void onMessage(Message msg)
    {
    	LoggerUtil.info("Processando fila JMS(queue/VideoSender)");
        try
        {
            ObjectMessage objectMessage = (ObjectMessage) msg;
            VideoVO videoVO = (VideoVO) objectMessage.getObject();
            Video video = new Video();
            video.gravarVideo(videoVO); 
        }
        catch(JMSException e)
        {
            LoggerUtil.error("Erro ao tentar processar o request", e);
            throw new EJBException("Erro ao tentar processar o request", e);
        }
        finally{
        	LoggerUtil.info("Liberando fila JMS(queue/VideoSender)");
        }

    }
}
