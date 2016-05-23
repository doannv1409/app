package vn.edu.imic.quangminh.jdbc;

import java.text.ParseException;
import java.util.List;

import vn.edu.imic.quangminh.jdbc.dao.CourseDAO;
import vn.edu.imic.quangminh.jdbc.model.Course;
import vn.edu.imic.quangminh.jdbc.view.StudentView;

public class CourseController {
	private StudentView view;
	private CourseDAO courseDao;
	public CourseController(StudentView view, CourseDAO courseDao) {
		this.courseDao = courseDao;
		this.view = view;
	}
	public void updateCourseView() {
		List<Course> courses = courseDao.findAll();
		view.printCourses(courses);
	}
	public void insertCourse() {
		try {
			Course course = view.inputCourse();
			courseDao.insert(course);
		} catch (ParseException e) {
			throw new RuntimeException(e.getMessage());
		}
		
	}

}
