package vn.edu.imic.quangminh.xml;

import java.util.Date;
import java.util.List;

public class XmlFileWriterDemo {
	
	private static XmlStudentController controller = new XmlStudentControllerImpl();
	public static void main(String[] args) {
		
		//Insert student
		XmlStudent student = new XmlStudent();
		student.setEmail("abc@gmail.com");
		student.setGioiTinh("Nam");
		student.setHoTen("Nguyen Van C");
		student.setMaSV("001");
		student.setNgaySinh(new Date());
		student.setSoCMND("12345");
		student.setSoDienThoai("9812936");
		
		try {
			controller.validateInput(student);
			controller.insert(student);
			printStudents();
			
			controller.remove(2);
			printStudents();
		} catch (RuntimeException re) {
			System.out.println(re.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void printStudents() throws Exception {
		List<XmlStudent> students = controller.getStudents();
		System.out.println(students);
	}
}
