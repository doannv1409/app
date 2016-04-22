package vn.edu.imic.hongtran;

public class Animal {
	protected int leg;
	protected int ears;
	
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public int getEars() {
		return ears;
	}
	public void setEars(int ears) {
		this.ears = ears;
	}
	public Animal(String run, String sleep,int leg,int ears){
		
	}
	public Animal() {
		
	}
	public void Run(){
		System.out.println("Can run");
	}
	public void Sleep(){
		System.out.println("Can sleep");
	}
	public void ShowAnimal(){
		System.out.println("Characteristics of Animal");
		System.out.println("have leg");
		System.out.println("have ears ");
		System.out.println("sleep");
		System.out.println("run");
	}
	
	
}
