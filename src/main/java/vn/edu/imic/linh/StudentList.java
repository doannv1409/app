package vn.edu.imic.linh;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class StudentList implements StudentController{
	private ArrayList<Student> studentList;
	
	public StudentList(){
		this.studentList = new ArrayList<Student>();
	}
	
	@Override
	public void addStudent(Student student){
		this.studentList.add(student);
	}
	
	@Override
	public Student getStudent(int index){
		return this.studentList.get(index);
	}
	
	@Override
	public int getStudentNumber(){
		return this.studentList.size();
	}
	
	@Override
	public void sortListByName(){
		Collections.sort(studentList, new Student());
	}
	
	
	@Override
	public ArrayList<Student> findStudentByMark(float avergeMark){
		ArrayList<Student> students = new ArrayList<Student>();
		for(int i=0;i<this.studentList.size();i++){
			if(this.studentList.get(i).getAvergeMark() >= avergeMark){
				students.add(this.studentList.get(i));
			}
		}
		return students;
		
	}
	
	public static void main(String[] args){
		StudentController studentList = new StudentList();
		
		studentList.addStudent(new Student("id001","Linh", 9.3f));
		studentList.addStudent(new Student("id002","Hoang", 5.3f));
		studentList.addStudent(new Student("id003","Tai", 8.0f));
		studentList.addStudent(new Student("id004","Duc", 2.3f));
		studentList.sortListByName();
		
		for(int i = 0;i<studentList.getStudentNumber();i++){
			System.out.printf("Student %s: \n", i+1);
			System.out.println(studentList.getStudent(i).toString());
		}
		
		ArrayList<Student> studentSearchList = studentList.findStudentByMark(8);
		
		System.out.println("Cac sinh vien co diem trung binh >= 8 la: \n");
		for(int i = 0;i<studentSearchList.size();i++){
			System.out.printf("Student %s: \n", i+1);
			System.out.println(studentSearchList.get(i).toString());
		}
		
	}

}
