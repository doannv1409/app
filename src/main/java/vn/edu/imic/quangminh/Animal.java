package vn.edu.imic.quangminh;

public class Animal {
	protected String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
}
