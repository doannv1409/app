package vn.edu.imic.quangminh.oop.inheritance;

import java.util.Date;

public class TestPersonEmployeeManager {
	public static void main(String[] args) {
		Employee employee = new Employee("Employee 1", new Date(), 12000);
		
		Manager manager = new Manager("Manager 1", new Date(), 1000000);
		Employee employee2 = new Employee("Employee 2", new Date(), 10000);
		manager.setAssistant(employee2);
		
		System.out.println("Thong tin employee: ");
		employee.display();
		System.out.println();
		System.out.println("Thong tin manager: ");
		manager.display();
	}
}
