package in.sampath.Entity;

import java.time.LocalDate; 
import java.util.Arrays;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class PersonalEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String pid;
	private String pname;
	private String pgender;
	private LocalDate pdob;
	@Lob
	@Column(length=16777215)
	private byte[] pphoto;
	@Lob
	@Column(length=16777215)
	private byte[] presume;
	
	
	public PersonalEntity() {
		// TODO Auto-generated constructor stub
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPgender() {
		return pgender;
	}
	public void setPgender(String pgender) {
		this.pgender = pgender;
	}
	public LocalDate getPdob() {
		return pdob;
	}
	public void setPdob(LocalDate pdob) {
		this.pdob = pdob;
	}
	public byte[] getPphoto() {
		return pphoto;
	}
	public void setPphoto(byte[] pphoto) {
		this.pphoto = pphoto;
	}
	public byte[] getPresume() {
		return presume;
	}
	public void setPresume(byte[] presume) {
		this.presume = presume;
	}
	public PersonalEntity(String pid, String pname, String pgender, LocalDate pdob, byte[] pphoto, byte[] presume) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pgender = pgender;
		this.pdob = pdob;
		this.pphoto = pphoto;
		this.presume = presume;
	}
	@Override
	public String toString() {
		return "PersonalEntity [pid=" + pid + ", pname=" + pname + ", pgender=" + pgender + ", pdob=" + pdob
				+ ", pphoto=" + Arrays.toString(pphoto) + ", presume=" + Arrays.toString(presume) + "]";
	}

	

}
