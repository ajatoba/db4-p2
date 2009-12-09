package esseecraque.form;

import java.util.Date;

import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Store;

public class AssinanteForm extends ActionForm{

	private Long id;
	private String nome;
	private String email;
	private String password;
	private String confPassword;
	private String aim;
	private String phoneNumber;
	private String cellPhoneNumber;
	private String pais;
	private String nacionalidade;

	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String dataCadastro;
	private String username;	
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
		
	public String getAim() {
		return aim;
	}
	public void setAim(String aim) {
		this.aim = aim;
	}
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}
	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public int getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getConfPassword(){
		return confPassword;
	}
	public void setConfPassword(String confPassword){
		this.confPassword = confPassword;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public String getCidade(){
		return cidade;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getDataCadastro(){
		return dataCadastro;
	}
	
	public void setDataCadastro(String dataCadastro){
		this.dataCadastro = dataCadastro;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		
		ActionErrors errors = new ActionErrors();
		
		if( getEmail() == null || getEmail().length() < 1){
			errors.add("erro.vcEmailAssinante", new ActionMessage("erro.vcEmailAssinante"));
		}
				
		else if( getNome() == null || getNome().length() < 1) {
			errors.add("erro.vcNomeAssinante", new ActionMessage("erro.vcNomeAssinante"));
		}
				
		else if( getCidade() == null || getCidade().length() < 1) {
			errors.add("erro.vcCidadeAssinante", new ActionMessage("erro.vcCidadeAssinante"));
		}
		
		else if( getEstado() == null || getEstado().length() < 1) {
			errors.add("erro.vcEstadoAssinante", new ActionMessage("erro.vcEstadoAssinante"));
		}
		
		else if( getUsername() == null || getUsername().length() < 1) {
			errors.add("erro.vcUsername", new ActionMessage("erro.vcUsername"));
		}
		
		return errors;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		this.email = null;
		this.password = null;
		this.confPassword = null;
		this.nome = null;
		this.endereco = null;
		this.cidade = null;
		this.estado = null;
		this.username = null;
		
	}
	
}
