package vn.edu.imic.hoangnd;

public class PeopleInfo {
	public static void main(String[] args) {
		People people1 = new People(1, "Nguyen Van Minh", 2, 2, "Den", "VNI", "Nam");
		People people2 = new People(2, "Pham Hong Nhung", 2, 2, "Nau", "VNI", "Nu");
		People people3 = new People(3, "Hoang Minh Hieu", 2, 2, "Vang", "VNI", "Nam");
		People people4 = new People(4, "J.Brave", 2, 2, "Do", "ENG", "Nam");
		// eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
		people1.setName("Nguyen Van Manh");
		people2.setName("Pham Thi Hong Nhung");

		// ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
		people1.setHairColor("Do");
		people1.setLanguage("VNI, ENG");

		people2.setHairColor("Tim");
		people2.setLanguage("VNI, ENG");

		people3.setHairColor("Xanh");
		people3.setLanguage("VNI, ENG,KOREA");

		people4.setHairColor("Vang");
		people4.setLanguage("ENG,VNI");

		// show people infomation
		System.out.println("-----------" + "1" + "------------");
		printPeople(people1);
		System.out.println("-----------" + "2" + "------------");
		printPeople(people2);
		System.out.println("-----------" + "3" + "------------");
		printPeople(people3);
		System.out.println("-----------" + "4" + "------------");
		printPeople(people4);

	}

	public static void printPeople(People people) {
		System.out.println("+ Ho va Ten: " + people.getName());
		System.out.println("+ So chan: " + people.getNumberOfLeg() + " - " + "So tay: " + people.getNumberOfArm() + " - "
				+ "Mau toc: " + people.getHairColor());
		System.out.println("+ Ngon ngu: " + people.getLanguage());
		System.out.println("+ Gioi tinh: " + people.getGender());
	}
}
