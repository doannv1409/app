package vn.edu.imic.tunglam;

import java.util.Date;

public class Employee extends Person1 {
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
