package vn.edu.imic.tunglam;

import java.util.Date;

public class Manager extends Employee {
	public Manager(String name, Date birthday, double salary) {
		super(name, birthday, salary);
	}

	public void setAssitant(Employee employee) {
		this.name =name;
	}

	public String toString() {
		return name + "," + birthday + "," + getSalary();
	}

	public void display(String name, String assitantName) {
		System.out.println("assitant of " + name + " is " +assitantName );

	}

	public static void main(String[] args) {
		Date birthday = new Date();
		Manager b = new Manager("Lam", birthday, 55555);
		Employee c = new Employee(" Minh", birthday, 8888);
		b.setAssitant(c);
		b.toString();
		b.display("Lam","Minh");
	}
}
