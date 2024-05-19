package in.sampath.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class productEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ProductId;
	private String ProductName;
	private Long ProductPrice;

	public Integer getProductId() {
		return ProductId;
	}

	public void setProductId(Integer productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public Long getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(Long productPrice) {
		ProductPrice = productPrice;
	}

}
