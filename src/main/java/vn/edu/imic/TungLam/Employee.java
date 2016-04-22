package vn.edu.imic.tunglam;

import java.util.Date;

public class Employee extends Person1 {
	private double salary;

	public Employee(String name, Date birthday, double salary) {
		super();

	}

	public double getSalary() {
		return salary;

	}

	public String toString() {
		return name + "," + birthday + "," + salary;
	}

	public void display(String name, String birthday, double salary) {
		System.out.println(name + "," + birthday + "," + salary);
	}

	

}
