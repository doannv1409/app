package vn.edu.imic.quangminh;

import java.sql.Date;

import vn.edu.imic.tung.L5_Employee;

public class L5_Manager extends L5_Employee{
	L5_Employee assistant  ;
	public L5_Manager(){};
	public L5_Manager(String name, Date birthday, double salary){
		super();
		
	}
	public L5_Employee getAssistant() {
		return assistant;
	}
	public void setAssistant(L5_Employee assistant) {
		this.assistant = assistant;
	};
	@Override
	public  String toString(){
	StringBuilder str = new StringBuilder();
	str.append("+ ").append(name).append(",").append("+ ").append(birthday).append("+ ").append(",").append(salary);
	return String.format(name,birthday,salary);
}
	public void display(){
		System.out.println("assitant of"+name+" is"+assistant.name);
		
	};
	

}
