package com.holly.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.holly.model.Guest;

public interface GuestRepo extends JpaRepository<Guest, Integer> {
	public List<Guest> findAll();
}
