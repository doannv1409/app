package vn.edu.imic.vumanh;

public class Students {
	private String masv;
	private String hoten;
	private String email;
	private String phone;
	
public Students() {
		
	}

	public Students(String masv, String hoten, String email, String phone) {
		this.masv = masv;
		this.hoten = hoten;
		this.email = email;
		this.phone = phone;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	
}
