package iit.projet.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Seance implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String libelle;

	@Temporal(TemporalType.TIME)
	private Date heureDebut;

	@Temporal(TemporalType.TIME)
   // @Temporal(TemporalType.TIMESTAMP)
	private Date heureFin;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "seance")
	List<Cours> cours;
	
	public Seance()
	{
		
	}

	public Seance(String libelle, Date heureDebut, Date heureFin, List<Cours> cours) {
		super();
		this.libelle = libelle;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.cours = cours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seance other = (Seance) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}

}
