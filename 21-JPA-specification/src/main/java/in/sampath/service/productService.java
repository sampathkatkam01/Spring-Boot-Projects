package in.sampath.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import in.sampath.entity.product;
import in.sampath.repo.ProductRepo;
import in.sampath.specs.productSpecifications;

@Service
public class productService {

	@Autowired
	private ProductRepo productrepo;

	public void getProductsSpec(String name, Double minPrice, Double maxPrice) {

		Specification<product> spec = Specification.where(null);

		if (name != null) {
			spec = spec.and(productSpecifications.nameLike(name));
		}

		if (minPrice != null) {
			spec = spec.and(productSpecifications.priceGreaterThan(minPrice));
		}

		if (maxPrice != null) {
			spec = spec.and(productSpecifications.priceLessThan(maxPrice));
		}

		List<product> findAll = productrepo.findAll(spec);
		findAll.forEach(System.out::println);

	}

	public void getproduct() {

		product p = new product();
		p.setCategory("Computers");

		Example<product> example = Example.of(p);

		List<product> findAll = productrepo.findAll(example);
		findAll.forEach(e -> System.out.println(e));

	}

	public void save() {

		product p1 = new product();
		p1.setCategory("Mobiles");
		p1.setname("Samsung");
		p1.setPrice(45820.0);

		product p2 = new product();
		p2.setCategory("Mobiles");
		p2.setname("Apple");
		p2.setPrice(78500.0);

		product p3 = new product();
		p3.setCategory("Mobiles");
		p3.setname("ViVo");
		p3.setPrice(28100.00);

		List<product> asList = Arrays.asList(p1, p2, p3);

		productrepo.saveAll(asList);

	}

}
