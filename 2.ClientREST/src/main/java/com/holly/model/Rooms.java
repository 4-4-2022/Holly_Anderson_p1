package com.holly.model;

public class Rooms {

	private long id;

	private String roomId;

	public Rooms() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	@Override
	public String toString() {
		return "Rooms [id=" + id + ", roomId=" + roomId + "]";
	}

}
