package vn.edu.imic.leanhtuan;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person_Inheritance {
	
	protected String name;
	protected Date birthday;
	
	
	public Person_Inheritance(String name, Date birthday){
		this.name = name;
		this.birthday = birthday;
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder("Tra Ve Thong Tin Theo Format :");
		info.append(name).append(" , ");
		
		return name;
		
	}
	
	public void display(){
		SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(name + ", " + simpleformat.format(birthday));
	}
}