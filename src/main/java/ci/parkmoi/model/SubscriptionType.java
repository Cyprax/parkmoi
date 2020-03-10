package ci.parkmoi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubscriptionType {

	@Id private int id;
	private String libelle;
	private String description;
	private int cost;
	
	public SubscriptionType() {
		super();
	}
	public SubscriptionType(int id) {
		super();
		this.id = id;
	}
	public SubscriptionType(int id, String libelle, String description, int cost) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.cost = cost;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
