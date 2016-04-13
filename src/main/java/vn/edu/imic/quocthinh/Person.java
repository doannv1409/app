package vn.edu.imic.quocthinh;

import java.util.Date;

public class Person {
	public String name;
	public Date birthday;

	

	

	public Person name(String name) {
		this.name = name;
		return this;
	}

	public Person birthday(Date birthday) {
		this.birthday = birthday;
		return this;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + "]";
	}


		

	

	
}
