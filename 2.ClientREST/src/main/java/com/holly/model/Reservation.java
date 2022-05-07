package com.holly.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table
public class Reservation {
	
	@Id
	@Column
	public int reservation_id;
	@Column
	public int guest_id;
	@Column 
	public int room_number;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	@Override
	public String toString() {
		return "Reservation [reservation_id=" + reservation_id + ", guest_id=" + guest_id + ", room_number="
				+ room_number + "]";
	}
	
}
