package com.holly.service;

import java.util.List;

import javax.jws.WebService;

import com.holly.model.Room;

//this interface implements a web service. its a service endpoint interface which means that it declares methods that a client can invoke on this web service. SEIs are not 
//required because webservice implementation classess implicitly define SEIs. This SEI used to determine the abstract WSDL contract -- if method isnt declared here it wont show up

@WebService
public interface HotelService {
	
	public List<Room> findAll();

}
