package esseecraque.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Store;

@Entity
@Table(name = "TBL_VOTO")
public class Voto implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NR_ID_VOTO")
	private Long id;
	@Column(name="NR_QTD_VOTO")
	private int qtdVoto;
	@Column(name="NR_NOTA_VOTO")
	private double nota;
	@Column(name="NR_ID_VIDEO_FK")
	private Long idVideo;
	@Column(name="NR_MEDIA")
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
