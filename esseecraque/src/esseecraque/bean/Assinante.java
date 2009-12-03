package esseecraque.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.search.annotations.ContainedIn;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Store;


@Entity
@Table(name = "TBL_ASSINANTE")
@Indexed
public class Assinante extends PersistentObject implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NR_ID_ASSINANTE", unique=true)
	private Long id;
	
	@Column(name="VC_EMAIL_ASSINANTE")
	private String email;
	
	@Column(name="VC_PASSWORD_ASSINANTE")
	private String password;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_NOME_ASSINANTE")
	private String nome;
	
	@Column(name="VC_CPF_ASSINANTE", unique=true)
	private String cpf;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_ENDERECO_ASSINANTE")
	private String endereco;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_CIDADE_ASSINANTE")
	private String cidade;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_ESTADO_ASSINANTE")
	private String estado;
	
	@Column(name="DT_DATA_CAD_ASSINANTE")
	private String dataCadastro;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_USERNAME", unique=true)
	private String username;
	
	@ContainedIn
	@OneToMany(mappedBy="assinante", fetch=FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private List<Video> Videos;
	
	//CAMPOS DE PERFIL
	@Column(name="VC_HEIGHT")
	private String height;
	
	@Column(name="VC_WEIGHT")
	private String weight;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_POSITION")
	private String position;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_COMMENTS")
	private String comment;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_TOURNAMENTS")
	private String tournaments;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_TEAMS")
	private String teams;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="DT_BIRTHDATE")
	private Date birthDate;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_PHONE")
	private String phoneNumber;
	
	/*
	private int diaNascimento = birthDate.getDate();
	private int mesNascimento = birthDate.getMonth();
	private int anoNascimento = birthDate.getYear();
	
	
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
*/
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Video> getVideos() {
		return Videos;
	}
	
	public void setVideos(List<Video> videos) {
		Videos = videos;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password){
		this.password = password;
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
	
	
}
