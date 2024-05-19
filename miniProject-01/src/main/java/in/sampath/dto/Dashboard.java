package in.sampath.dto;

public class Dashboard {
	
	private Long totalEnqs;
	
	private Long openEnqs;
	
	private Long enrolledEnqs;
	
	private Long lostenqs;

	public Long getTotalEnqs() {
		return totalEnqs;
	}

	public void setTotalEnqs(Long totalEnqs) {
		this.totalEnqs = totalEnqs;
	}

	public Long getOpenEnqs() {
		return openEnqs;
	}

	public void setOpenEnqs(Long openEnqs) {
		this.openEnqs = openEnqs;
	}

	public Long getEnrolledEnqs() {
		return enrolledEnqs;
	}

	public void setEnrolledEnqs(Long enrolledEnqs) {
		this.enrolledEnqs = enrolledEnqs;
	}

	public Long getLostenqs() {
		return lostenqs;
	}

	public void setLostenqs(Long lostenqs) {
		this.lostenqs = lostenqs;
	}

	@Override
	public String toString() {
		return "Dashboard [totalEnqs=" + totalEnqs + ", openEnqs=" + openEnqs + ", enrolledEnqs=" + enrolledEnqs
				+ ", lostenqs=" + lostenqs + "]";
	}

	
}
