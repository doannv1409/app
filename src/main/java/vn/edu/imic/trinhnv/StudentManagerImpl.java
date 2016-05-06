package vn.edu.imic.trinhnv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class StudentManagerImpl implements StudentManager {

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
	public List<Student> filterByMark(List<Student> students) {
		List<Student> SV = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getMark() >= 8) {
				SV.add(students.get(i));
			}
		}
		return SV;
	}
	
}
