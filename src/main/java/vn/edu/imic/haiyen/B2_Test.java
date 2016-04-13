package vn.edu.imic.haiyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B2_Test {
	public static Date inngay(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date birthday = null;
		try {
			birthday = sdf.parse("10/08/1994");
			System.out.println(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return birthday;
	}
	
	public static void main(String[] args) {
		B2_Personn person1 = new B2_Personn();
	//	person1.setName("Le Hai Yen");
		person1.setBirthday(inngay());
		System.out.println(person1.toString());
		System.out.println(person1.display());
		
		B2_Employee em1=new B2_Employee(0);
		em1.setSalary(1000000000);
		System.out.println(em1.toString());
		System.out.println(em1.display());
		

	}
}
