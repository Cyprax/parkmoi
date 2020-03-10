package ci.parkmoi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subscription {

	@Id private int id;
	private Date dateStarting;
	private Date dateEnding;
	@ManyToOne private SubscriptionType type;
	@ManyToOne private User client;
	
	public Subscription() {
		super();
	}
	public Subscription(int id, Date dateStarting, Date dateEnding, int typeId, int clientId) {
		super();
		this.id = id;
		this.dateStarting = dateStarting;
		this.dateEnding = dateEnding;
		this.client = new User(clientId);
		this.type = new SubscriptionType(typeId);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateStarting() {
		return dateStarting;
	}
	public void setDateStarting(Date dateStarting) {
		this.dateStarting = dateStarting;
	}
	public Date getDateEnding() {
		return dateEnding;
	}
	public void setDateEnding(Date dateEnding) {
		this.dateEnding = dateEnding;
	}

	public SubscriptionType getType() {
		return type;
	}
	public void setType(SubscriptionType type) {
		this.type = type;
	}
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
}
