package in.sampath.Binding;

import java.time.LocalDate;

public class Ticket {

	private Integer TicketId;
	private String TicketStatus;
	private String name;
	private LocalDate DOB;
	private String gender;
	private LocalDate DOJ;
	private String FromAdd;
	private String ToAdd;
	private String TicketNum;
	public Integer getTicketId() {
		return TicketId;
	}
	public void setTicketId(Integer ticketId) {
		TicketId = ticketId;
	}
	public String getTicketStatus() {
		return TicketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		TicketStatus = ticketStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDOJ() {
		return DOJ;
	}
	public void setDOJ(LocalDate dOJ) {
		DOJ = dOJ;
	}
	public String getFromAdd() {
		return FromAdd;
	}
	public void setFromAdd(String fromAdd) {
		FromAdd = fromAdd;
	}
	public String getToAdd() {
		return ToAdd;
	}
	public void setToAdd(String toAdd) {
		ToAdd = toAdd;
	}
	public String getTicketNum() {
		return TicketNum;
	}
	public void setTicketNum(String ticketNum) {
		TicketNum = ticketNum;
	}
	
	
}
