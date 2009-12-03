package esseecraque.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Fetch;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Store;

@Entity  
@Table(name = "TBL_TORNEIO")
@Indexed(index="indexes/torneio")

public class Torneio implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NR_ID_TORNEIO_PK")
	private int id;
	
	@Column(name="VC_NAME")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private String name;
	
	@Column(name="VC_CITY")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private String city;
	
	@Column(name="VC_TEAM")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private String team;
	
	@Column(name="NR_YEAR")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private int year;
	
	@IndexedEmbedded
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="NR_ID_ASSINANTE", insertable=false, updatable=false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Assinante assinante;
	
	public Assinante getAssinante() {
		return assinante;
	}
	public void setAssinante(Assinante assinante) {
		this.assinante = assinante;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
