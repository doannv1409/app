package vn.edu.imic.quangminh.jdbc.model;

import java.util.Date;

public class Course {
	private int id;
	private String courseName;
	private Date startDate;
	private Date endDate;
	
	public Course() {
	}
	
	public Course(int courseId) {
		this.id = courseId;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
