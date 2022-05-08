package com.holly.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.holly.model.Guest;

@Service
public interface GuestRepositoryImpl {

	public Guest addGuest(Guest guest);

	public Guest save(Guest guest);

	public List<Guest> findAll();

	public Guest getGuestbyId(int guest_id);

	public Guest delete(Guest guest);

	public Guest deleteGuest(Guest guest);

	Guest saveGuest(Guest guest);

}
