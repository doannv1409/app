package vn.edu.imic.hoangnd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {

	public double salary;

	public Employee(String name, Date birthday, double salary) {
		super(name, birthday);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthday=" + birthday + "salary=" + salary + "]";
	}

	public void display() {
		super.display();
		System.out.println("," + salary);
	}

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = null;
		try {
			dob = format.parse("17/05/1992");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Employee employee = new Employee("Banh Thi Noi", dob, 12.3);
		employee.setBirthday(new Date());
		String dobstr = format.format(employee.getBirthday());
		//System.out.println(dobstr);
		employee.display();
	}

}
