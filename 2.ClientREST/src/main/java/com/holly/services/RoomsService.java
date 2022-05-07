package com.holly.services;

import java.util.List;
//import javax.jws.WebMethod;

import org.springframework.stereotype.Component;

import com.holly.model.Rooms;

//@WebService //(serviceName = "rooms-service", targetNamespace = "http://service.holly.com/")
@Component
public class RoomsService {

	//@WebMethod
	public List<Rooms> findRooms() {
		return null;
	}
}
