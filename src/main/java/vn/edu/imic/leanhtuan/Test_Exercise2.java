package vn.edu.imic.leanhtuan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_Exercise2 {
	public static void main(String[] args) {
		//Phan in Person
		Person_Inheritance person1 = new Person_Inheritance();
		person1.name = "TuanLe";
		person1.birthday = new Date();
		
		person1.toString();
		person1.display();
	
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date birthday = null;
		try {
			birthday = format.parse("02/05/1993");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		person1.setBirthday(birthday);

		// format kieu Date -> String dang dd/MM/yyyy
//		String birthStr = format.format(person1.getBirthday());
		
		
		//Phan in Employees
		Employee_Inheritance employee1 = new Employee_Inheritance("Khanh", new Date());
		employee1.salary = 1000.000;
		employee1.toString();
		employee1.display();
		
		//Phan in ra Manager
		Manage_Inheritance  manage1 = new Manage_Inheritance("Le Anh Tuan", new Date(), 100000000);
		manage1.setAssistant(employee1);
		manage1.toString();
//		manage1.display();
	}
}
