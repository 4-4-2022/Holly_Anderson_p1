package com.holly.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Guest {
	
	private String guest_username;
	private String guest_pass;
	private String guest_firstname;
	private String guest_lastname;
	private boolean guest_administrator;
	private int guest_id;
	
	public Guest(int guest_id, String guest_username, String guest_pass, String guest_firstname, String guest_lastname,
			boolean guest_administrator) {
		super();
		this.guest_id = guest_id;
		this.guest_username = guest_username;
		this.guest_pass = guest_pass;
		this.guest_firstname = guest_firstname;
		this.guest_lastname = guest_lastname;
		this.guest_administrator = guest_administrator;
	}

	public int getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}

	public String getGuest_username() {
		return guest_username;
	}

	public void setGuest_username(String guest_username) {
		this.guest_username = guest_username;
	}

	public String getGuest_pass() {
		return guest_pass;
	}

	public void setGuest_pass(String guest_pass) {
		this.guest_pass = guest_pass;
	}

	public String getGuest_firstname() {
		return guest_firstname;
	}

	public void setGuest_firstname(String guest_firstname) {
		this.guest_firstname = guest_firstname;
	}

	public String getGuest_lastname() {
		return guest_lastname;
	}

	public void setGuest_lastname(String guest_lastname) {
		this.guest_lastname = guest_lastname;
	}

	public boolean isGuest_administrator() {
		return guest_administrator;
	}

	public void setGuest_administrator(boolean guest_administrator) {
		this.guest_administrator = guest_administrator;
	}

	@Override
	public String toString() {
		return "Guest [guest_id=" + guest_id + ", guest_username=" + guest_username + ", guest_pass=" + guest_pass
				+ ", guest_firstname=" + guest_firstname + ", guest_lastname=" + guest_lastname
				+ ", guest_administrator=" + guest_administrator + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(guest_administrator, guest_firstname, guest_id, guest_lastname, guest_pass, guest_username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Guest))
			return false;
		Guest other = (Guest) obj;
		return guest_administrator == other.guest_administrator
				&& Objects.equals(guest_firstname, other.guest_firstname) && guest_id == other.guest_id
				&& Objects.equals(guest_lastname, other.guest_lastname) && Objects.equals(guest_pass, other.guest_pass)
				&& Objects.equals(guest_username, other.guest_username);
	}

}
