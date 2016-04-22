package vn.edu.imic.vumanh;
import java.util.Date;
public class Person {
	private String Name;
	private Date Birthday;
	private String toString;
	private String display;
	public String getName() {
		return Name;
	}
	public Date getBirthday() {
		return Birthday;
	}
	public String getToString() {
		return toString;
	}
	public String getDisplay() {
		return display;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}
	public void setToString(String toString) {
		this.toString = toString;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	

}
	