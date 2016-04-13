package vn.edu.imic.tunglam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

	public static void main(String[] args) {
		Date birthday = new Date();

		Employee e= new Employee("Lam ", birthday, 66666);
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = df.format(birthday);
		e.toString();
		e.display("Lam", dateString, 66666);
		
	}

}
