package com.holly.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.holly.model.Guest;

// runs on http://localhost:7070

@RestController
public class GuestController {
	
	@Autowired
	private RestTemplate restTemplate1;
	
	// CREATE
	@PostMapping("/newG")
	public String createGuest(@RequestBody Guest guest) {
	ResponseEntity<String> response = restTemplate1.postForEntity("http://localhost:8080/guest/new", guest, String.class);
	return response.getBody();
	}
	
	// READ
	@GetMapping("/allG")
	public List<Guest> findAll() {
		ResponseEntity<List> guests = restTemplate1.getForEntity("http://localhost:8080/guest/all", List.class);
		List<Guest> guestList = guests.getBody();
		return guestList;
	}
	
	// UPDATE
	@PutMapping("/update/{guest_id}")
	public void updateGuestById(@PathVariable Integer guest_id, @RequestBody Guest guest) {
		restTemplate1.put("http://localhost:8080/guest/update" + guest_id, guest);
	}
	 
	// DELETE
	@DeleteMapping("/deleteG")
	public void deleteGuest(@RequestParam Guest guest) {
		restTemplate1.delete("http://localhost:8080/guest/delete" + guest);
	}
	
	// SECONDARY
	@GetMapping("/{guest_id}")
	public Guest getGuest(@PathVariable int guest_id) {
		ResponseEntity<Guest> guest = restTemplate1.getForEntity("http://localhost:8080/guest/" + guest_id, Guest.class);
		return guest.getBody(); 
	}
	
	@GetMapping ("/guest/test")
	public String test() {
		return "test runs successfully";
	}
	

}
