package in.sampath.specs;

import org.springframework.data.jpa.domain.Specification;

import in.sampath.entity.product;



public class productSpecifications {
	
	public static Specification<product> nameLike(String name) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
	}

	public static Specification<product> priceLessThan(double price) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("price"), price);
	}

	public static Specification<product> priceGreaterThan(double price) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("price"), price);
	}


}
