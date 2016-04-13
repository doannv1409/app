package vn.edu.imic.leanhtuan;

import java.util.Date;

public class Person_Inheritance {
	protected String name;
	protected Date birthday;
	
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String toString() {
		
		return "Tra ve thong tin theo format =" + name + ", birthday=" + birthday ;
	}
	
	
	public void display(){
		System.out.println(name + birthday);
	}

	public Date getBirthday() {

		return this.birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public static void main(String [] args){
//		Person_Inheritance person1 = new Person_Inheritance();
//		person1.name = "Le Anh Tuan";
//		person1.birthday = new Date();
//		
//		person1.toString();
//		person1.display();
//	}
	}
	

