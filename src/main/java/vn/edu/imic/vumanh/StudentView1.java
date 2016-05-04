package vn.edu.imic.vumanh;
import java.util.ArrayList;

public class StudentView1 {
	public static void main(String args){
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();		
	ArrayList<Student1>Student1s=new ArrayList<>();
	Student1s.add(s1);
	Student1s.add(s2);
	Student1s.add(s3);
	
	Student_Manager mn=new StudentManangerImpl();
	
	StudentView1 view=new StudentView1();
	mn.sortByName(Student1s);
	view.print(Student1s);
	
	
	List<Student1>StudentList=mn.filterByMark(Student1s);
	view.print(StudentList);
	
	}
}
