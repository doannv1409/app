package vn.edu.imic.quangminh.jdbc.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import vn.edu.imic.quangminh.jdbc.model.Course;
import vn.edu.imic.quangminh.jdbc.model.Student;

public class StudentView {
	private static final String TABS = "\t";
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public void printStudents(List<Student> students) {
		System.out.println("Danh sach sinh vien: ");
		StringBuilder builder = new StringBuilder("Ma SV");
		builder.append(TABS).append("Ho va Ten")
		.append(TABS).append("Ngay sinh")
		.append(TABS).append("Dia chi")
		.append(TABS).append("CMND")
		.append(TABS).append("Ngay cap CMND")
		.append(TABS).append("Moi cap CMND")
		.append(TABS).append("Email")
		.append(TABS).append("So dien thoai")
		.append(TABS).append("Gioi tinh")
		.append(TABS).append("Ma khoa hoc")
		.append(TABS).append("Ten khoa hoc");
		System.out.println(builder.toString());
		
		if(students.isEmpty()) {
			System.out.println("Khong co du lieu");
		} else {
			for (Student student : students) {
				System.out.println(student);
			}
		}
		
		System.out.println("-------------------------------");
	}
	
	@SuppressWarnings("resource")
	public int showOptions(){
		System.out.println("Cac chuc nang: ");
		System.out.println("1: Them sinh vien ");
		System.out.println("2: Them khoa hoc ");
		System.out.println("0: Thoat ");
		
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	public Course inputCourse() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		Course c = new Course();
		c.setCourseName(input("Ten khoa hoc: ", scanner));
		String startDate = input("Ngay bat dau: ", scanner);
		c.setStartDate(dateFormat.parse(startDate));
		String endtDate = input("Ngay ket thuc: ", scanner);
		c.setEndDate(dateFormat.parse(endtDate));
		
		return c;
	}
	
	public Student input(List<Course> courses){
		System.out.println("Tao sinh vien: ");
		Student s = new Student();
		Scanner scanner = new Scanner(System.in);
		String fullName = input("Ten SV: ", scanner);
		String dob = input("Ngay sinh (dd/MM/yyyy): ", scanner);
		String address = input("Dia chi: ", scanner);
		String identityNumber = input("CMND: ", scanner);
		String identityPlace = input("Noi cap CMND: ", scanner);
		String identityDate = input("Ngay cap CMND (dd/MM/yyyy): ", scanner);
		String email = input("Email: ", scanner);
		String phoneNumber = input("So dien thoai: ", scanner);
		String gender = input("Gioi tinh (M: nam, G: nu): ", scanner);
		
		System.out.println("Chon khoa hoc: ");
		for (Course course : courses) {
			System.out.println(course.getId() + "\t\t" + course.getCourseName());
		}
		
		String courseId = input("Ma khoa hoc: ", scanner);
		
		s.setAddress(address);
		s.setCourse(new Course(Integer.valueOf(courseId)));
		
		try {
			s.setDateOfBirth(dateFormat.parse(dob));
		} catch (ParseException e) {
			throw new RuntimeException("Sai dinh dang ngay sinh");
		}
		
		s.setEmail(email);
		s.setFullName(fullName);
		s.setGender(gender);
		try {
			s.setIdentityDate(dateFormat.parse(identityDate));
		} catch (ParseException e) {
			throw new RuntimeException("Sai dinh dang ngay cap CMND");
		}
		s.setIdentityNumber(identityNumber);
		s.setIdentityPlace(identityPlace);
		s.setPhoneNumber(phoneNumber);
		System.out.println("-------------------------------");
		return s;
	}

	private String input(String message, Scanner scanner) {
		System.out.print(message);
		return scanner.nextLine();
	}

	public void printCourses(List<Course> courses) {
		System.out.println("Khoa hoc: ");
		for (Course course : courses) {
			System.out.println(course.getId() + "\t\t" + course.getCourseName() 
			+ "\t\t" + course.getStartDate() + "\t\t" +course.getEndDate());
		}
		System.out.println("-------------------------------");
	}
}
