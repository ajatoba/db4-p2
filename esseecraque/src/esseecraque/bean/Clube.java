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
@Table(name = "TBL_CLUBE")
@Indexed(index="indexes/clube")
 
public class Clube implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NR_ID_CLUBE_PK")
	private Long id;
	
	@Column(name="VC_NAME")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private String name;
	
	@Column(name="VC_CITY")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private String city;
	
	@Column(name="NM_START_YEAR")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private int startYear;
	
	@Column(name="NM_END_YEAR")
	@Field(index=Index.TOKENIZED, store=Store.YES)
	private int endYear;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	
}
