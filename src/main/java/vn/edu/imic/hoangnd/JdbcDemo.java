package vn.edu.imic.hoangnd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import vn.edu.imic.hoangnd.excercise.Students;
import vn.edu.imic.hoangnd.excercise.ConnectionUtils;

public class JdbcDemo {

	static SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		String query = "";
		Connection connection = ConnectionUtils.getMyConnection();

		Statement statement = connection.createStatement();

		// them sinh vien
		// query = "INSERT INTO Students(fullName, dateOfBirth, address, email,
		// gender, courseId) VALUES('Nguyen Van A', '2015-08-09', '28PVD',
		// 'abc@gmail.com', 'nu', '3')";
		// int rsi = statement.executeUpdate(query);

		// cap nhat sinh vien
		// query = "UPDATE Students SET fullName = 'Banh Thi Noi' WHERE
		// Students.Id = 1";
		// int irs = statement.executeUpdate(query);

		// Xoa sinh vien
		// query = "DELETE Students WHERE Students.Id = 10";
		// int irs = statement.executeUpdate(query);

		// in danh sach sinh vien
		// SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		query = "SELECT s.Id, s.fullname,s.dateOfBirth, s.address, s.email, s.gender, s.courseId, c.courseName FROM students s INNER JOIN courses c ON s.courseId = c.Id";

		ResultSet rs = statement.executeQuery(query);

		List<Students> studentsArr = new ArrayList<Students>();

		while (rs.next()) {
			studentsArr.add(new Students(rs.getInt("id"), rs.getString("fullname"), rs.getString("dateOfBirth"),
					rs.getString("address"), rs.getString("email"), rs.getString("gender"),
					rs.getString("courseName")));
		}

		System.out.println("Danh sach sinh vien: ");
		printScreen(studentsArr);

		// in danh sach sinh vien theo khoa hoc
		String str = "";
		String khs = "";
		System.out.println("Chon khoa hoc: 1-PHP; 2-C#; 3-JAVA");
		do {
			Scanner scanner1 = new Scanner(System.in);
			str = scanner1.next();
		} while (!isNumeric(str));
		int kh = Integer.parseInt(str);

		query = "SELECT s.Id, s.fullname,s.dateOfBirth, s.address, s.email, s.gender, s.courseId, c.courseName FROM students s INNER JOIN courses c ON s.courseId = c.Id WHERE s.courseId = "
				+ kh;
		ResultSet rs1 = statement.executeQuery(query);

		List<Students> studentsArr1 = new ArrayList<Students>();
		while (rs1.next()) {
			studentsArr1.add(new Students(rs1.getInt("id"), rs1.getString("fullname"), rs1.getString("dateOfBirth"),
					rs1.getString("address"), rs1.getString("email"), rs1.getString("gender"),
					rs1.getString("courseName")));
			khs = rs1.getString("courseName");
		}

		System.out.println("Danh sach sinh vien hoc khoa " + khs + ":");
		printScreen(studentsArr1);

		// in danh sach khoa hoc theo ngay
		System.out.println("Nhap ngay: ");
		Scanner scanner1 = new Scanner(System.in);
		str = scanner1.next();
		Date date1 = dt1.parse(str);
		// System.out.println(dt.format(date1));
		query = "SELECT * FROM courses WHERE endDate <= '" + dt.format(date1) + "'";
		rs1 = statement.executeQuery(query);
		System.out.println("Danh sach khoa hoc: ");
		while (rs1.next()) {
			System.out.print("Id: " + rs1.getInt("id"));
			System.out.print(" - Khoa hoc: " + rs1.getString("courseName"));
			System.out.print(" - Ngay bat dau: " + dt1.format(rs1.getDate("beginDate")));
			System.out.print(" - Ngay ket thuc: " + dt1.format(rs1.getDate("endDate")) + "\n");
		}

		scanner1.close();
		connection.close();
	}

	private static void printScreen(List<Students> student) throws ParseException {
		// Date dob =null;
		for (int i = 0; i < student.size(); i++) {
			Date date = dt.parse(student.get(i).getDateOfBirth());
			System.out.println("ID:" + student.get(i).getId() + " - FULLNAME:" + student.get(i).getFullName()
					+ " - DATE OF BIRTH:" + dt1.format(date) + " - ADDRESS:" + student.get(i).getAddress() + " - EMAIL:"
					+ student.get(i).getEmail() + " - GENDER:" + student.get(i).getGender() + " - COURSE:"
					+ student.get(i).getCourseName());
		}
	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
			return true;
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap lai:");
			return false;
		}
	}
}
