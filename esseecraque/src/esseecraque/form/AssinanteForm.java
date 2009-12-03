package esseecraque.form;

import java.util.Date;

import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AssinanteForm extends ActionForm{

	private Long id;
	private String email;
	private String password;
	private String confPassword;
	private String nome;
	private String cpf;
	private String endereco;
	private String cidade;
	private String estado;
	private String dataCadastro;
	private String username;

	private String height;
	private String weight;
	private String position;
	private String comment;
	private String tournaments;
	private String teams;	
	
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private String phoneNumber;
	private Date birthDate = new Date(anoNascimento-1900, mesNascimento-1, diaNascimento);
	
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
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

	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
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
	public String getTournaments() {
		return tournaments;
	}
	public void setTournaments(String tournaments) {
		this.tournaments = tournaments;
	}
	
	public String getTeams() {
		return teams;
	}
	public void setTeams(String teams) {
		this.teams = teams;
	}
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		
		ActionErrors errors = new ActionErrors();
		
		if( getEmail() == null || getEmail().length() < 1){
			errors.add("erro.vcEmailAssinante", new ActionMessage("erro.vcEmailAssinante"));
		}
		
		else if( getPassword() == null || getPassword().length() < 1){
			errors.add("erro.vcPasswordAssinante", new ActionMessage("erro.vcPasswordAssinante"));
		}
		
		else if( !getPassword().equals(getConfPassword())){
			errors.add("erro.vcConfPasswordAssinante", new ActionMessage("erro.vcConfPasswordAssinante"));
		}
		
		else if( getNome() == null || getNome().length() < 1) {
			errors.add("erro.vcNomeAssinante", new ActionMessage("erro.vcNomeAssinante"));
		}
		
		else if( getCpf() == null || getCpf().length() < 1) {
			errors.add("erro.vcCPFAssinante", new ActionMessage("erro.vcCPFAssinante"));
		}
		
		else if( getEndereco() == null || getEndereco().length() < 1) {
			errors.add("erro.vcEnderecoAssinante", new ActionMessage("erro.vcEnderecoAssinante"));
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
		this.cpf = null;
		this.endereco = null;
		this.cidade = null;
		this.estado = null;
		this.username = null;
		
	}
	
}
