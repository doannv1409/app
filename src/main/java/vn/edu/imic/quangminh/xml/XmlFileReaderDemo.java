package vn.edu.imic.quangminh.xml;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlFileReaderDemo {
	public static void main(String[] args) {
		//Doc file
		URL resource = Thread.currentThread().getContextClassLoader()
				.getResource("vn/edu/imic/quangminh/xml/students.xml");
		File xmlFile = new File(resource.getPath());
		
		try {
			/*
			 * Khoi tao documentBuilder de doc noi dung
			 * file xml vao Object cua Document
			 */
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(xmlFile);
			
			/*
			 * Duyet danh sach tag ten la student
			 * Lay danh sach theo doi tuong Student
			 */
			List<Student> students = new ArrayList<Student>();
			NodeList rootNodes = document.getElementsByTagName("Student");
			for (int i = 0; i < rootNodes.getLength(); i++) {
				Element item = (Element) rootNodes.item(i);
				Student student = new Student();
				
				String rollNum = item.getAttribute("rollNum");
				String name = item.getElementsByTagName("name").item(0).getTextContent();
				String mark = item.getElementsByTagName("mark").item(0).getTextContent();
				
				student.setMark(Double.valueOf(mark));
				student.setName(name);
				student.setRollNum(rollNum);
				
				students.add(student);
			}
			
			System.out.println(students);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
