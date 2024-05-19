package in.sampath.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
