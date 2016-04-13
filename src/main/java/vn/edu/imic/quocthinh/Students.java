package vn.edu.imic.quocthinh;

public class Students {
	public String masv;
	public String hoten;
	public String email;
	public int phone;

	Students(String masv, String hoten, String email, int phone) {
		this.masv = masv;
		this.hoten = hoten;
		this.email = email;
		this.phone = phone;
	}

	public static void print(Students students) {
		System.out.println(students.masv);
		System.out.println(students.hoten);
		System.out.println(students.email);
		System.out.println(students.phone);
	}

	public static void main(String agrs[]) {
		Students sv1 = new Students("1", "hoang van thanh", "abc@gmail.com", 1241556);
		print(sv1);
		Students sv2 = new Students("2", "pham thuy linh", "abcc@gmail.com", 123124124);
		print(sv2);
	}

}
