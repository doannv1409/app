package vn.edu.imic.hoangnd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee {

	public Employee assistant;

	public Manager(String name, Date birthday, double salary, Employee assistant) {
		super(name, birthday, salary);
		this.assistant = assistant;
	}

	public void setAssistant(Employee assistant) {
		this.assistant = assistant;
	}

	@Override
	public String toString() {
		return "Manager [assistant=" + assistant + "]";
	}

	public void display() {
		super.display();
		System.out.println(" assistant of " + name + " is " + assistant.name);
	}

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = null;
		try {
			dob = format.parse("17/05/1992");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Employee employee = new Employee("Nhiep Phong", dob, 12.3);
		employee.setBirthday(new Date());
		String dobstr = format.format(employee.getBirthday());
		// System.out.println(dobstr);
		employee.display();
		Manager manager = new Manager("Bo Kinh Van", dob, 4.56, employee);
		manager.display();
	}
}
