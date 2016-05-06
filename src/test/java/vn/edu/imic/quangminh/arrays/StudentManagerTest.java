package vn.edu.imic.quangminh.arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import vn.edu.imic.trinhnv.StudentManagerImpl;





public class StudentManagerTest {
	private StudentManager manager;
	List<Student> students;
	private Student s1;
	private Student s2;
	private Student s3;
	private Student s4;
	
	@Before
	public void setUp() {
		manager = new StudentManagerImpl();
		students = new ArrayList<>();
		s1 = new Student(1, "A", "Ha Noi", 5.6);
		s2 = new Student(2, "D", "Ha Tay", 6);
		s3 = new Student(3, "C", "Ha Bac", 9);
		s4 = new Student(4, "G", "Ha Giang", 8);
	}
	
	@Test
	public void sortByName_EmptyList() {
		manager.sortByName(students);
		assertTrue(students.isEmpty());
	}
	
	@Test
	public void sortByName_ListContainsOneStudent() {
		students.add(s1);
		manager.sortByName(students);
		assertEquals("A", students.get(0).getName());
	}
	
	@Test
	public void sortByName_ListContains4Student() {
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		manager.sortByName(students);
		assertEquals("A", students.get(0).getName());
		assertEquals("C", students.get(1).getName());
		assertEquals("D", students.get(2).getName());
		assertEquals("G", students.get(3).getName());
	}
	
	@Test
	public void filterMark_EmptyList() {
		List<Student> filterByMark = manager.filterByMark(students);
		assertTrue(filterByMark.isEmpty());
	}
	
	@Test
	public void filterMark_OneStudentWithMarkSmallerThan8() {
		students.add(s1);
		
		List<Student> filterByMark = manager.filterByMark(students);
		assertTrue(filterByMark.isEmpty());
	}
	
	@Test
	public void filterMark_OneStudentWithMarkLargerThan8() {
		students.add(s3);
		
		List<Student> filterByMark = manager.filterByMark(students);
		assertEquals(1, filterByMark.size());
	}
	
	@Test
	public void filterMark_4Students() {
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		List<Student> filterByMark = manager.filterByMark(students);
		assertEquals(2, filterByMark.size());
		assertTrue(filterByMark.get(0).getMark() >= 8);
		assertTrue(filterByMark.get(1).getMark() >= 8);
	}
}
