package in.sampath.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CId;
	private String courseName;
	private Double CPrice;
	private int duration;
	private String ImageUrl;
	
	
	public Integer getCId() {
		return CId;
	}
	public void setCId(Integer cId) {
		CId = cId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getCPrice() {
		return CPrice;
	}
	public void setCPrice(Double cPrice) {
		CPrice = cPrice;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public course(Integer cId, String courseName, Double cPrice, int duration, String imageUrl) {
		CId = cId;
		this.courseName = courseName;
		CPrice = cPrice;
		this.duration = duration;
		ImageUrl = imageUrl;
	}
	
	public course() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "course [CId=" + CId + ", courseName=" + courseName + ", CPrice=" + CPrice + ", duration=" + duration
				+ ", ImageUrl=" + ImageUrl + "]";
	}
	
	
	
}
