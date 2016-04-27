package vn.edu.imic.leanhtuan.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student_Test extends Student {
	public Student_Test(String id, String name, String address, double averageMark) {
		super(id, name, address, averageMark);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Student student1 = new Student("SV01", "Nguyen Van A", "HN", 9.6);
		Student student2 = new Student("SV02", "Nguyen Van B", "HB", 8.6);
		Student student3 = new Student("SV03", "Nguyen Van C", "HA", 7.6);
		Student student4 = new Student("SV04", "Nguyen Van E", "HC", 7.6);
		Student student5 = new Student("SV05", "Nguyen Van D", "HD", 7.6);
		Student student6 = new Student("SV06", "Nguyen Van F", "HE", 9.6);
		Student student7 = new Student("SV07", "Nguyen Van Z", "HF", 7.6);
		Student student8 = new Student("SV08", "Nguyen Van H", "HG", 7.6);
		Student student9 = new Student("SV09", "Nguyen Van I", "HK", 8.6);
		Student student10 = new Student("SV10", "Nguyen Van K", "HI", 7.6);

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		list.add(student7);
		list.add(student8);
		list.add(student9);
		list.add(student10);
		
		
		print(list);
		System.out.println("-------------------------");
		printAlpha(list);
		
		

	}

	public static void print(List<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAverageMark() >= 8) {
				System.out.println("-----------" + i + "------------");
				System.out.println("Thong Tin Cua Sinh Vien ");
				System.out.println("Ma So Sinh Vien : " + list.get(i).getId());
				System.out.println("Ho Ten Sinh Vien : " + list.get(i).getName());
				System.out.println("Dia Chi Sinh Vien :" + list.get(i).getAddress());
				System.out.println("Diem Trung Binh : " + list.get(i).getAverageMark());
			}
		}
	}
	
	public static void printAlpha(List<Student> list){
		for(int i = 0; i < list.size(); i++){
			System.out.println("-----------" + i + "------------");
			System.out.println("Thong Tin Cua Sinh Vien ");
			System.out.println("Ma So Sinh Vien : " + list.get(i).getId());
			System.out.println("Ho Ten Sinh Vien : " + list.get(i).getName());
			System.out.println("Dia Chi Sinh Vien :" + list.get(i).getAddress());
			System.out.println("Diem Trung Binh : " + list.get(i).getAverageMark());

			Collections.sort(list, new Comparator<Student>() {
				public int compare(Student svA, Student svB) {
					return svA.getName().compareTo(svB.getName());
				};
			});

		}
	}
}
