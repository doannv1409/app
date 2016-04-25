package vn.edu.imic.tunglam;

public class OOP1_TEST {
	public static void main(String[] args) {
		Student_OOP1 sv1 = new Student_OOP1();
		sv1.setMasv("d12cn01");
		sv1.setTen("Nguyen Van A");
		sv1.setEmail("Anguyen@gmail.com");
		sv1.setPhone("01689602289");
		System.out.println("Ma sinh vien \t  Ho va ten   \t   Email  \t\t Phone ");
		print(sv1);
	}

	private static void print(Student_OOP1 sv) {
		System.out.println(sv.getMasv() + " \t  " + sv.getTen() + " \t   " + sv.getEmail() + " \t " + sv.getPhone());
	}

}
