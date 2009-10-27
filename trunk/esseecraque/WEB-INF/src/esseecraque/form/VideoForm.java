package esseecraque.form;

import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;
import org.apache.struts.upload.*;

public class VideoForm extends ActionForm{

	private Long id;
	private String title;
	private String description;
	private FormFile file;
	private String tagVideo;
	private int status;
	
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
	
	public FormFile getFile() {
		return file;
	}
	public void setFile(FormFile file) {
		this.file = file;
	}
	
	public String getTagVideo() {
		return tagVideo;
	}
	
	public void setTagVideo(String tagVideo) {
		this.tagVideo = tagVideo;
	}
		
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	
		this.title = null;
	    this.description = null;
	    this.file = null;
	}
	
}
