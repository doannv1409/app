package vn.edu.imic.quangminh.jdbc.dao;

import java.util.List;

import vn.edu.imic.quangminh.jdbc.model.Student;

public interface StudentDAO {
	Student insert(Student s);

	Student update(Student s);

	void delete(int studentId);

	List<Student> findAll();

	List<Student> findBy(int courseId);
}
