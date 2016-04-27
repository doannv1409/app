package vn.edu.imic.nguyenvanduc.oop.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		Student sv1 = new Student();
		Student sv2 = new Student();
		Student sv3 = new Student();
		
		sv2.setId(2);
		sv2.setName("Nguyễn Văn C");
		sv2.setAddress("Mễ Trì");
		sv2.setAverageMark(9);

		sv1.setId(1);
		sv1.setName("Nguyễn Văn A");
		sv1.setAddress("Cổ Nhuế");
		sv1.setAverageMark(10);

		sv3.setId(3);
		sv3.setName("Nguyễn Văn D");
		sv3.setAddress("Mỹ Đình");
		sv3.setAverageMark(7);

		list.add(sv1);
		list.add(sv2);
		list.add(sv3);
		
		print(list);
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student svA, Student svB) {
				return svB.getName().compareTo(svA.getName());
				};
				} );
		
		System.out.println("Những sinh viên có điểm trung bình \n");
		for(int i=0;i<list.size();i++)
			if(list.get(i).getAverageMark()<=8)
			{
				System.out.println("ID: " + list.get(i).getId());
				System.out.println("Tên: " + list.get(i).getName());
				System.out.println("Địa chỉ: " + list.get(i).getAddress());
				System.out.println("Điểm TB: " + list.get(i).getAverageMark());
			}
		
	}	
	

	private static void print(List<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("ID: " + list.get(i).getId());
			System.out.println("Tên: " + list.get(i).getName());
			System.out.println("Địa chỉ: " + list.get(i).getAddress());
			System.out.println("Điểm TB: " + list.get(i).getAverageMark());
			System.out.println();
		}
	}

}
