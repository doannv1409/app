package vn.edu.imic.hongtran;

public class Dog {
	public Dog(){
		
	}
	public void Bark(){
		System.out.println("Can Bark");
	}
	public void Wag(){
		System.out.println("Can Wag Tail");
	}
	public void ShowAnimal(){
		System.out.println("Have tail");
	}
	
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.ShowAnimal();
		ani.Run();
		ani.Sleep();
		
		Dog puppy= new Dog();
		System.out.println("this dog can:");
		puppy.ShowAnimal();
		puppy.Bark();
		puppy.Wag();
	}

}
