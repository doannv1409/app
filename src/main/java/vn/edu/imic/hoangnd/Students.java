package vn.edu.imic.hoangnd;

public class Students {
	public String StudentID;
	public String Name;
	public String Email;
	public String Phone;


	public Students() {

	}

	public Students(String StudentID, String Name, String Email, String Phone) {
		this.StudentID = StudentID;
		this.Name = Name;
		this.Email = Email;
		this.Phone = Phone;
	}
	public String getID(){
		return this.StudentID;
	}
	public String getName(){
		return this.Name;
	}
	public String getEmail(){
		return this.Email;
	}
	public String getPhone(){
		return this.Phone;
	}

}
