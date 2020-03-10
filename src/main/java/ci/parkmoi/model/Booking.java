package ci.parkmoi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {

	@Id private int id;
	private String details;
	private Date deadline;
	@ManyToOne private ParkingPlace place;
	@ManyToOne private User client;
	
	public Booking() {
		super();
	}
	public Booking(int id) {
		super();
		this.id = id;
	}
	public Booking(int id, String details, Date deadline, int clientId, int placeId) {
		super();
		this.id = id;
		this.details = details;
		this.deadline = deadline;
		this.place = new ParkingPlace(placeId);
		this.client = new User(clientId);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public ParkingPlace getParkingPlace() {
		return place;
	}
	public void setParkingPlace(ParkingPlace place) {
		this.place = place;
	}
	public User getClient() {
		return client;
	}
	public void setUser(User client) {
		this.client = client;
	}
}
