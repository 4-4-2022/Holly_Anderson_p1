package com.holly.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.holly.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

	public List<Room> findAll();
	public void delete(Room room);
	public Optional<Room> findById(Integer room_id);
	//public Room update(Room room);
	public <S extends Room> S save(Room room);

}