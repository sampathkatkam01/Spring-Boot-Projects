package in.sampath.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer pid;

	private String name;

	private Double price;

	private String category;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getname() {
		return name;
	}

	public void setname(String pname) {
		this.name = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "product [pid=" + pid + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

}
