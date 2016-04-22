package vn.edu.imic.tunglam;

import java.util.Date;

public class Manager extends Employee {
	private Employee assitant;

	public Manager(String name, Date birthday, double salary) {
		super(name, birthday, salary);
	}

	public Employee setAssitant(){
		return assitant;
	}
	public void setAssitant(Employee assitant) {
		this.assitant =assitant;
	}

	public String toString() {
		return name + "," + birthday + "," + getSalary();
	}

	public void display(String name, String assitant) {
		System.out.println("assitant of " + name + " is " +assitant );

	}

	
}
