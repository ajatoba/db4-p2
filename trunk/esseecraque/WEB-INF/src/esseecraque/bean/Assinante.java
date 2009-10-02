package esseecraque.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
	@Column(name="NR_ID_ASSINANTE")
	private Long id;
	@Column(name="VC_EMAIL_ASSINANTE")
	private String email;
	@Column(name="VC_PASSWORD_ASSINANTE")
	private String password;
	@Field(index=Index.TOKENIZED, store=Store.YES)
	@Column(name="VC_NOME_ASSINANTE")
	private String nome;
	@Column(name="VC_CPF_ASSINANTE")
	private String cpf;
	@Column(name="VC_ENDERECO_ASSINANTE")
	private String endereco;
	@Column(name="VC_CIDADE_ASSINANTE")
	private String cidade;
	@Column(name="VC_ESTADO_ASSINANTE")
	private String estado;
	@Column(name="DT_DATA_CAD_ASSINANTE")
	private String dataCadastro;
	
	@ContainedIn
	@OneToMany(mappedBy="assinante", fetch=FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private List<Video> Videos;
	
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
	
}
