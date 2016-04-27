package vn.edu.imic.quangminh.arrays;

public class Student {
	private int id;
	private String name;
	private String address;
	private double mark;
	
	public Student() {

	}
	
	public Student(int id, String name, String address, double mark) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mark=" + mark + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
}
