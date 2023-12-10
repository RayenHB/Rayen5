package com.example.entities;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
/*@AllArgsCons*/
@Entity
public class Modele {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long idMod;
	private String nomMod;
	@OneToMany(mappedBy = "modele")
	private List<Rocket> rockets;
	public Modele(long idMod, List<Rocket> rockets)
	{
	super();
	this.idMod = idMod;
	this.rockets = rockets;
	}
	public Long getIdMod() {
	return idMod;
	}
	public void setIdMod(Long idMod) {
	this.idMod = idMod;
	}
	public String getNomMod() {
	return nomMod;
	}
	public void setNomMod(String nomCat) {
	this.nomMod = nomCat;
	}
	public List<Rocket> getRocket() {
	return rockets;
	}
	public void setProduits(List<Rocket> rockets) {
	this.rockets = rockets;
	}
}

