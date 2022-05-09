package com.holly;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holly.model.Guest;
import com.holly.repository.GuestRepositoryImpl;
import com.holly.service.GuestService;

@RestController("controller")
@RequestMapping("/guest")
public class Controller {

	private GuestService guestService;

	@Autowired
	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}

	@Autowired
	private GuestRepositoryImpl guestRepositoryImpl;

	// CREATE
	@PostMapping("/new")
	public String createGuest(@RequestBody Guest guest) {
		Guest newGuest = guestRepositoryImpl.addGuest(guest);
		return newGuest.getGuest_username() + " was created!";
	}

	// READ
	@GetMapping("/all")
	public List<Guest> getGuests() {
		return guestService.findAll();
	}

	@GetMapping("/{guest_id}")
	public Guest getGuestbyId(@PathVariable int guest_id) {
		return guestRepositoryImpl.getGuestbyId(guest_id);
	}

	// UPDATE
	@PutMapping("/update")
	public String updateGuest(@RequestBody Guest guest) {
		return "The updated record is: " + guestRepositoryImpl.addGuest(guest);
	}

	// DELETE
	@DeleteMapping("/delete")
	public String deleteGuest(@RequestBody Guest guest) {
		guestRepositoryImpl.delete(guest);
		return "The guest's record has been deleted.";
	}

	// SECONDARY
	// displays options
	@GetMapping("/")
	public String home() {
		return "options" + " -- GET: /all, /{guest_id}, /test" + " -- POST: /create" + " -- PUT: /update"
				+ " -- DELETE: /delete";

	}

	// tests java without SQL
	@GetMapping("/test")
	public String test() {
		return "hey howdy what's good :-)";
	}

	// returns info on guest when created
	@PostMapping("/create")
	public Guest saveGuest(@RequestBody Guest guest) {
		return guestRepositoryImpl.addGuest(guest);
	}
	// @CrossOrigin(origins = "http://localhost:8080")
}