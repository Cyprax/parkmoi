package ci.parkmoi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParkingDistrict {
	@Id private int id;
	private String libelle;
	private String description;
	
	public ParkingDistrict() {
		super();
	}
	public ParkingDistrict(int id) {
		super();
		this.id = id;
	}
	public ParkingDistrict(int id, String libelle, String description) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
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

}
