package in.sampath.service;

import java.util.List;

import in.sampath.entity.Passenger;
import in.sampath.entity.Ticket;

public interface TicketService {

	
	public Ticket Bookticket(Passenger p);
	
	public Ticket getTicketById(Integer TicketId);
	
	public List<Ticket> getAllTickets();
}
