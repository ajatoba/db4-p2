package esseecraque.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Store;

@Entity
@Table(name = "TBL_VIDEO")
@Indexed
public class Video implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NR_ID_VIDEO_PK")
	private Long id;
	@Column(name="VC_TITLE")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private String title;
	@Column(name="VC_DESCRIPTION")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private String description;
	@Column(name="VC_URL")
	private String url;
	@Column(name="VC_REAL_PATH")
	private String realPath;
	@Column(name="NR_ID_ASSINANTE")
	private Long idAssinante;
	@Column(name="DT_DATE_UPLOAD")
	private String dataUpload;
	@Column(name="VC_PATH_IMAGE")
	private String pathImage;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="NR_ID_ASSINANTE", insertable=false, updatable=false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Assinante assinante;
	
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getUrl(){
		return url;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getRealPath(){
		return realPath;
	}
	public void setRealPath(String realPath){
		this.realPath = realPath;
	}
	public Long getIdAssinante(){
		return idAssinante;
	}
	public void setIdAssinante(Long idAssinante){
		this.idAssinante = idAssinante;
	}
	public String getDataUpload(){
		return dataUpload;
	}
	public void setDataUpload(String dataUpload){
		this.dataUpload = dataUpload;
	}
	public String getPathImage() {
		return pathImage;
	}
	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}
}
