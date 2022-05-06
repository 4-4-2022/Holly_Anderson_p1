package com.holly.service;

import java.util.List;
import javax.jws.WebMethod;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.holly.model.Room;
import com.holly.repository.HotelRepository;

public class HotelServiceImpl implements HotelService {
	
private HotelRepository hotelRepository;
	
	public HotelServiceImpl() {}
	
	public HotelServiceImpl(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}
	
	@WebMethod
	public List<Room> findAll(){
		return this.hotelRepository.findAll();
	}
//    /* Room information */
//    @RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
//    public String showRoom(@PathVariable("roomId") Long roomId, Model model) {
//        Room room = roomService.findOne(roomId);
//        setMainAttributes(model);
//        model.addAttribute("room", room);
//        return "show";
//    }
}
