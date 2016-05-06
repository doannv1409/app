package vn.edu.imic.quangminh.generic;

import java.util.Arrays;

public class ArrayAlg<T> {
	
	public void print(T[] a) {
		for (T t : a) {
			System.out.print(String.format("%s ", t));
		}
		System.out.println();
	}
	
	public void print(T[] a, int start, int end) {
		if(start >= end || start < 0 || end > a.length) {
			throw new RuntimeException("Invalid params start or end");
		}
		
		for (int i = start; i < end; i++) {
			System.out.print(String.format("%s ", a[i]));
		}
		
		System.out.println("So phan tu duoc in: " + (end - start));
	}
	
	public Pair<T> maxTwo(T[] a) {
		Pair<T> result = new Pair<T>();
		Arrays.sort(a);
		result.setFirst(a[a.length - 1]);
		result.setSecond(a[a.length - 2]);
		return result;
	}
	
	public static void main(String[] args) {
		ArrayAlg<Double> arrayAlg = new ArrayAlg<>();
		Double[] doubleNumbers = new Double[]{-12.3, 24.6, 0.0, 1.0};
		arrayAlg.print(doubleNumbers);
		arrayAlg.print(doubleNumbers, 0, 2);
		Pair<Double> maxTwo = arrayAlg.maxTwo(doubleNumbers);
		System.out.println(maxTwo);
		
		ArrayAlg<String> arrayAlg2 = new ArrayAlg<>();
		String[] strs = new String[]{"John", "Lam", "Nam"};
		arrayAlg2.print(strs);
		arrayAlg2.print(strs, 0, 2);
		Pair<String> maxTwo2 = arrayAlg2.maxTwo(strs);
		System.out.println(maxTwo2);
	}
}
