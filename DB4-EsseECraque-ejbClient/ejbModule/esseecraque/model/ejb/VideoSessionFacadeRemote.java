package esseecraque.model.ejb;
import javax.ejb.Remote;

import esseecraque.model.vo.VideoVO;

@Remote
public interface VideoSessionFacadeRemote {
	
	public static String REMOTE = "ejb/VideoSessionFacadeBean/remote";
	
	public void gravarVideo(VideoVO video);	
	
	public String getPathArquivo(Long idVideo);
	
}
