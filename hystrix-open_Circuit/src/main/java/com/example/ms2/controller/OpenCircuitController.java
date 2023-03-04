package com.example.ms2.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/open")
public class OpenCircuitController {

	public static final String ticket = "ticketbooing";

	@GetMapping("/check")
	public String checkdemo() {
		return " it is working";
	}

	@GetMapping("/book")
	@CircuitBreaker(name = ticket, fallbackMethod = "dummyBookTicket")
	public String BookTicket() {
		System.out.println("OpenCircuitController.BookTicket()");
		if (new Random().nextInt(10) < 5)
			throw new RuntimeException("problem is b.logic");
		return "output from B.logic";
	}

	@GetMapping("/bookt")
	@CircuitBreaker(name = ticket, fallbackMethod = "dummyBookTicket")
	public String BookTickett() {

		RestTemplate restTemplate = new RestTemplate();
		String data = restTemplate.getForObject("http://localhost:8087/open/check", String.class);

		return "output from B.logic" + data;
	}

	public String dummyBookTicket(Exception e) {
		System.out.println("OpenCircuitController.dummyTicketBookTicket()");
		return "place Try later - Inconvience is regratted";
	}
}
