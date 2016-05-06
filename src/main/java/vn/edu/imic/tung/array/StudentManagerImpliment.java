package vn.edu.imic.tung.array;
import java.util.ArrayList;
import java.util.List;

import vn.edu.imic.quangminh.arrays.Student;
import vn.edu.imic.quangminh.arrays.StudentManager;

public class StudentManagerImpliment implements StudentManager {

	@Override
	public void sortByName(List<Student> students) {
		for(int i =0; i<students.size()-1; i++)
		{
			for(int j =0; j<students.size(); j++){
			if(	students.get(j).getName().compareTo(students.get(i).getName())>0){
				Student temp = students.get(j);
				students.set(j, students.get(i));
				students.set(i, temp);
				}
				
				
			}
		}	    
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> filterByMark(List<Student> students) {
		List <Student> temp = new ArrayList<>();
		for(int i =0; i< students.size() -1; i++){
			if( students.get(i).getMark()>=8){
				 temp = (List<Student>) students.get(i);
			}
		}
		
		return temp;
	}

}
