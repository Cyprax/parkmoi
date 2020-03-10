package ci.parkmoi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicles {

	@Id private String immatriculation;
	private String libelle;
	private String description;
	@ManyToOne private User client;

	public Vehicles() {
		super();
	}
	public Vehicles(String immatriculation) {
		super();
		this.immatriculation = immatriculation;
	}
	public Vehicles(String immatriculation, String libelle, String description, int clientId) {
		super();
		this.immatriculation = immatriculation;
		this.libelle = libelle;
		this.description = description;
		this.client = new User(clientId);
	}
	
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getClient() {
		return this.client;
	}
	public void setClient(User client) {
		this.client = client;
	}
}
