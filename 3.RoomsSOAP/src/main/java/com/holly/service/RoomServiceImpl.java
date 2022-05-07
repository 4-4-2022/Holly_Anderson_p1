package com.holly.service;

import java.util.List;
import javax.jws.WebMethod;

import com.holly.model.Room;
import com.holly.repository.RoomRepository;

public class RoomServiceImpl implements RoomService {
	
private RoomRepository hotelRepository;
	
	public RoomServiceImpl() {}
	
	public RoomServiceImpl(RoomRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}
	
	@WebMethod
	public List<Room> findAll(){
		return this.hotelRepository.findAll();
	}
	
	@WebMethod
	public String test() {
		return "test success";
	}

	@Override
	public Room updateRoom(Room room) {
		return this.hotelRepository.save(room);
	}
}
