package vn.edu.imic.quangminh.jdbc;

import java.text.ParseException;

import vn.edu.imic.quangminh.jdbc.controller.StudentController;
import vn.edu.imic.quangminh.jdbc.dao.CourseDAO;
import vn.edu.imic.quangminh.jdbc.dao.CourseDAOImpl;
import vn.edu.imic.quangminh.jdbc.dao.StudentDAO;
import vn.edu.imic.quangminh.jdbc.dao.StudentDAOImpl;
import vn.edu.imic.quangminh.jdbc.view.StudentView;

public class StudentJdbcTest {
	public static void main(String[] args) throws ParseException {
		StudentView view = new StudentView();
		DataSource dataSource = new DataSource("localhost", "Y2016JC17", "sa", "123456");
		CourseDAO courseDao = new CourseDAOImpl(dataSource);
		StudentDAO studentDao = new StudentDAOImpl(dataSource, courseDao);
		
		StudentController controller = new StudentController(view, studentDao, courseDao);
		CourseController courseController = new CourseController(view, courseDao);
		int option = 0;
		do {
			option = view.showOptions();
			switch (option) {
			case 1:
				controller.updateView();
				controller.insertNewStudent();
				controller.updateView();
				break;
			case 2:
				courseController.updateCourseView();
				courseController.insertCourse();
				courseController.updateCourseView();
				break;
			}
		} while(option != 0);
		
	}
}
