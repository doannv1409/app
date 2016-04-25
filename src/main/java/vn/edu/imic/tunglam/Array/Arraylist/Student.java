package vn.edu.imic.tunglam.Array.Arraylist;

public class Student {
	protected String id;
	protected String fullName;
	protected String address;
	protected double averageMark;

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

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Ma Sv ").append(id).append("/n")
			.append(" Ho va ten: ").append(fullName).append("/n")
			.append(" Dia chi: ").append(address).append("/n")
			.append(" Diem trung binh: ").append(averageMark);
		String info = "id: %s \n Ho va ten: %s\n Dia chi: %s\n Diem trung binh: %s\n ";
		return String.format(info, id, fullName, address , averageMark);
	}
}
