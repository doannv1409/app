package vn.edu.imic.leanhtuan;

import java.util.Date;

public class Manage_Inheritance extends Employee_Inheritance{
	protected Employee_Inheritance assistant;

	public Manage_Inheritance(String name, Date birthday, double salary) {
		super(name, birthday, salary);
		
	}

	public Employee_Inheritance getAssistant() {
		return assistant;
	}

	public void setAssistant(Employee_Inheritance assistant) {
		this.assistant = assistant;
	}

	
	
	public void display(){
		super.display();
		System.out.println("assistant of " + name + " is " + assistant.name);
	}
}
