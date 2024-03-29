package esseecraque.dao;

import java.util.List;

import esseecraque.bean.Video;

public interface VideoDAO {

	public abstract Video salvar(Video video);
	
	public abstract List buscarMeusVideos(Long id);
	
	public abstract List buscarUltimosVideos();
	
	public abstract Long qtdVideo(int idAssinante);
	
	public abstract Video buscarVideo(Long id);
	
	public abstract void removerVideo(Video v);

	public abstract List<Video> listAllVideos();
	
	public abstract void atualizar(Video video);
}
