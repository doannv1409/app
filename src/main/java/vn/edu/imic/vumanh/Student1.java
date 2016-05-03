package vn.edu.imic.vumanh;

public class Student1 {
private int id;
private String Name;
private String address;
private double averagemark;
 public Student1(){
	 
 }
@Override
public String toString() {
	return "Student1 [id=" + id + ", Name=" + Name + ", address=" + address + ", averagemark=" + averagemark + "]";
}

public Student1(int id, String name, String address, double averagemark) {
	super();
	this.id = id;
	Name = name;
	this.address = address;
	this.averagemark = averagemark;
}

public int getId() {
	return id;
}

public String getName() {
	return Name;
}

public String getAddress() {
	return address;
}

public double getAveragemark() {
	return averagemark;
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	Name = name;
}

public void setAddress(String address) {
	this.address = address;
}

public void setAveragemark(double averagemark) {
	this.averagemark = averagemark;
}

}
