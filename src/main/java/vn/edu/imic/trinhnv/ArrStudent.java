package vn.edu.imic.trinhnv;

import java.util.ArrayList;

public class ArrStudent {
	protected int id;
	protected String name;
	protected String address;
	protected double averageMark;

	public ArrStudent(int Id, String Name, String Address, double AvergeMark){
		this.id = Id;
		this.name = Name;
		this.address = Address;
		this.averageMark = AvergeMark;
	}
	
	public static void print(ArrayList<ArrStudent> student){
		for (int i = 0; i < student.size(); i++) {
			System.out.println("+Id:" + student.get(i).id + " +Name:" + student.get(i).name 
					+ " +Address:" + student.get(i).address + " +AvergeMark:" + student.get(i).averageMark);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<ArrStudent> student = new ArrayList<ArrStudent>();
		student.add(new ArrStudent(1, "Bien", "Hai Phong", 8.0));
		student.add(new ArrStudent(2, "Anh", "Ha Noi", 9.0));
		student.add(new ArrStudent(3, "Duong", "Hue", 6.0));
		student.add(new ArrStudent(4, "Em", "Da Nang",7.0));
		student.add(new ArrStudent(5, "Feel", "Sai Gon", 6.0));
		student.add(new ArrStudent(6, "Chung", "Ha Nam", 8.6));
		student.add(new ArrStudent(7, "Giang", "Thai Binh", 7.5));
		student.add(new ArrStudent(8, "Impress", "Vinh", 9.3));
		student.add(new ArrStudent(9, "Hoa", "Nghe An", 10.0));
		student.add(new ArrStudent(10,"Joker", "Thanh Hoa", 6.6));
		
		print(student);

	}
}