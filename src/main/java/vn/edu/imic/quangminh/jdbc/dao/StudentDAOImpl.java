package vn.edu.imic.quangminh.jdbc.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vn.edu.imic.quangminh.jdbc.DataSource;
import vn.edu.imic.quangminh.jdbc.model.Course;
import vn.edu.imic.quangminh.jdbc.model.Student;

public class StudentDAOImpl implements StudentDAO {
	private DataSource dataSource;
	private CourseDAO courseController;
	
	public StudentDAOImpl(DataSource dataSource, CourseDAO courseDao) {
		this.dataSource = dataSource;
		this.courseController = courseDao;
	}
	
	@Override
	public Student insert(Student s) {
		StringBuilder builder = new StringBuilder("INSERT INTO Students ");
		builder.append("(fullName, dateOfBirth, address, identityNumber, identityPlace, ")
		.append(" identityDate, email, phoneNumber, gender, courseId) ")
		.append(" VALUES(?, ?, ?, ?, ?, ?, ?, ? ,? ,?)");
		
		try {
			PreparedStatement statement = dataSource.getConnection().prepareStatement(builder.toString());
			statement.setString(1, s.getFullName());
			statement.setDate(2, new Date(s.getDateOfBirth().getTime()));
			statement.setString(3, s.getAddress());
			statement.setString(4, s.getIdentityNumber());
			statement.setString(5, s.getIdentityPlace());
			statement.setDate(6, new Date(s.getIdentityDate().getTime()));
			statement.setString(7, s.getEmail());
			statement.setString(8, s.getPhoneNumber());
			statement.setString(9, s.getGender());
			statement.setInt(10, s.getCourse().getId());
			
			statement.executeUpdate();
			return s;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			dataSource.closeConnection();
		}
	}

	@Override
	public Student update(Student s) {
		return null;
	}

	@Override
	public void delete(int studentId) {
		
	}

	@Override
	public List<Student> findAll() {
		List<Student> students = new ArrayList<>();
		String sql = "Select * from Students";
		try {
			
			Statement statement = dataSource.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				Student s = new Student();
				s.setAddress(resultSet.getString("address"));
				s.setDateOfBirth(resultSet.getDate("dateOfBirth"));
				s.setEmail(resultSet.getString("email"));
				s.setFullName(resultSet.getString("fullName"));
				s.setGender(resultSet.getString("gender"));
				s.setId(resultSet.getInt("id"));
				s.setIdentityDate(resultSet.getDate("identityDate"));
				s.setIdentityNumber(resultSet.getString("identityNumber"));
				s.setIdentityPlace(resultSet.getString("identityPlace"));
				s.setPhoneNumber(resultSet.getString("phoneNumber"));
				Course course = courseController.getBy(resultSet.getInt("courseId"));
				s.setCourse(course);
				
				students.add(s);
			}
			
			return students;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			dataSource.closeConnection();
		}
	}

	@Override
	public List<Student> findBy(int courseId) {
		return null;
	}

}
