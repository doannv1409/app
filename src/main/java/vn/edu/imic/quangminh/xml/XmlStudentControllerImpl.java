package vn.edu.imic.quangminh.xml;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlStudentControllerImpl implements XmlStudentController {

	private static final int START_ID_STUDENT = 1;
	private DocumentBuilderFactory factory;
	private TransformerFactory transformerFactory;
	private Document document;
	private String filePath;
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
			"dd/MM/yyyy");
	private final String FILE_NAME = "vn/edu/imic/quangminh/xml/students.xml";

	public XmlStudentControllerImpl() {
		// 1. Doc du lieu tu file resource
		filePath = Thread.currentThread().getContextClassLoader()
				.getResource(FILE_NAME).getPath();

		// 2. Khởi tạo các đối tượng thư viện đọc và ghi xml
		factory = DocumentBuilderFactory.newInstance();
		transformerFactory = TransformerFactory.newInstance();
	}

	@Override
	public List<XmlStudent> getStudents() throws Exception {
		List<XmlStudent> students = new ArrayList<>();
		// 1. Đọc dữ liệu từ file xml sang đối tượng Document
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		document = documentBuilder.parse(filePath);
		
		document.getDocumentElement().normalize();
		// Lấy danh sách các tag <STUDENT>
		
		NodeList nodeList = document.getElementsByTagName(XmlTags.STUDENT
				.toString());
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node nNode = nodeList.item(i);
			// Kiểm tra nốt có phải là 1 element ko
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				// Lay thong tin student từ các tag nêm trong element
				int id = Integer.valueOf(eElement.getAttribute(XmlTags.ID
						.toString()));
				String maSv = eElement
						.getElementsByTagName(XmlTags.MASV.toString()).item(0)
						.getTextContent();
				String gioiTinh = eElement
						.getElementsByTagName(XmlTags.GIOITINH.toString())
						.item(0).getTextContent();
				String ngaySinh = eElement
						.getElementsByTagName(XmlTags.NGAYSINH.toString())
						.item(0).getTextContent();
				String hoten = eElement
						.getElementsByTagName(XmlTags.HOTEN.toString()).item(0)
						.getTextContent();
				String email = eElement
						.getElementsByTagName(XmlTags.EMAIL.toString()).item(0)
						.getTextContent();
				String soDT = eElement
						.getElementsByTagName(XmlTags.SODIENTHOAI.toString())
						.item(0).getTextContent();
				String soCMND = eElement
						.getElementsByTagName(XmlTags.SOCMND.toString())
						.item(0).getTextContent();

				// Convert String ngay sinh sang Date
				Date ngaySinhDate = simpleDateFormat.parse(ngaySinh);

				// Thêm sinh viên vào trong danh sách để trả về kết quả
				students.add(new XmlStudent(id, maSv, gioiTinh, ngaySinhDate,
						hoten, email, soCMND, soDT));
			}
		}

		return students;
	}

	@Override
	public int insert(XmlStudent student) throws Exception {
		// đọc dữ liệu từ file xml
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		try {
			document = documentBuilder.parse(filePath);
		} catch (SAXException ex) {
			System.out.println(ex.getMessage());
		}
		
		if(document == null) {
			document = documentBuilder.newDocument();
			student.setId(START_ID_STUDENT);
		} else {
			// Lấy danh sách sinh viên để tạo id cho sinh viên mới.
			List<XmlStudent> students = getStudents();
			int lastId = students.size() == 0 ? 1 : students.get(
					students.size() - 1).getId() + 1;
			student.setId(lastId);
		}
		
		save(student);
		return student.getId();
	}

	private void save(XmlStudent student) throws Exception {
		
		// Lấy thông tin root node: <IMIC>
		Node rootNode = document.getFirstChild();;
		if(rootNode == null) {
			rootNode = document.createElement(XmlTags.IMIC.toString());
			document.appendChild(rootNode);
		} else {
			rootNode = document.getFirstChild();
		}
		
		Element newStudent = document.createElement(XmlTags.STUDENT.toString());
		newStudent.setAttribute(XmlTags.ID.toString(),
				String.valueOf(student.getId()));
		rootNode.appendChild(newStudent);

		createPropertiesTag(XmlTags.MASV.toString(), student.getMaSV(),
				newStudent, document);
		createPropertiesTag(XmlTags.HOTEN.toString(), student.getHoTen(),
				newStudent, document);
		createPropertiesTag(XmlTags.GIOITINH.toString(), student.getGioiTinh(),
				newStudent, document);
		createPropertiesTag(XmlTags.NGAYSINH.toString(),
				simpleDateFormat.format(student.getNgaySinh()), newStudent,
				document);
		createPropertiesTag(XmlTags.EMAIL.toString(), student.getEmail(),
				newStudent, document);
		createPropertiesTag(XmlTags.SODIENTHOAI.toString(),
				student.getSoDienThoai(), newStudent, document);
		createPropertiesTag(XmlTags.SOCMND.toString(), student.getSoCMND(),
				newStudent, document);

		// Ghi du liệu vào file xml
		transformData(document);
	}

	private void transformData(Document document) throws Exception {
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(new File(filePath));
		transformer.transform(source, result);
	}

	private void createPropertiesTag(String tagName, String value,
			Element parentElem, Document document) {
		Element childElement = document.createElement(tagName);
		childElement.appendChild(document.createTextNode(value));
		parentElem.appendChild(childElement);
	}

	@Override
	public void validateInput(XmlStudent student) throws RuntimeException {
		// Kiểm tra empty fields
		if (student.getMaSV() == null || student.getMaSV().isEmpty()) {
			throw new RuntimeException("Cần nhập mã sinh viên");
		}

		if (student.getHoTen() == null || student.getHoTen().isEmpty()) {
			throw new RuntimeException("Cần nhập họ và tên");
		}

		if (student.getNgaySinh() == null) {
			throw new RuntimeException("Cần nhập ngày sinh");
		}

		if (student.getGioiTinh() == null || student.getGioiTinh().isEmpty()) {
			throw new RuntimeException("Cần nhập giới tính");
		}

		if (student.getEmail() == null || student.getEmail().isEmpty()) {
			throw new RuntimeException("Cần nhập địa chỉ email");
		}

		if (student.getSoDienThoai() == null
				|| student.getSoDienThoai().isEmpty()) {
			throw new RuntimeException("Cần nhập số điện thoại");
		}

		if (student.getSoCMND() == null || student.getSoCMND().isEmpty()) {
			throw new RuntimeException("Cần nhập số chứng minh nhân dân");
		}
		// Kiểm tra định dang email
		if (!checkEmail(student.getEmail())) {
			throw new RuntimeException("Email không hợp lệ");
		}

		// Kiểm tra định dạng ngày sinh: dd/MM/yyyy
		if(!checkDate(student.getNgaySinh())) {
			throw new RuntimeException("Ngày sinh không đúng định dạng dd/MM/yyyy");
		}
		// Kiểm tra định dạng số CMND: 0-9, độ dài 3-10
		if(!checkSoCMND(student.getSoCMND())) {
			throw new RuntimeException("Số chứng minh nhân dân không hợp lệ");
		}
	}

	private boolean checkSoCMND(String soCMND) {
		String SO_CMND_PATTERN = "^[0-9]{3,10}$";
		Pattern pattern = Pattern.compile(SO_CMND_PATTERN);
		Matcher matcher = pattern.matcher(soCMND);
		return matcher.matches();
	}
	
	private boolean checkEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean checkDate(Date dateOfBirth) {
		try {
		    simpleDateFormat.format(dateOfBirth);
		} catch (Exception e) {
			 return false;
		}
		return true;
	}

	@Override
	public void remove(int idStudent) throws Exception {
		// 1. Đọc dữ liệu từ file xml sang đối tượng Document
				DocumentBuilder documentBuilder = factory.newDocumentBuilder();
				Document document = documentBuilder.parse(filePath);
				document.getDocumentElement().normalize();
				// Lấy danh sách các tag <STUDENT>
				NodeList nodeList = document.getElementsByTagName
						(XmlTags.STUDENT.toString());
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node nNode = nodeList.item(i);
					// Kiểm tra nốt có phải là 1 element ko
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						int id = Integer.valueOf(eElement.getAttribute
								(XmlTags.ID.toString()));
						if(id == idStudent) {
							//Xoa sinh vien khoi danh sách
							eElement.getParentNode().removeChild(nNode);
							break;
						}
					}
				}
				
				transformData(document);
	}
}
