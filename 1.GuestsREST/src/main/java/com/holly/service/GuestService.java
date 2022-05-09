package com.holly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holly.model.Guest;
import com.holly.repository.GuestRepo;
import com.holly.repository.GuestRepositoryImpl;

@Service
public class GuestService implements GuestRepositoryImpl {

	@Autowired
	private GuestRepo repository;
	
	
	// create new guest
	public Guest addGuest(Guest guest) {
		return repository.save(guest);
	}

	// reads all guests
	public List<Guest> findAll() {
		return this.repository.findAll();
	}

	// reads single guest
	public Guest getGuestbyId(int guest_id) {
		Optional<Guest> guest = repository.findById(guest_id);
		if (guest.isPresent()) {
			return guest.get();
		}
		throw new RuntimeException("guest " + guest_id + " does not exist");
	}

	@Override
	public Guest deleteGuest(Guest guest) {
		this.repository.delete(guest);
		return null;
	}

	@Override
	public Guest saveGuest(Guest guest) {
		return null;
	}

	@Override
	public Guest save(Guest guest) {
		return null;

	}

	@Override
	public Guest delete(Guest guest) {
		// TODO Auto-generated method stub
		return null;
	}
}
