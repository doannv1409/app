package vn.edu.imic.tung;


public class Oop2_Test {
	public static void main(String[] args) {

		Oop2_People p1 = new Oop2_People(1, "Nguyen Van Minh", 2, 2, "Den", "VNI", "Nam");
		p1.setHoten("Nguyen Van Manh");
		p1.setMautoc("Do");
		p1.setNgonngu("VNI, ENG");

		Oop2_People p2 = new Oop2_People(2, "Pham Hong Nhung", 2, 2, "Nau", "VNI", "Nu");
		p2.setHoten("Pham Thi Hong Nhung");
		p2.setMautoc("Tim");
		p2.setNgonngu("VNI, ENG");

		Oop2_People p3 = new Oop2_People(3, "Hoang Minh Hieu", 2, 2, "Vang", "VNI", "Nam");
		p3.setMautoc("Xanh");
		p3.setNgonngu("VNI, ENG, KOREA");

		Oop2_People p4 = new Oop2_People(4, "J.Brave", 2, 2, "Do", "ENG", "Nam");
		p4.setMautoc("Vang");
		p4.setNgonngu("ENG, VNI");
		print(p1);
		print(p2);
		print(p3);
		print(p4);
		}
	public static void print(Oop2_People p) {
		System.out.println("------------------" + p.getId() + "-------------------");
		System.out.println("+ Ho va Ten: " + p.getHoten());
		System.out.println("+ So chan: " + p.getSochan() + "- So tay: " + p.getSotay() + "- Mau toc: " + p.getMautoc());
		System.out.println("+ Ngon ngu: " + p.getNgonngu());
		System.out.println("+ Gioi tinh: " + p.getGioitinh());
	}

}
