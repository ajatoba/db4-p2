package esseecraque.form;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.struts.action.ActionForm;

public class VotoForm extends ActionForm{
	
	private Long id;
	private int qtdVoto;
	private double nota;
	private Long idVideo;
	private double media;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(Long idVideo) {
		this.idVideo = idVideo;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getQtdVoto() {
		return qtdVoto;
	}
	public void setQtdVoto(int qtdVoto) {
		this.qtdVoto = qtdVoto;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
}
