package in.sampath.binding;

public class bindingdata {
	
	private Integer id;
	private String name;
	private String email;
	
	
	public bindingdata() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


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


	public bindingdata(Integer id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}


	@Override
	public String toString() {
		return "bindingdata [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	

}
