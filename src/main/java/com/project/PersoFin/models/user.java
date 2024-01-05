package com.project.PersoFin.models;

import com.project.PersoFin.enums.userRoles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id; 
	@Column
	private String user_name;
	@Column
	private String email_id;
	@Column
	private String passwordString;
	@Enumerated(EnumType.STRING)
	@Column
	private userRoles user_role;
	
	public user() {
		
	}
	public user(long user_id, String user_name, String email_id, String passwordString, userRoles user_role) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email_id = email_id;
		this.passwordString = passwordString;
		this.user_role = user_role;
	}
	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", user_name=" + user_name + ", email_id=" + email_id + ", passwordString="
				+ passwordString + ", user_role=" + user_role + "]";
	}
	/**
	 * @return the user_id
	 */
	public long getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the email_id
	 */
	public String getEmail_id() {
		return email_id;
	}
	/**
	 * @param email_id the email_id to set
	 */
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	/**
	 * @return the passwordString
	 */
	public String getPasswordString() {
		return passwordString;
	}
	/**
	 * @param passwordString the passwordString to set
	 */
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
	/**
	 * @return the user_role
	 */
	public userRoles getUser_role() {
		return user_role;
	}
	/**
	 * @param user_role the user_role to set
	 */
	public void setUser_role(userRoles user_role) {
		this.user_role = user_role;
	}

}
