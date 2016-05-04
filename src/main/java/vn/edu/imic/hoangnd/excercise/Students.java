package vn.edu.imic.hoangnd.excercise;

import java.util.ArrayList;
import java.util.Collections;

public class Students {
	protected int id;
	protected String name;
	protected String address;
	protected double averageMark;

	public Students() {

	}

	public Students(int id, String name, String address, double averageMark) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.averageMark = averageMark;
	}

	public static void main(String[] args) {
		Students s1 = new Students(1, "Hoang", "28 PVD", 3.0);
		Students s2 = new Students(2, "Tai", "28 PVD", 4.0);
		Students s3 = new Students(3, "Hung", "28 PVD", 5.0);
		Students s4 = new Students(4, "Hoa", "28 PVD", 1.0);
		Students s5 = new Students(5, "Tan", "28 PVD", 9.0);
		Students s6 = new Students(6, "Tung", "28 PVD", 6.0);
		Students s7 = new Students(7, "Trung", "28 PVD", 8.0);
		Students s8 = new Students(8, "Long", "28 PVD", 10.0);
		Students s9 = new Students(9, "Duong", "28 PVD", 7.0);
		Students s10 = new Students(10, "Hung", "28 PVD", 2.0);

		ArrayList<Students> studentsArr = new ArrayList<Students>();
		studentsArr.add(s1);
		studentsArr.add(s2);
		studentsArr.add(s3);
		studentsArr.add(s4);
		studentsArr.add(s5);
		studentsArr.add(s6);
		studentsArr.add(s7);
		studentsArr.add(s8);
		studentsArr.add(s9);
		studentsArr.add(s10);

		Collections.sort(studentsArr, new StringComparator());

		System.out.println("Danh sach sinh vien theo bang chu cai: ");
		print(studentsArr);

		ArrayList<Students> studentsArr8 = new ArrayList<Students>();
		for (int i = 0; i < studentsArr.size(); i++) {
			if (studentsArr.get(i).averageMark >= 8) {
				studentsArr8.add(studentsArr.get(i));
			}
		}
		System.out.println("\nDanh sach sinh vien co diem trung binh >=8: ");
		print(studentsArr8);
	}

	private static void print(ArrayList<Students> studentsArr) {
		for (int i = 0; i < studentsArr.size(); i++) {
			System.out.println("id: " + studentsArr.get(i).id + " - Ten: " + studentsArr.get(i).name + " - Dia chi: "
					+ studentsArr.get(i).address + " - Diem trung binh: " + studentsArr.get(i).averageMark);
		}
	}
}
