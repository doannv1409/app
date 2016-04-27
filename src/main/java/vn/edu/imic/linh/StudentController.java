package vn.edu.imic.linh;

import java.util.ArrayList;

public interface StudentController {
	public void addStudent(Student student);
	public Student getStudent(int index);
	public int getStudentNumber();
	public void sortListByName();
	public ArrayList<Student> findStudentByMark(float avergeMark);
}
