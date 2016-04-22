package vn.edu.imic.honghieu;

import java.util.Date;

public class PersonThuaKe {
	private String name;
	private Date sinhnhat;
	public PersonThuaKe(String name,Date birthday){
		this.name = name;
		this.sinhnhat = birthday;
	}
	public PersonThuaKe name(String name){
		this.name = name;
		return this;
	}
	public PersonThuaKe birthday(Date birthday){
		this.sinhnhat = birthday;
		return this;
	}
	public String getName() {
		return name;
	}
	public Date getSinhnhat() {
		return sinhnhat;
	}
	@Override
	public String toString() {
		return "PersonThuaKe [name=" + name + ", sinhnhat=" + sinhnhat + "]";
	}

public class Employee extends PersonThuaKe{
	protected double salary;
	public Employee(String name, Date birthday, double salary) {
		super(name, birthday);
	}
public double getSalary() {
		return salary;
	}
@Override
public String toString() {
	return "Employee [salary=" + salary + "]";
}
	
}
	}
