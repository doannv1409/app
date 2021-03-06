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
			dob = format.parse("09/03/2014");
			System.out.println(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//format kieu Date -> String dang dd/MM/yyyy
		p.setDob(new Date());
		String dobStr = format.format(p.getDob());
		
		System.out.println(dobStr);
	}
}
