package vn.edu.imic.haiyen;

import java.text.SimpleDateFormat;
import java.util.Date;

public class B2_Employee extends B2_Personn {
	protected static double salary;

	public B2_Employee(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary = 1000000;
	}

	public void setSalary(double salary) {
		B2_Employee.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + salary;
	}

	@Override
	public String display() {
		return super.display() + salary;
	}
	
	public static void main(String[] args) {
		B2_Employee em=new B2_Employee(salary);
		em.toString();
		em.display();
	}
}
