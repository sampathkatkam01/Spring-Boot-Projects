package in.sampath.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passport_tbl")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	private String passportNum;
	private LocalDate IssuedDate;
	private LocalDate ExpDate;

	@OneToOne
	@JoinColumn(name = "person_id")
	private person person;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public LocalDate getIssuedDate() {
		return IssuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		IssuedDate = issuedDate;
	}

	public LocalDate getExpDate() {
		return ExpDate;
	}

	public void setExpDate(LocalDate expDate) {
		ExpDate = expDate;
	}

	public person getPerson() {
		return person;
	}

	public void setPerson(person person) {
		this.person = person;
	}
	

}
