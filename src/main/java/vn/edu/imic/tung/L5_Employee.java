package vn.edu.imic.tung;

import java.sql.Date;

public class L5_Employee extends L5_Person{
	protected double salary;
	public L5_Employee(){};
	public L5_Employee ( String name, Date birthday, double salary){
		super();
		this.salary =salary;
	};
	public void setSalary(double salary){
		this.salary = salary;
	};
	
	public  double getSalary(){
		return salary;
		
	};
@Override
	public  String toString(){
	StringBuilder str = new StringBuilder();
	str.append("+ ").append(name).append(",").append("+ ").append(birthday).append("+ ").append(",").append(salary);
	return String.format(name,birthday,salary);
}
public void display(){
	System.out.println("+ "+name+","+ "+ "+ birthday+","+"+ "+salary);
	
};
 
 
	
	
	

}
