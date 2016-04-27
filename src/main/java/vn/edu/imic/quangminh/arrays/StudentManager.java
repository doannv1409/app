package vn.edu.imic.quangminh.arrays;

import java.util.List;

public interface StudentManager {
	/**
	 * Sap xep danh sach sinh vien voi
	 * ten sap xep theo thu tu bang chu cai
	 * @param students
	 */
	void sortByName(List<Student> students);
	
	/**
	 * Tim cac sinh vien co diem lon hon 8
	 * @param students
	 * @return
	 */
	List<Student> filterByMark(List<Student> students);
	
}