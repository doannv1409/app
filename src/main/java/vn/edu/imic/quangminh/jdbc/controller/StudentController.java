package vn.edu.imic.quangminh.jdbc.controller;

import java.util.List;

import vn.edu.imic.quangminh.jdbc.dao.CourseDAO;
import vn.edu.imic.quangminh.jdbc.dao.StudentDAO;
import vn.edu.imic.quangminh.jdbc.model.Course;
import vn.edu.imic.quangminh.jdbc.model.Student;
import vn.edu.imic.quangminh.jdbc.view.StudentView;

public class StudentController {
	private StudentView view;
	private StudentDAO studentDao;
	private CourseDAO courseDao;
	public StudentController(StudentView view, 
			StudentDAO studentDao, CourseDAO courseDao) {
		this.view = view;
		this.studentDao = studentDao;
		this.courseDao = courseDao;
	}
	
	public void insertNewStudent() {
		List<Course> courses = courseDao.findAll();
		Student student = view.input(courses);
		studentDao.insert(student);
	}
	
	public void updateView() {
		view.printStudents(studentDao.findAll());
	}
}
