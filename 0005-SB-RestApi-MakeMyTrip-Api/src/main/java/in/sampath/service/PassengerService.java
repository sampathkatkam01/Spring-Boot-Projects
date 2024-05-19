package in.sampath.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.sampath.Binding.Passenger;
import reactor.core.publisher.Mono;

@Service
public class PassengerService {
	
	private final String Book_tickets = "";

//	public Mono<Ticket> BookTicket(Passenger p){
//		
//		WebClient webClient = WebClient.create();
//		webClient.post()
//		         .uri(Book_tickets)
//		         .body()
//		
//	}
}
