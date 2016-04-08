package vn.edu.imic.quangminh;

import java.util.Date;

public class People {
	private String fullName;
	
	public int age;
	
	protected Date dateOfBirth;
	
	//no modifier
	String address;
	
	//Constructor default: co the dinh nghia hoac khong
	public People() {
		
	}
	
	//Constructor co tham so
	public People(String fullName, int age) {
		//khoi tao gia tri cac thuoc tinh
		this.fullName = fullName;
		this.age = age;
	}
	
	public void setFullName(String fullName) {
		//Gan gia tri cho thuoc tinh fullName
		this.fullName = fullName;
	}
	
	//Lay ho ten cua lop People
	public String getFullName() {
		return this.fullName;
	}
}
