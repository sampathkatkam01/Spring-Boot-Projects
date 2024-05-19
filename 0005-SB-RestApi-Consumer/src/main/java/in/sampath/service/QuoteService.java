package in.sampath.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.sampath.entity.Product;



@Service
public class QuoteService {

	public Product getProduct(String pid) {

		String url = "https://api.restful-api.dev/objects/" + pid;
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Product> forEntity = rt.getForEntity(url, Product.class);
		int value = forEntity.getStatusCode().value();

		if (value == 200) {

			return forEntity.getBody();
		}
		return null;

	}

	public void getProducts() {
		String url = "https://api.restful-api.dev/objects";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Product[]> entity = rt.getForEntity(url, Product[].class);
		int value = entity.getStatusCode().value();

		if (value == 200) {
			Product[] body = entity.getBody();

			for (Product p : body) {
				System.out.println(p);
			}
		}
	}
}
