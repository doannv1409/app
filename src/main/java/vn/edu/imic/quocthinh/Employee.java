package vn.edu.imic.quocthinh;

import java.util.Date;

public class Employee extends Person {
	public double salary;


	public Employee() {
		super();
	}


	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	
	public static void main (String agrs[]){
		Employee employee = new Employee();
		employee.toString();
	}

}
