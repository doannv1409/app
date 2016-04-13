package vn.edu.imic.tung;

import java.util.Date;

public class L5_Person {
	public  String name;
	protected Date birthday;
	// tao contructor mac dinh
	public L5_Person (){};
	// tao contructor khoi tao cho cac gia tri cua truong Person
	public L5_Person( String name, Date birthday){
		this.name =name;
		this.birthday = birthday;
	
	};
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public  String toString(){
	StringBuilder str = new StringBuilder();
	str.append("+ ").append(name).append(",").append("+ ").append(birthday);
	
	return String.format(name,birthday);}
	public void display(){
		System.out.println("+ "+name+","+ "+ "+ birthday);
		
	};

}
