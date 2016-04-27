package vn.edu.imic.haiyen;

public class Animal {
	protected String name;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String name){
		this.name=name;
	}
	public void sayHello(){
		System.out.println("hello "+name);
	}

}
