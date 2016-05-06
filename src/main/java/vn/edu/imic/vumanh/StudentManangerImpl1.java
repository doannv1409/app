package vn.edu.imic.vumanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class StudentManangerImpl1 implements StudentManager{

	@Override
	public void sortByName(List<Student> students) {	
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return (s1.getName().compareTo(s2.getName())) ;
			}
	});	
	}

	@Override
	public List<Student> filterByMark(List<Student> student1s) {
		List<Student> student = new ArrayList<Student>();
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getMark() >= 8) {
				student.add(student.get(i));
			}
		}
		return student;
	}

}
