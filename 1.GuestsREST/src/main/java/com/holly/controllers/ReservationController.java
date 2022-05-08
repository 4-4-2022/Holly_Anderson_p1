package com.holly.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("reservationController")
public class ReservationController {
		
		
//		@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
//		public ResponseEntity<List<Reservation>> findAll(){
//			ResponseEntity<List<Reservation>> httpResponse
//			= new ResponseEntity<>(this.reservationService.findAll(), HttpStatus.OK);
//		return httpResponse;
//	}
//		@PostMapping("/postReservation")
//		public Reservation saveReservation (@RequestBody Reservation reservation) {
//			return reservationService.save(reservation);
//		}
//		
//		@PutMapping("/updateReservation")
//		public Reservation updateReservation (@RequestBody Reservation reservation) {
//			return reservationService.save(reservation);
//		}
//		
//		@DeleteMapping("/deleteReservation")
//		public String deleteReservation(@RequestParam int id) {
//			reservationService.deleteReservation(id);
//			return "Reservation Deleted";
//		}
}
