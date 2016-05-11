package vn.edu.imic.quangminh.xml;

import java.util.List;

public interface XmlStudentController {
	/**
	 * Thêm 1 sinh viên mới vào file xml
	 * @param student
	 * @return
	 * @throws Exception 
	 */
	int insert(XmlStudent student) throws Exception;

	/**
	 * Lấy danh sách sinh viên từ file xml
	 * @return
	 * @throws Exception
	 */
	List<XmlStudent> getStudents() throws Exception;

	/**
	 * Kiểm tra các trường nhập vào có đúng định dạng hay không
	 * @param student
	 * @throws RuntimeException
	 */
	void validateInput(XmlStudent student) throws RuntimeException;

	/**
	 * Xóa sinh viên có id tương ứng
	 * @param idStudent
	 * @throws Exception 
	 */
	void remove(int idStudent) throws Exception;
}
