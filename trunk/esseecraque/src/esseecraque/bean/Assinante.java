package esseecraque.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.search.annotations.ContainedIn;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
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
	
	@OneToMany(mappedBy="assinante", fetch=FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private List<Video> Videos;
	
	//CAMPOS DE PERFIL
	@Column(name="NR_HEIGHT")
	private double height=0.0;
	
	@Column(name="NR_WEIGHT")
	private double weight=0.0;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_POSITION")
	private String position;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_COMMENTS")
	private String comment;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="DT_BIRTHDATE")
	private String birthDate;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_PHONE")
	private String phoneNumber;
	
	@OneToMany(mappedBy="assinante", fetch=FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	private Set<Clube> clubes;

	@OneToMany(mappedBy="assinante", fetch=FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	private Set<Torneio> torneios;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="NR_SHOW_EMAIL")
	private boolean showEmail;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="NR_SHOW_PHONE")
	private boolean showPhone;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="NR_SHOW_CELL_PHONE")
	private boolean showCellPhone;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="NR_SHOW_AIM")
	private boolean showAim;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_AIM")
	private String aim;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_CELL_PHONE")
	private String cellPhoneNumber;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_PAIS")
	private String pais;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_NACIONALIDADE")
	private String nacionalidade;
	
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_CEP")
	private String cep;
		
	
	public boolean getShowCellPhone() {
		return showCellPhone;
	}

	public void setShowCellPhone(boolean showCellPhone) {
		this.showCellPhone = showCellPhone;
	}

	public boolean getShowAim() {
		return showAim;
	}

	public void setShowAim(boolean showAim) {
		this.showAim = showAim;
	}

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

	public boolean getShowEmail() {
		return showEmail;
	}

	public void setShowEmail(boolean showEmail) {
		this.showEmail = showEmail;
	}

	public boolean getShowPhone() {
		return showPhone;
	}

	public void setShowPhone(boolean showPhone) {
		this.showPhone = showPhone;
	}

	public Set<Torneio> getTorneios() {
		return torneios;
	}

	public void setTorneios(Set<Torneio> torneios) {
		this.torneios = torneios;
	}

	public Set<Clube> getClubes() {
		return clubes;
	}

	public void setClubes(Set<Clube> clubes) {
		this.clubes = clubes;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
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

}
