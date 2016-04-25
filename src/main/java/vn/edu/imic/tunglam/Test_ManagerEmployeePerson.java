package vn.edu.imic.tunglam;

import java.util.Date;

public class Test_ManagerEmployeePerson {
	public static void main(String[] args) {
		Manager manager = new Manager("Lam", new Date(), 33333);
		Employee employee = new Employee("Minh", new Date(), 2452345);
		manager.setAssistant(employee);
		System.out.println("Thong tin employee: ");
		employee.display();
		System.out.println();
		System.out.println("Thong tin manager: ");
		manager.display();
	}
}
