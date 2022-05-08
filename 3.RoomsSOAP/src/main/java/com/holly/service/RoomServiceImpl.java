package com.holly.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holly.model.Room;
import com.holly.repository.RoomRepository;

@WebService(endpointInterface = "com.holly.service.RoomService") 
public class RoomServiceImpl implements RoomService {
	
private RoomRepository hotelRepository;
	
	public RoomServiceImpl() {}
	
	public RoomServiceImpl(RoomRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}
	
	@Autowired
	public void setRoomRepository(RoomRepository hotelRepository) {
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

	@Override
	public Room findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}
}
//	@Override
//	public Room findById(String id) {
//		return this.hotelRepository.findById(id);
//	}
	
//	@WebMethod
//	public Room deleteById(Room room) {
//		return this.hotelRepository.delete(room);		
//	}
//}
