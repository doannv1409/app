package vn.edu.imic.trinhnv;

public class ArrayAlg <T>{
	private T a;
	
	public ArrayAlg(T arr){
		this.a = arr;
	}
	public <T> void print(T[]a){
		for (T t : a) {
			System.out.print(t + " ");
		}
	}
	
	public static <T> void print(T[] a, int start, int end){
		if (start >= end) {
			throw new RuntimeException("Invalid start or end !");
		}else {
			for (int i = start; i <= end; i++) {
				System.out.println(a[i]);
				System.out.println("");
			}
		}
	}
	
	public <T extends Comparable<T>>void maxTwo(T[] a){
		T max = a[0];
		for(T t : a){
			if (t.compareTo(max) > 0) {
				max = t;
			}
		}
		System.out.println(max);
	}
}
