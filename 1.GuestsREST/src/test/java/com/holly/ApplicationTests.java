package com.holly;

//import java.util.stream.Collectors;
//import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.holly.service.GuestService;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private GuestService GuestRepositoryImpl;

//	@Test
//	public void getGuestsTest() {
//		assertEquals(2, (GuestRepositoryImpl.getGuestById().size()));
//		when(GuestRepositoryImpl.getGuestById()).thenReturn(Stream
//
//				.of(new Guest("kitty", "meow", "Noodle", "Anderson", false, 1),
//						new Guest("cat", "meow", "Smokey", "Anderson", false, 1))
//				.collect(Collectors.toList()));
//
//	}

	private void assertEquals(int i, int j) {
	}
	
	@Test
	void contextLoads() {
	}
}