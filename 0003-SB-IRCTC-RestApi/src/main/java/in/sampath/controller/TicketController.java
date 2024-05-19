package in.sampath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sampath.entity.Passenger;
import in.sampath.entity.Ticket;
import in.sampath.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService service;

	@PostMapping(value = "/ticket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p) {
		Ticket bookticket = service.Bookticket(p);
		return new ResponseEntity<>(bookticket, HttpStatus.CREATED);
	}

	@GetMapping(value = "/ticket/{id}", produces = "application/json")
	public ResponseEntity<Ticket> getTicket(@PathVariable Integer id) {

		Ticket ticketById = service.getTicketById(id);
		return new ResponseEntity<>(ticketById, HttpStatus.OK);
	}

	@GetMapping(value = "/tickets", produces = "application/json")
	public ResponseEntity<List<Ticket>> getAllTickets() {
		List<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<>(allTickets, HttpStatus.OK);
	}
}
