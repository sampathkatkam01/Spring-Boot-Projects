package in.sampath.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class quoteService {
	
	public void getquote() {
		String apiurl="https://type.fit/api/quotes";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(apiurl, String.class);
		int value = forEntity.getStatusCode().value();
		
		if(value==200) {
			String body = forEntity.getBody();
			System.out.println(body);
		}
		
	}
	
	

}
