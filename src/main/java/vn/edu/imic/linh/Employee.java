package vn.edu.imic.linh;
import java.util.Date;

public class Employee extends Person {
	private double salary;
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, Date date, double salary){
		this.setName(name);
		this.setBirthDay(date);
		this.setSalary(salary);
		
	}
	
	
}

