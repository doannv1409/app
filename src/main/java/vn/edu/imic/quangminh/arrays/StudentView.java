package vn.edu.imic.quangminh.arrays;

import java.util.ArrayList;
import java.util.List;

public class StudentView {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);

		StudentManager manager = new StudentManagerImpl();
		
		StudentView view = new StudentView();
		manager.sortByName(students);
		view.print(students);
		
		//Tim sinh vien co diem > 8
		List<Student> studentList = manager.filterByMark(students);
		view.print(studentList);
		
	}

	public void print(List<Student> students) {
		//Implement
	} 
	
	
}
