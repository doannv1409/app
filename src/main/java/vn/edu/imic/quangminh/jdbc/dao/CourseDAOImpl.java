package vn.edu.imic.quangminh.jdbc.dao;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.edu.imic.quangminh.jdbc.DataSource;
import vn.edu.imic.quangminh.jdbc.model.Course;

public class CourseDAOImpl implements CourseDAO {
	private DataSource dataSource;
	
	public CourseDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public Course getBy(int id) {
		String sql = "SELECT * FROM courses WHERE id = ?";
		try {
			PreparedStatement statement = dataSource.getConnection().prepareStatement(sql);
			statement.setInt(1, id);
			
			ResultSet resultSet = statement.executeQuery();
			Course c = new Course();
			while (resultSet.next()) {
				c.setId(id);
				c.setCourseName(resultSet.getString("courseName"));
				c.setEndDate(resultSet.getDate("endDate"));
				c.setStartDate(resultSet.getDate("startDate"));
			}
			
			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			dataSource.closeConnection();
		}
	}


	@Override
	public List<Course> findAll() {
		String sql = "SELECT * FROM courses";
		try {
			PreparedStatement statement = dataSource.getConnection().prepareStatement(sql);
			
			ResultSet resultSet = statement.executeQuery();
			List<Course> courses = new ArrayList<>();
			while (resultSet.next()) {
				Course c = new Course();
				c.setId(resultSet.getInt("id"));
				c.setCourseName(resultSet.getString("courseName"));
				c.setEndDate(resultSet.getDate("endDate"));
				c.setStartDate(resultSet.getDate("startDate"));
				courses.add(c);
			}
			
			return courses;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			dataSource.closeConnection();
		}
	}


	@Override
	public void insert(Course c) {
		StringBuilder builder = new StringBuilder("INSERT INTO courses ");
		builder.append("(courseName, startDate, endDate) ")
		.append(" VALUES(?, ?, ?)");
		
		try {
			PreparedStatement statement = dataSource.getConnection().prepareStatement(builder.toString());
			statement.setString(1, c.getCourseName());
			statement.setDate(2, new Date(c.getStartDate().getTime()));
			statement.setDate(3, new Date(c.getEndDate().getTime()));
			
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			dataSource.closeConnection();
		}
		
	}

}
