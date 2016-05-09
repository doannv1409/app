package vn.edu.imic.leanhtuan.Arrays;

import java.util.Arrays;

public class ArrayAlg<T> {
	protected T start;
	protected T end;
	protected T a;

	public ArrayAlg() {

	}

	public ArrayAlg(T a, T start, T end) {
		this.start = start;
		this.end = end;
		this.a = a;

	}

	public static <T> void print(T[] a) {
		for (T element : a) {
			System.out.println(element);
		}

		System.out.println();
	}

	public void print(T[] a, int start, int end){
		if(start >= end || start < 0 || end > a.length){
		throw new RuntimeException("Gia Tri Bat Dau Va Ket Thuc Khong Hop Le");
			}
		for(int i = start; i < end ; i++){
			System.out.println(" :" + a[i]);
		}
		System.out.println("So phan tu duoc in ra la : " + a.length);
		}

	public Pair<T> maxTwo(T[] a) {
		Pair<T> result = new Pair<>();
		Arrays.sort(a);
		result.setFirst(a[a.length -1]);
		result.setSecond(a[a.length -2]);
		return result;
		
	}

}
