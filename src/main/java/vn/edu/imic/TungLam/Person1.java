package vn.edu.imic.tunglam;

public class Person1 {
	protected String name;
	protected String birthday;

	public Person1() {
		
	}
	
	public String toString() {
		return name + "," + birthday;
	}

	public void display(String name, String birthday) {
		System.out.println(name+","+birthday);
	}
}
