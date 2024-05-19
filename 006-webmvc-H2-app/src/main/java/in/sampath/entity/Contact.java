package in.sampath.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue
	private Integer cid;
	private String name;
	private Long phono;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhono() {
		return phono;
	}
	public void setPhono(Long phono) {
		this.phono = phono;
	}

}
