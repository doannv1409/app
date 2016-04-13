package vn.edu.imic.haiyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B2_Personn {
	protected String name;
	protected static Date birthday;
	
	public static Date inngay(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String ngay = null;
		try {
			birthday = sdf.parse("10/08/1994");
			System.out.println(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
		System.out.println(inngay());
	}

	public String toString() {
		return name + "," + birthday;
	}

	public String display() {
		return name + "," + birthday;
	}
	
//	public static void main(String[] args) {
//		inngay();
//	}
}
