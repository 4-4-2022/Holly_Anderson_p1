package com.holly.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // informs jpa that class and objects should be persisted
public class Guest {

	private String guest_username;
	private String guest_pass;
	private String guest_firstname;
	private String guest_lastname;
	private boolean guest_administrator;
	@Id
	private int guest_id;

	public Guest() {
		super();
	}

	public Guest(String guest_username, String guest_pass, String guest_firstname, String guest_lastname,
			boolean guest_administrator, int guest_id) {
		super();
		this.guest_username = guest_username;
		this.guest_firstname = guest_firstname;
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

	public int getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}

	@Override
	public String toString() {
		return "Guest [guest_username=\" + guest_username + \", guest_pass=" + guest_pass + ", guest_firstname="
				+ guest_firstname + ", guest_lastname=" + guest_lastname + ", guest_administrator="
				+ guest_administrator + ", guest_id=" + guest_id + ", ]";
	}
}

//input json for postman
//{
//	  "guest_id": 1,
//	  "guest_administrator": true,
//	  "guest_firstname": "holly",
//	  "guest_username": "h0lly",
//	"guest_pass": "1243",
//	  "guest_lastname": "anderson"
//	}
