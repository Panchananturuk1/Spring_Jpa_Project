package jpa.studentdata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentData {
	
	@Id
	private int sid;
	private String sname;
	private int sage;
	
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "StudentData [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}
	
	
	
	
	
	

}
