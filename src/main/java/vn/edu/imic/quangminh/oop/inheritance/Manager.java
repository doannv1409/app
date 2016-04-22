package vn.edu.imic.quangminh.oop.inheritance;

import java.util.Date;

public class Manager extends Employee {
	private Employee assistant;
	
	public Manager(String name, Date dob, int salary) {
		super(name, dob, salary);
	}

	public Employee getAssistant() {
		return assistant;
	}

	public void setAssistant(Employee assistant) {
		this.assistant = assistant;
	}
	
	@Override
	public void display() {
		System.out.println("assitant of " + name + " is " + assistant.name);
	}
}
