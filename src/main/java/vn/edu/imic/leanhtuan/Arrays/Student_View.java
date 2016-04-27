package vn.edu.imic.leanhtuan.Arrays;

import java.util.ArrayList;
import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class Student_View {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setName("TuanLA");
		s2.setName("DucNV");
		s3.setName("TungNT");
		
		s1.setMark(8.5);
		s2.setMark(7.5);
		s3.setMark(8.9);
		
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);

		StudentManager manager = new Student_Manager_Impl();
		
		Student_View view = new Student_View();
		manager.filterByMark(students);
		view.print(students);
		
		System.out.println("===============================");
		
		//Tim sinh vien co diem > 8
		List<Student> studentList = manager.filterByMark(students);
		view.print(studentList);

	}
	
	public void print(List<Student> students){
		for(int i = 0; i < students.size(); i++){
		System.out.println("ID :" + students.get(i).getId());
		System.out.println("Ho Ten :" + students.get(i).getName());
		System.out.println("Dia Chi :" + students.get(i).getAddress());
		System.out.println("Diem :" + students.get(i).getMark());
		}
	}
}
