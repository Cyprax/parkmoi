package ci.parkmoi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ParkingPlace {
	@Id private int id;
	private String libelle;
	private String description;
	private String availability;
	@ManyToOne private ParkingArea area;
	
	public ParkingPlace() {
		super();
	}
	public ParkingPlace(int id) {
		super();
		this.id = id;
	}
	public ParkingPlace(int id, String libelle, String description, String availbility, int areaId) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.area = new ParkingArea(areaId);
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
	public void setDescription(String descprition) {
		this.description = descprition;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getAvailability() {
		return availability;
	}
	
	public ParkingArea getArea() {
		return area;
	}
	public void setDistrict(ParkingArea area) {
		this.area = area;
	}

}
