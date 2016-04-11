package vn.edu.imic.nguyenvanduc;

public class Baitap01OOP {

	public static void main(String[] args) {
		Student Student1 = new Student("SV01 ", "Hoàng Văn Thanh ", "thanhhv@gmail.com ", "0988 123 456");
		Student Student2 = new Student("SV02 ", "Phạm Thị Thùy Linh ", "linhptt@gmail.com ", "0988 123 457");
		Student Student3 = new Student("SV03 ", "Trần Văn Hiếu ", "hieutv@gmail.com ", "0988 123 458");
		Student Student4 = new Student("SV04 ", "Nguyễn Văn Hùng ", "hungnv@gmail.com ", "0988 123 459");
		print(Student1);
		System.out.println();
		print(Student2);
		System.out.println();
		print(Student3);
		System.out.println();
		print(Student4);
	}

	private static void print(Student student) {
		System.out.print(student.getMaSV());
		System.out.print(student.getHoTen());
		System.out.print(student.getEmail());
		System.out.print(student.getPhone());
	}
}

class Student {
	private String MaSV;
	private String HoTen;
	private String Email;
	private String Phone;

	public Student() {
		MaSV = "SV00";
		HoTen = "Nguyen Van A";
		Email = "abc@gmail.com";
		Phone = "123456789";
	}

	public Student(String MaSV, String HoTen, String Email, String Phone) {
		this.Email = Email;
		this.HoTen = HoTen;
		this.MaSV = MaSV;
		this.Phone = Phone;
	}

	public String getMaSV() {
		return MaSV;
	}

	public void setMaSV(String MaSV) {
		this.MaSV = MaSV;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String HoTen) {
		this.HoTen = HoTen;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String Phone) {
		this.Phone = Phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
}
