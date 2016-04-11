package vn.edu.imic.quangminh;

import java.util.Date;

public class Person {
	private int id;
	private String fullName;
	private int legs;
	private int hands;
	private String hairColor;
	private String language;
	private String gender;
	private Date dob;
	
	
	public Person(int id, String fullName) {
		this.id = id;
		this.fullName = fullName;
	}
	
	public Person legs(int legs) {
		this.legs = legs;
		return this;
	}
	
	public Person hands(int hands) {
		this.hands = hands;
		return this;
	}
	
	public Person hairColor(String hairColor) {
		this.hairColor = hairColor;
		return this;
	}
	
	public Person language(String language) {
		this.language = language;
		return this;
	}
	
	public Person gender(String gender) {
		this.gender = gender;
		return this;
	}
	public int getId() {
		return id;
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

	public String getFullName() {
		return fullName;
	}

	@Override
	public String toString() {
		//C1. Dung StringBuilder 
		StringBuilder str = new StringBuilder();
		str.append("------------------").append(id)
		.append("-------------------").append("\n")
		.append("+ Ho va Ten: ").append(fullName).append("\n")
		.append("+ So chan: ").append(legs)
		.append(" - So tay: ").append(hands).append("\n")
		.append("+ Ngon ngu: ").append(language).append("\n")
		.append("+ Gioi tinh: ").append(gender);
		
		//C2. Dung String format
		String info = "id: %s \n Ho va ten: %s\n So chan: %s - So tay: %s\n Ngon ngu: %s\n Gioi tinh: %s";
		return String.format(info, id, fullName, legs, hands, language, gender);
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
