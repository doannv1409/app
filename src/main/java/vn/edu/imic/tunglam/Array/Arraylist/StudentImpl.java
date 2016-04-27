package vn.edu.imic.tunglam.Array.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class StudentImpl implements StudentManager {

	@Override
	public void sortByName(List<Student> students) {
		Collections.sort(students, new Comparator<Student>(){
			@Override
			public int compare (Student s1, Student s2){
				return (s1.getName().compareTo(s2.getName()));
			}
		});
	}

	@Override
	public List<Student> filterByMark(List<Student> students) {
		List<Student> B = new ArrayList();
		for (int i = 0; i < students.size() - 1; i++) {
			if (students.get(i).getMark() >= 8) {
				B.add(students.get(i));
			}
		}
		return B;
	}

}
