package com.holly.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.stereotype.Component;

import com.holly.model.Room;

@WebService(serviceName = "rooms-service", targetNamespace = "http://service.holly.com/")
@Component
public interface RoomsService {

	@WebMethod
	public List<Room> findAll();
	@WebMethod
	public Room findById(Integer room_id);
	@WebMethod
	public Room updateRoom(Room room);
	@WebMethod
	public Room deleteById(Integer room_id);
	@WebMethod
	public Room saveRoom(Room room);
	@WebMethod
	public String test();
}
