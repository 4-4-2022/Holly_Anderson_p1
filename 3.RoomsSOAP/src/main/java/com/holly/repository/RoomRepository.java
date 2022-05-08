package com.holly.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.holly.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {

	public List<Room> findAll();
	//public Room delete(Room room);
	public Optional<Room> findById(String id);
}
