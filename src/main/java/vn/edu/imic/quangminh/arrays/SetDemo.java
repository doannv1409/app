package vn.edu.imic.quangminh.arrays;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		/*
		 * Tinh chat cua ArrayList:
		 * - kich thuoc dong
		 * - cac phan tu duoc them vao theo dung thu tu
		 * - co the chua cac gia tri trung nhau
		 * 
		 * Tinh chat Set:
		 * - kich thuoc dong
		 * - cac phan tu them vao co the ko theo thu tu
		 * - khong chua cac gia tri trung nhau
		 */
		
		Set<Integer> numbers = new HashSet<>();
		
		//Them phan tu vao set
		numbers.add(12);
		numbers.add(23);
		
		printSet(numbers);

		//Add trung gia tri
		numbers.add(23);
		printSet(numbers);
	}

	private static void printSet(Set<Integer> numbers) {
		System.out.println("cac phan tu trong set: ");
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
}
