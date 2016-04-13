package vn.edu.imic.quangminh.oop.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	protected String name;
	protected Date dob;
	
	public Person(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}
	
	public void display() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print(name + ", " + simpleDateFormat.format(dob));
	}
}
