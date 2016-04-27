package vn.edu.imic.haiyen;

public class ArrayStudent {
	private String id;
	private String name;
	private String address;
	private double averageMark;
	
	public ArrayStudent() {
		// TODO Auto-generated constructor stub
	}

	public ArrayStudent(String id, String name, String address, double d) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.averageMark = d;
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

	public void setAverageMark(float averageMark) {
		this.averageMark = averageMark;
	}
	
	

}
