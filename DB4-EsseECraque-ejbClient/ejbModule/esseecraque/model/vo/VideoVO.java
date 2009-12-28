package esseecraque.model.vo;

import java.io.Serializable;

public class VideoVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Long idVideo;	
	private Long idAssinante;
	private String arquivoOrigem;
	private String pathDestino;

	private String nomeVideoDestino;
	public Long getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(Long idVideo) {
		this.idVideo = idVideo;
	}
	public Long getIdAssinante() {
		return idAssinante;
	}
	public void setIdAssinante(Long idAssinante) {
		this.idAssinante = idAssinante;
	}
	public String getArquivoOrigem() {
		return arquivoOrigem;
	}
	public void setArquivoOrigem(String arquivoOrigem) {
		this.arquivoOrigem = arquivoOrigem;
	}
	public String getPathDestino() {
		return pathDestino;
	}
	
	/**
	 * Somente path do usuário, não acrescentar o path raiz
	 * @param pathDestino
	 */
	public void setPathDestino(String pathDestino) {
		this.pathDestino = pathDestino;
	}
	
	public String getNomeVideoDestino() {
		return nomeVideoDestino;
	}
	public void setNomeVideoDestino(String nomeVideoDestino) {
		this.nomeVideoDestino = nomeVideoDestino;
	}
	
	
	
	
	
	
	

}
