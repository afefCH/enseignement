package iit.projet.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Groupe implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String libelle;
	private String specialite;
	private long niveau;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "groupe")
	List<Cours> cours;
	
	public Groupe()
	{
		
	}
	

	public Groupe(String libelle, String specialite, long niveau, List<Cours> cours) {
		super();
		this.libelle = libelle;
		this.specialite = specialite;
		this.niveau = niveau;
		this.cours = cours;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public long getNiveau() {
		return niveau;
	}

	public void setNiveau(long niveau) {
		this.niveau = niveau;
	}

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Groupe other = (Groupe) obj;
		if (id != other.id)
			return false;
		return true;
	}

	

}
