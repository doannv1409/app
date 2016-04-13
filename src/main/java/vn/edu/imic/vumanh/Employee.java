package vn.edu.imic.vumanh;
import java.util.Scanner;
public class Employee extends Person {
	public Double salary;
	private double getSalary;
	private String toString;
	public Double getSalary() {
		return salary;
	}
	public double getGetSalary() {
		return getSalary;
	}
	public String getToString() {
		return toString;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setGetSalary(double getSalary) {
		this.getSalary = getSalary;
	}
	public void setToString(String toString) {
		this.toString = toString;
	}
	
		
	}

