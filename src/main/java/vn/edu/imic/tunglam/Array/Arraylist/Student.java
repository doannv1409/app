package vn.edu.imic.tunglam.Array.Arraylist;

public class Student {
	protected String id;
	protected String fullName;
	protected String address;
	protected double averageMark;

	public Student(String id, String fullName, String address, double averageMark){
		this.id = id;
		this.address = address;
		this.fullName = fullName;
		this.averageMark = averageMark;
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return fullName;
	}

	public void setName(String fullName) {
		this.fullName = fullName;
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
