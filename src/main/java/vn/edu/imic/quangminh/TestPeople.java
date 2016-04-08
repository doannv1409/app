package vn.edu.imic.quangminh;

import java.util.Date;

public class TestPeople {
	public static void main(String[] args) {
		//Call default contructor
		People trinh = new People();
		trinh.setFullName("Nguyen Van Trinh");
		//gan gia tri cho cac thuoc tinh kieu public, protected, nomodifier
		trinh.age = 25;
		trinh.address = "Ha noi";
		trinh.dateOfBirth = new Date();
		//In thong tin cua doi tuong trinh
		print(trinh);
		
		System.out.println("-------------------");
		//Goi ham contructor co tham so
		People manh = new People("Nguyen Van Manh", 23);
		manh.address = "Ha noi 2";
		manh.dateOfBirth = new Date();
		//In thong tin cua doi tuong manh
		print(manh);
		
	}
	
	//Truyen Object param vao method
	private static void print(People people) {
		System.out.println(people.getFullName());
		System.out.println(people.age);
		System.out.println(people.dateOfBirth);
		System.out.println(people.address);
	}
}	
