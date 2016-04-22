package vn.edu.imic.tunglam;

public class Person {
	private int id;
	private String fullName;
	private int legs;
	private int hands;
	private String hairColor;
	private String language;
	private String gender;

	public Person(int id, String fullName){
		this.id=id;
		this.fullName=fullName;
	}
	
	
	
	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public int getLegs() {
		return legs;
	}

	public int getHands() {
		return hands;
	}

	public String getHairColor() {
		return hairColor;
	}

	public String getLanguage() {
		return language;
	}

	public String getGender() {
		return gender;
	}

}
