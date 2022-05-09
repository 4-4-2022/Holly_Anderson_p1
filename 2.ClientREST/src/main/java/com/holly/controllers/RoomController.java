package com.holly.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.holly.model.Room;
import com.holly.service.RoomsService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	@Autowired 
	RoomsService roomsService;
	
	@GetMapping("/all")
	public List<Room> getSoapMessage() {
		return this.roomsService.findAll();
	}
	
	@PostMapping("/new")
	public Room saveRoom (@RequestBody Room room) {
		return roomsService.saveRoom(room);
	}
	
	@PutMapping("/update")
	public Room updateRoom(@RequestBody Room room) {
		return roomsService.saveRoom(room);
	}
	
	@DeleteMapping("/delete")
	public Room deleteRoom(@RequestParam Integer room_id) {
		return roomsService.deleteById(room_id);
	}
	
	@GetMapping("/test")
	public String test() {
		return this.roomsService.test();
	}

}
