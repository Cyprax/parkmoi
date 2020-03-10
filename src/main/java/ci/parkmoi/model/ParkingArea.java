package ci.parkmoi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ParkingArea {
	@Id private int id;
	private String libelle;
	private String description;
	private int adrLongitude;
	private int adrLatitude;
	@ManyToOne private ParkingDistrict district;
	
	public ParkingArea() {
		super();
	}
	public ParkingArea(int id) {
		super();
		this.id = id;
	}
	public ParkingArea(int id, String libelle, String description, int adrLongitude, int adrLatitude, int districtId) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.adrLongitude = adrLongitude;
		this.adrLatitude = adrLatitude;
		this.district = new ParkingDistrict(districtId);
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
	public int getAdrLongitude() {
		return adrLongitude;
	}
	public void setAdrLongitude(int adrLongitude) {
		this.adrLongitude = adrLongitude;
	}
	public int getAdrLatitude() {
		return adrLatitude;
	}
	public void setAdrLatitude(int adrLatitude) {
		this.adrLatitude = adrLatitude;
	}
	
	public ParkingDistrict getDistrict() {
		return district;
	}
	public void setDistrict(ParkingDistrict district) {
		this.district = district;
	}

}
