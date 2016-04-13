package vn.edu.imic.leanhtuan;

import java.util.Date;


public class Employee_Inheritance extends Person_Inheritance{
	
	protected double salary;
	
	public Employee_Inheritance(String name , Date birthday, double salary){
		super(name, birthday);
			
	}

	
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}



	@Override
	public String toString() {
		
		return "Thong tin theo format la : " + name  + birthday + salary;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println(", " + salary);
	}
	
//	public static void main(String [] args){
//		
//		Employee_Inheritance employee1 = new Employee_Inheritance("leanhtuan",new Date());
//		employee1.salary= 100000;
//		employee1.display();
//		employee1.toString();
//	}
	
}
