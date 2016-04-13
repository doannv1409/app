package vn.edu.imic.quangminh.oop.inheritance;

import java.util.Date;

public class Employee extends Person {
	private int salary;
	
	public Employee(String name, Date dob, int salary) {
		super(name, dob);
		this.salary = salary;
	}

	@Override
	public void display() {
		super.display(); 
		System.out.print(", " + salary);
	}
}
