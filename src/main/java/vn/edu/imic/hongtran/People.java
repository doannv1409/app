package vn.edu.imic.hongtran;

public class People {
	public People(){
		
	}
	public void Speak(){
		System.out.println("Speak");
	}
	public void Dance(){
		System.out.println("Dance");
	}
	public void ShowAnimal(){
		System.out.println("have leg");
		System.out.println("have ears");
	}
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.ShowAnimal();
		ani.Run();
		ani.Sleep();
		
		People baby= new People();
		baby.ShowAnimal();
		baby.Dance();
		baby.Speak();
	}

}
