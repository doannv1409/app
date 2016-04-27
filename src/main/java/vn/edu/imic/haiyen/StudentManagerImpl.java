package vn.edu.imic.haiyen;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class StudentManagerImpl implements StudentManager {

	@Override
	public void sortByName(List<Student> students) {
		for (int i = 0; i < students.size(); i++) {
			Collections.sort(students, new Comparator<Student>() {
				@Override
				public int compare(Student sv1, Student sv2) {
					return (sv1.getName().compareTo(sv2.getName()));
				}
			});
		}
	}

	@Override
	public List<Student> filterByMark(List<Student> students) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getMark() >= 8)
				return students;
		}
		return null;
	}

}
