package vn.edu.imic.quangminh;

public class Cat extends Animal {
	
	public Cat(String name) {
		//Call default constructor
		//super();
		
		//Call constructor cua lop cha
		super(name);
	}

	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("Meooo...");
	}
	public static void main(String[] args) {
		Animal animal1 = new Animal("Animal1");
		animal1.sayHello();
		
		Cat cat1 = new Cat("Meo1");
		cat1.sayHello();
		
//		//UpCasting subClass -> superclass
//		Animal animal2 = new Cat("Meo2");
//		animal2.sayHello();
//		
	}
}
