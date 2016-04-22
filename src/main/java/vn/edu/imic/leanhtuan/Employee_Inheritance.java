package vn.edu.imic.leanhtuan;

import java.util.Date;


public class Employee_Inheritance extends Person_Inheritance{
	
	protected double salary;
	
	public Employee_Inheritance(String name , Date birthday, double salary){
		super(name, birthday);
			
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("," + salary);
	}

}