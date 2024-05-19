package in.sampath.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {

	@NotEmpty(message = "Enter Name ")
	@Size(min = 3, max = 20, message = "Name must contain 3-8 charecters")
	private String name;
	@NotEmpty(message = "Enter valid Email Address")
	@Email
	private String email;
	@NotEmpty(message = "Enter Valid PhoneNumber")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Enter 10 digit valid MobileNumber")
	private String phno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}

}
