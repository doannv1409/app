package vn.edu.imic.tunglam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person1 {
	protected String name;
	protected Date dob;
	
	public Person1(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}
	
	public void display() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		StringBuilder builder = new StringBuilder(name);
		builder.append(", ").append(simpleDateFormat.format(dob));
		System.out.print(builder.toString());
	}
}