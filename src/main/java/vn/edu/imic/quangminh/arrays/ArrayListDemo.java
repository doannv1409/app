package vn.edu.imic.quangminh.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Khai bao mang dong cas so nguyen
		List<Integer> numbers = new ArrayList<>();
		
		//Them gia tri vao mang
		numbers.add(12);
		numbers.add(14);
		numbers.add(12);
		
		//in gia trong mang dong
		print(numbers);
		
		//in last index of 12
		System.out.println("last index of 12: " + numbers.lastIndexOf(12));
		
		//ArrayList add collection
		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(-1);
		numbers2.addAll(numbers);
		print(numbers2);
		
		boolean isContainZero = numbers2.contains(0);
		if(isContainZero) {
			System.out.println("Mang chua phan tu 0");
		} else {
			System.out.println("Mang khong chua phan tu 0");
		}
		
		//remove -1
		numbers2.remove(0);
		print(numbers2);
		
		// remove ca mang numbers
		numbers2.removeAll(numbers);
		System.out.println("isEmpty: " + numbers2.isEmpty());
		
		//set index = 3 gia tri 100
		numbers2.add(100);
		numbers2.set(0, -200);
		print(numbers2);
		
		//sublist
		numbers2.add(100);
		numbers2.add(20); // -200 100 20 2
		numbers2.add(2); 
		System.out.println("Sub list: ");
		List<Integer> newList = numbers2.subList(0, 3);
		print(newList);
		
		//Sort tang dan
//		bubbleSort(numbers2);
		Collections.sort(numbers2, new IntegerComporator());
		System.out.println("Sorted list: ");
		print(numbers2);
		
		//iterator:
		newList = new ArrayList<>();
		newList.add(12);
		newList.add(13);
		newList.add(1);
		
		for (int i = 0; i < newList.size(); i++) {
			newList.remove(i);
		}
		
		System.out.println("remove using for loop, NewList: ");
		print(newList);
		
		newList = new ArrayList<>();
		newList.add(12);
		newList.add(13);
		newList.add(1);
		System.out.println("remove using iterator : ");
		Iterator<Integer> iterator = newList.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
		System.out.println("NewList: ");
		print(newList);
	}
	
	
	@SuppressWarnings("unused")
	private static void bubbleSort(List<Integer> numbers) {
		for (int i = 0; i < numbers.size() - 1; i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				if(numbers.get(j) < numbers.get(i)) {
					int temp = numbers.get(j);
					numbers.set(j, numbers.get(i));
					numbers.set(i, temp);
				}
			}
		}
		
	}

	private static void print(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("index: " + i + " value: " + numbers.get(i));
		}
	}
}
