package vn.edu.imic.quangminh.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		/*
		 * Map<K, V>: K - key, V - value
		 * VD: <"001", 1>, <"002", 3>
		 */
		//Khai bao bien kieu Map
		Map<Integer, Student> studentsMap;
		
//		List<K, V> listA = new ArrayList<>();
		
		//Khoi tao 
		studentsMap = new HashMap<>();
		
		//them 1 sinh vien voi key = 1
		Student s1 = new Student(1, "Nguyen Van A", "Ha Noi", 9d);
		studentsMap.put(1, s1);
		
		//Lay thong tin sinh vien voi key=1
		Student student = studentsMap.get(1);
		System.out.println("Thong tin sinh vien: " + student);
		
		//Put cung 1 key = 1
		Student s2 = new Student(2, "Nguyen Van B", "Ha Tay", 8);
		studentsMap.put(1, s2);
		System.out.println("so luong sinh vien: " + studentsMap.size());
		System.out.println("Thong tin sinh vien: " + studentsMap.get(1));
		
		//Remove 1 sinh vien theo key
		studentsMap.remove(1);
		System.out.println("so luong sinh vien: " + studentsMap.size());
		
		studentsMap.put(2, s1);
		studentsMap.put(1, s2);
		printMap(studentsMap);
		
		System.out.println("-----------------");
		//Sort theo diem tang dan
		//Convert to list
		LinkedList<Entry<Integer, Student>> unsortedStudents = new LinkedList<>(studentsMap.entrySet());
		Collections.sort(unsortedStudents, new Comparator<Entry<Integer, Student>>() {
			@Override
			public int compare(Entry<Integer, Student> o1, 
					Entry<Integer, Student> o2) {
				double mark1  = o1.getValue().getMark();
				double mark2 = o2.getValue().getMark();
				return (int) (mark1 - mark2);
			}
		});
		
		//Convert list -> Map
		Map<Integer, Student> sortedStudents = new LinkedHashMap<>();
		for (Entry<Integer, Student> entry : unsortedStudents) {
			sortedStudents.put(entry.getKey(), entry.getValue());
		}
		
		printMap(sortedStudents);
	
		TreeMap<Integer, Student> sortByKey = new TreeMap<>(studentsMap);
		printMap(sortByKey);
	}

	private static void printMap(Map<Integer, Student> studentsMap) {
		for(Entry<Integer, Student> entry : studentsMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}
}
