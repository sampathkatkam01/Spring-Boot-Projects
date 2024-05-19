package in.sampath.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.sampath.binding.Product;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

	public Mono<Product> getProductNew() {
		String apiUrl = "https://api.restful-api.dev/objects/2";

		WebClient client = WebClient.create();

		Mono<Product> bodyToMono = client.get().uri(apiUrl).retrieve().bodyToMono(Product.class);

		System.out.println(bodyToMono);
		return bodyToMono;

	}

	public Mono<String> getProduct() {

		String apiUrl = "https://api.restful-api.dev/objects";

		// getting webclient impl class obj basically it was an interface
		WebClient Client = WebClient.create();

		Mono<String> bodyToMono = Client.get()// seding Get request
				.uri(apiUrl)// providing url to uri
				.retrieve()// getting response body
				.bodyToMono(String.class);// map response

		System.out.println(bodyToMono);

		return bodyToMono;

	}

}
