package esseecraque.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;
import org.apache.struts.upload.*;

public class VideoForm extends ActionForm{

	private Long id;
	private String title;
	private String description;
	private FormFile file;
	
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
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	
		this.title = null;
	    this.description = null;
	    this.file = null;
	}
	
}
