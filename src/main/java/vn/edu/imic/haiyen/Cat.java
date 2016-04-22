package vn.edu.imic.haiyen;

public class Cat extends Animal{
	private int numberOfEyes;
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int numberOfEyes){
		//super.name=name;
		super(name);//goi constructor cua lop cha
		this.numberOfEyes=numberOfEyes;//rieng cua cat
	}
	
	public int getNumberOfEyes(){
		return numberOfEyes;
	}
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.sayHello();
		
		
		
	}

}
