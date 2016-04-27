package vn.edu.imic.leanhtuan.Arrays;

public class Student {

	protected String id;
	protected String name;
	protected String address;
	protected double averageMark;
	
	public Student(String id, String name, String address, double averageMark){
		this.id = id;
		this.address = address;
		this.name = name;
		this.averageMark = averageMark;
		
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

	public void setName(String name) {
		this.name = name;
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
