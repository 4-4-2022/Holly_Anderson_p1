package com.holly.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holly.model.Rooms;
import com.holly.services.RoomsService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	@Autowired RoomsService roomsService;
	
	@GetMapping("/all")
	public List<Rooms> getSoapMessage() {
		return this.roomsService.findRooms();
	}

}
