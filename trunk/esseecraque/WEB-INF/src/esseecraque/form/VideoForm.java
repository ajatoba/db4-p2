package esseecraque.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class VideoForm extends ActionForm{

	private Long id;
	private String title;
	private String description;
	private String url;
	private String realPath;
	private Long idAssinante;
	private String dataUpload;
	private String pathImage;
	
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
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	
		this.title = null;
	    this.description = null;
	    this.url = null;
	    this.realPath = null;
	    this.pathImage = null;
	}
}
