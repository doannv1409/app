package vn.edu.imic.haiyen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest extends ArrayStudent {
	public StudentTest() {
		super();
	}

	public static void main(String[] args) {
		ArrayStudent s1 = new ArrayStudent("A12", "Le An", "Nghe An", 8.0);
		ArrayStudent s2 = new ArrayStudent("A23", "Nguyen Mai", "Ha Noi", 8.5);
		ArrayStudent s3 = new ArrayStudent("B13", "C", "Hai Duong", 7.0);
		ArrayStudent s4 = new ArrayStudent("B14", "Nghia", "Nam Dinh", 9.0);
		ArrayStudent s5 = new ArrayStudent("C13", "Dat", "Vinh", 8.2);
		ArrayStudent s6 = new ArrayStudent("D13", "Loc", "Sai Gon", 6.5);
		ArrayStudent s7 = new ArrayStudent("C15", "E", "Hue", 7.5);
		ArrayStudent s8 = new ArrayStudent("E14", "Tien", "Da Nang", 9.5);
		ArrayStudent s9 = new ArrayStudent("D14", "Phat", "Hai Duong", 6.8);
		ArrayStudent s10 = new ArrayStudent("F13", "G", "Thanh Hoa", 8.4);

		List<ArrayStudent> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);

		displaylist(list);
		displaymark(list);

	}

	public static void displaylist(List<ArrayStudent> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Thong tin sinh vien thu " + i);
			System.out.println("Ma sinh vien: " + list.get(i).getId());
			System.out.println("Ho ten: " + list.get(i).getName());
			System.out.println("Dia chi: " + list.get(i).getAddress());
			System.out.println("Diem: " + list.get(i).getAverageMark());
			System.out.println("=========================");

			Collections.sort(list, new Comparator<ArrayStudent>() {
				@Override
				public int compare(ArrayStudent sv1, ArrayStudent sv2) {
					return (sv1.getName().compareTo(sv2.getName()));
				}
			});
		}
	}

	public static void displaymark(List<ArrayStudent> list) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAverageMark() >= 8) {
				System.out.println("Thong tin sinh vien co diem lon hon 8:");
				System.out.println("Ma sinh vien: " + list.get(i).getId());
				System.out.println("Ho ten: " + list.get(i).getName());
				System.out.println("Dia chi: " + list.get(i).getAddress());
				System.out.println("Diem: " + list.get(i).getAverageMark());
				System.out.println("=========================");
			}
		}
	}
}
