package vn.edu.imic.trinhnv;

import java.util.Arrays;

public class ArrayAlg <T>{

	public void print(T[]a){
		for (T t : a) {
			System.out.print("%s" + t);
		}
		System.out.println(" ");
	}
	
	public static <T> void print(T[] a, int start, int end){
		if (start >= end || start < 0 || end > a.length) {
			throw new RuntimeException("Invalid start or end !");
		}else {
			for (int i = start; i < end; i++) {
				System.out.print("%s" + a[i]);
			}
			System.out.println("Elements will be print: " +(end - start));
		}
	}
	
	public Pair<T> maxTwo(T [] a){
		Pair<T> result = new Pair<T>();
		Arrays.sort(a);
		result.setFirst(a[a.length - 1]);
		result.setSecond(a[a.length - 2]);
		return result;
	}
}
