package vn.edu.imic.trinhnv;

public class Person extends Animal {
	
	public Person(){
		
	}
	public void Noi(){
		System.out.println("+Biet noi");
	}
	
	public void Khieuvu(){
		System.out.println("+Biet khieu vu");
	}
	
	@Override
	public void showInfor(){
		System.out.println("+Co tay");
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.showInfor();
		animal.Chay();
		animal.Ngu();
		
		Person person = new Person();
		System.out.println("Doi tuong Nguoi co dac diem rieng nhu:");
		person.showInfor();
		person.Noi();
		person.Khieuvu();
	}
}
