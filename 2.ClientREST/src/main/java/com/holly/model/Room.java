package com.holly.model;

public class Room {
	
	private int room_id;
	
	private int room_beds;

	private int room_baths;
	
	private int room_floornum;
	
	public Room() {}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getRoom_beds() {
		return room_beds;
	}

	public void setRoom_beds(int room_beds) {
		this.room_beds = room_beds;
	}

	public int getRoom_baths() {
		return room_baths;
	}

	public void setRoom_baths(int room_baths) {
		this.room_baths = room_baths;
	}

	public int getRoom_floornum() {
		return room_floornum;
	}

	public void setRoom_floornum(int room_floornum) {
		this.room_floornum = room_floornum;
	}

	@Override
	public String toString() {
		return "Room [room_id=" + room_id + ", room_beds=" + room_beds + ", room_baths=" + room_baths
				+ ", room_floornum=" + room_floornum + "]";
	}

}
