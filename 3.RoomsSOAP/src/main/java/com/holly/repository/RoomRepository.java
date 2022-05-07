package com.holly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.holly.model.Room;

public interface RoomRepository extends JpaRepository<Room, String> {

}
