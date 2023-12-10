package com.example.entities;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Rocket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRocket;
	private String nomRocket;
	private Double budgetRocket;
	private Date premierLancement;
	@ManyToOne
	private Modele modele;
	public Modele getmodele() {
		return modele;
		}
		public void setmodele(Modele modele) {
		this.modele = modele;
		}

	public Rocket() {
		super();
		}
	public Rocket(String nomRocket, Double budgetRocket, Date premierLancement) {
		super();
		this.nomRocket = nomRocket;
		this.budgetRocket = budgetRocket;
		this.premierLancement = premierLancement;
	}
	public Long getIdRocket() {
		return idRocket;
		}
	public void setIdRocket(Long idRocket) {
		this.idRocket = idRocket;
	}
		public String getNomRocket() {
		return nomRocket;
		}
		public void setNomRocket(String nomRocket) {
		this.nomRocket = nomRocket;
		}
		public Double getBudget() {
		return budgetRocket;
		}
		public void setbudget(Double budgetRocket) {
		this.budgetRocket = budgetRocket;
		}
		public Date getDateLancement() {
		return premierLancement;
		}
		public void setDateLancement(Date premierLancement) {
		this.premierLancement = premierLancement;
		}
		@Override
		public String toString() {
		return "Rocket [idRocket=" + idRocket + ", nomRocket=" +
				nomRocket + ", budgetRocket=" + budgetRocket
		+ ", dateLancement=" + premierLancement + "]";
		}
}

