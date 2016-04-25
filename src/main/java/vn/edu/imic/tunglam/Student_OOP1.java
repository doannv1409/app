package vn.edu.imic.tunglam;

public class Student_OOP1 {
	private String msv;
	private String name;
	private String email;
	private String phoneNumber;

	public Student_OOP1() {

	}

	public Student_OOP1(String msv, String name, String email, String phoneNumber) {
		this.msv = msv;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getMasv(){
		return msv;
	}
	
	public void setMasv(String msv){
		this.msv=msv;
	}
	
	public String getTen(){
		return name;
	}
	
	public void setTen(String name){
		this.name=name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getPhone(){
		return phoneNumber;
	}
	
	public void setPhone(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	
}
