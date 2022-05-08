package com.holly.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.holly.model.Reservation;

@Service
public interface ReservationService extends JpaRepository<Reservation, Integer>{

	public List<Reservation> findAll();
	public Reservation findById(int reservation_id);
	public void deleteReservation(int id);
}
