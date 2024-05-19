package in.sampath.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sampath.binding.Product;
import in.sampath.service.ProductService;
import reactor.core.publisher.Mono;

@RestController
public class productController {

	@Autowired
	private ProductService productService;
	
//	@GetMapping("/product")
//	public ResponseEntity<Mono<String>> getproduct(){
//		Mono<String> product = productService.getProduct();
//		return new ResponseEntity<>(product,HttpStatus.OK);
//	}
	@GetMapping("/product")
	public ResponseEntity<Mono<Product>> getProductNew(){
		Mono<Product> productNew = productService.getProductNew();
		return new ResponseEntity<>(productNew,HttpStatus.OK);
	}
}
