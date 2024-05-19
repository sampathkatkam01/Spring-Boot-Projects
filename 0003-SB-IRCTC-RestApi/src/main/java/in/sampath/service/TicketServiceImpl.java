package in.sampath.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.Repo.TicketRepo;
import in.sampath.entity.Passenger;
import in.sampath.entity.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketRepo repo;

	@Override
	public Ticket Bookticket(Passenger p) {
		Ticket t = new Ticket();
		BeanUtils.copyProperties(p, t);
		t.setTicketStatus("Confirmed");
		Ticket save = repo.save(t);
		return save;
	}

	@Override
	public Ticket getTicketById(Integer TicketId) {
		return repo.findById(TicketId).orElseThrow();
	}

	@Override
	public List<Ticket> getAllTickets() {
		return repo.findAll();
	}

}
