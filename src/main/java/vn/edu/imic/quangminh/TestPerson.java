package vn.edu.imic.quangminh;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person(1, "Nguyen Van A")
				.gender("Nam").hairColor("Red")
				.hands(2).legs(2).language("English");
				
		System.out.println(p);		
				
	}
}
