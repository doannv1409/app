package vn.edu.imic.quangminh.json;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import vn.edu.imic.quangminh.xml.Student;

public class ReadJsonFromFileDemo {
	
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		//Read one Object
		/**
		 * {
		 * 	  property: value,
		 * 	  property: value
		 * }
		 */
		String jsonStr = "{\"rollNum\" : \"001\", \"name\": \"To Quang Minh"
				+ "\", \"mark\": \"8\"}";
		try {
			Student s = mapper.readValue(jsonStr, Student.class);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Read list of students
		/**
		 * [
		 *   {
		 *      property: value,
		 *      property: value,
		 *   },
		 *   
		 *   {
		 *    	property: value,
		 *      property: value,
		 *   }
		 * ]
		 */
		try {
			InputStream jsonStudentsStream = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("vn/edu/imic/quangminh/json/students.json");
			
			TypeReference<List<Student>> valueType = new TypeReference<List<Student>>() {
			};
			
			List<Student> students = mapper.readValue(jsonStudentsStream, valueType);
			System.out.println(students);
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Read Map
		/**
		 * {
		 * 	key: value,
		 *  key: value
		 * }
		 */
		
		String jsonMap = "{\"001\" : \"Nguyen Van A\", " +
						  "\"002\" : \"Nguyen Van B\"}";
				
		try {
			TypeReference<Map<String, String>> valueType = new TypeReference<Map<String, String>>() {
			};
			
			Map<String, String> s = mapper.readValue(jsonMap, valueType);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Read from Json URL
		try {
			System.out.println("loading...");
			URL urlJson = new URL("http://jsonplaceholder.typicode.com/users");
			
			TypeReference<List<User>> valueType = new TypeReference<List<User>>() {
			};
			
			List<User> users = mapper.readValue(urlJson, valueType);
			
			for (User user : users) {
				System.out.println(user);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
