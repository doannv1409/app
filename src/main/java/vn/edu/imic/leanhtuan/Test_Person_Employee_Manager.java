package vn.edu.imic.leanhtuan;

import java.util.Date;

public class Test_Person_Employee_Manager {
	
	public static void main(String [] args){
		
		Person_Inheritance person1 = new Person_Inheritance("Le Anh Tuan", new Date());
		Employee_Inheritance employee1 = new Employee_Inheritance("Nguyen Van Duc ", new Date(), 10000000);
		Employee_Inheritance employee2 = new Employee_Inheritance("Phan Van Toan", new Date(), 500000000);
		Manage_Inheritance manager1 = new Manage_Inheritance("Manager", new Date(), 2000099);
		manager1.setAssistant(employee2);
		
		System.out.println("Thong tin cua person : ");
		person1.display();
		System.out.println("Thong tin cua employee1 :");
		employee1.display();
		System.out.println("Thong tin cua manager :");
		manager1.display();
		
	}
}
