package esseecraque.model.vo;

import java.io.Serializable;

public class EmailVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7476120192582751779L;

	private String remetente;
	
	private String destinatario;
	
	private String titulo;
	
	private String corpo;

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	
	

}
