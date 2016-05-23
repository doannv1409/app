package vn.edu.imic.quangminh.jdbc.model;

import java.util.Date;

public class Student {
	private static final String DECORATOR = "\t";
	private int id;
	private String fullName;
	private Date dateOfBirth;
	private String address;
	private String identityNumber;
	private Date identityDate;
	private String identityPlace;
	private String email;
	private String phoneNumber;
	private String gender;
	private Course course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getIdentityDate() {
		return identityDate;
	}

	public void setIdentityDate(Date identityDate) {
		this.identityDate = identityDate;
	}

	public String getIdentityPlace() {
		return identityPlace;
	}

	public void setIdentityPlace(String identityPlace) {
		this.identityPlace = identityPlace;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("" + id);
		builder.append(DECORATOR).append(fullName)
		.append(DECORATOR).append(dateOfBirth)
		.append(DECORATOR).append(address)
		.append(DECORATOR).append(identityNumber)
		.append(DECORATOR).append(identityDate)
		.append(DECORATOR).append(identityPlace)
		.append(DECORATOR).append(email)
		.append(DECORATOR).append(phoneNumber)
		.append(DECORATOR).append(gender)
		.append(DECORATOR).append(course.getId())
		.append(DECORATOR).append(course.getCourseName());
		return builder.toString();
	}

}
