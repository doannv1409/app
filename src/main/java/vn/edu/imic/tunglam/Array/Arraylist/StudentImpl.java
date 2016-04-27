package vn.edu.imic.tunglam.Array.Arraylist;

import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class StudentImpl implements StudentManager {

	@Override
	public void sortByName(List<Student> students) {

	}

	@Override
	public List<Student> filterByMark(List<Student> students) {
		for (int i = 0; i < students.size() - 1; i++) {
			if (students.get(i).getMark() >= 8) {
			
			}
		}
		return null;
	}

}
