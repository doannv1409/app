package vn.edu.imic.trinhnv;

public class Dog extends Animal {
	
	public Dog(){
		
	}
	public void Sua(){
		System.out.println("+Biet sua");
	}
	public void Quay(){
		System.out.println("+Biet quay duoi");
	}
	
	@Override
	public void showInfor(){
		System.out.println("+Co duoi");
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.showInfor();
		animal.Chay();
		animal.Ngu();
		
		Dog dog = new Dog();
		System.out.println("Doi tuong Cho co dac diem rieng nhu:");
		dog.showInfor();
		dog.Sua();
		dog.Quay();
	}
}

