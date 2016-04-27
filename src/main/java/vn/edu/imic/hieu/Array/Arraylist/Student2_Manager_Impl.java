package vn.edu.imic.hieu.Array.Arraylist;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class Student2_Manager_Impl implements StudentManager {

	@Override
	public void sortByName(List<Student> students) {
		 Collections.sort(students, new Comparator<Student>() {
	            @Override
	            public int compare(Student sv1, Student sv2) {
	                return (sv1.getName().compareTo(sv2.getName()));
	            }
	        });
	}

	@Override
	public List<Student> filterByMark(List<Student> students) {
		return null;
	}

}
