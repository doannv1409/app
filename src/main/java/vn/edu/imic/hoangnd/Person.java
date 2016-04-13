package vn.edu.imic.hoangnd;

import java.util.Date;

public class Person {
	public String name;

	public Date birthday;

	public Person(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + "]";
	}
	
	public void display(){
		System.out.print(name + "," + birthday);
	}
}
