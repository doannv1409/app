package vn.edu.imic.quangminh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person(1, "Nguyen Van A")
				.gender("Nam").hairColor("Red")
				.hands(2).legs(2).language("English");
				
		System.out.println(p);		
		SimpleDateFormat format = new SimpleDateFormat
									("dd/MM/yyyy");
		Date dob = null;
		try {
			//Convert tu String date co dang dd/MM/yyyy
			//Thanh kieu java.util.Date
			dob = format.parse("08/03/2016");
			System.out.println(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		p.setDob(new Date());
		
		//format kieu Date -> String dang dd/MM/yyyy
		String dobStr = format.format(p.getDob());
		
		System.out.println(dobStr);
	}
}
