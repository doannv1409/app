package vn.edu.imic.quangminh.jdbc.dao;

import java.util.List;

import vn.edu.imic.quangminh.jdbc.model.Course;

public interface CourseDAO {
	Course getBy(int id);

	List<Course> findAll();

	void insert(Course course);
	
}
