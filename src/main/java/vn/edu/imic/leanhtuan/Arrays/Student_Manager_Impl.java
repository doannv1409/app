package vn.edu.imic.leanhtuan.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class Student_Manager_Impl implements StudentManager{

	@Override
	public void sortByName(List<Student> students) {
		Collections.sort(students, new Comparator<Student>() {
			public int compare(Student svA, Student svB) {
				return svA.getName().compareTo(svB.getName());
			};
		});

	}

	@Override
	public List<Student> filterByMark(List<Student> students) {
		for(int i = 0; i < students.size(); i++){
			if(students.get(i).getMark() >=8 ){
			
			}
		}
		return students;
		
	}

}
