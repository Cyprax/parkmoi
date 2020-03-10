package ci.parkmoi.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false, unique = true) private String username;
	@Column(nullable = false, unique = true) private String email;
	@Column(nullable = false) /*@JsonIgnore*/ private String password;

	private boolean active = true;
	private String roles;
	private String permissions;
	
	private String nom;
	private String prenom;
	private String contact;

	public User() {
		super();
	}
	public User(int id) {
		super();
		this.id = id;
	}
	public User(String username, String email, String password, String roles, String permissions) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.roles = roles;
		this.permissions = permissions;
		this.active = true;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	
	public List<String> getRoleList() {
		return (this.roles.length() > 0) ? Arrays.asList(this.roles.split(",")) : new ArrayList<>();
	}
	public List<String> getPermissionList() {
		return (this.permissions.length() > 0) ? Arrays.asList(this.permissions.split(",")) : new ArrayList<>();
	}

}
