package vn.edu.imic.leanhtuan;

import java.util.Date;

public class Manage_Inheritance extends Employee_Inheritance{
	protected Employee_Inheritance assistant;

	public Manage_Inheritance(String name, Date birthday, double salary) {
		super(name, birthday, salary);
		
	}

		
		public void setAssistant(Employee_Inheritance employee) {
	
		}
		
		
		@Override
		public String toString() {
			return "Thong tin theo format la : " + name  + birthday + salary;
}
		
		@Override
		public void display(){
			System.out.println("assistant of" + super.name + "is" + assistant.name);
		}


		
		
}
