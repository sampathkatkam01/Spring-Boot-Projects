package in.sampath.ExInfo;

import java.time.LocalDate;

public class ExInfo {

	private String ExCode;
	private String ExMsg;
	private LocalDate ExDate;
	public String getExCode() {
		return ExCode;
	}
	public void setExCode(String exCode) {
		ExCode = exCode;
	}
	public String getExMsg() {
		return ExMsg;
	}
	public void setExMsg(String exMsg) {
		ExMsg = exMsg;
	}
	public LocalDate getExDate() {
		return ExDate;
	}
	public void setExDate(LocalDate exDate) {
		ExDate = exDate;
	}
	
	
}
