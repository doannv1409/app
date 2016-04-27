package vn.edu.imic.tunglam.Array.Arraylist;

public class Student {
	protected String id;
	protected String name;
	protected String address;
	protected double averageMark;

	public Student(String id, String name, String address, double averageMark) {
		this.id = id;
		this.address = address;
		this.name = name;
		this.averageMark = averageMark;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mark=" + averageMark + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String fullName) {
		this.name = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

}
