package esseecraque.form;

import org.apache.struts.action.ActionForm;

public class PerfilForm extends ActionForm {

	private double height;
	private double weight;
	private String position;
	private String comment;
	private boolean showEmail;
	private boolean showPhone;
	private boolean showAim;
	private boolean showCellPhone;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public boolean isShowEmail() {
		return showEmail;
	}
	public void setShowEmail(boolean showEmail) {
		this.showEmail = showEmail;
	}
	public boolean isShowPhone() {
		return showPhone;
	}
	public void setShowPhone(boolean showPhone) {
		this.showPhone = showPhone;
	}
	public boolean isShowAim() {
		return showAim;
	}
	public void setShowAim(boolean showAim) {
		this.showAim = showAim;
	}
	public boolean isShowCellPhone() {
		return showCellPhone;
	}
	public void setShowCellPhone(boolean showCellPhone) {
		this.showCellPhone = showCellPhone;
	}
	
	
	
}
