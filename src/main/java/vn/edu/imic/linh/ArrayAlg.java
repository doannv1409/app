package vn.edu.imic.linh;

import java.util.Arrays;

public class ArrayAlg<T> {

	public void print(T[] array){
		StringBuffer string = new StringBuffer("Mang da nhap: ");
		for(T a : array){
			string.append(a).append(" ");
		}
		System.out.println(string.toString());
	}
	
	public void print(T[] array, int start, int end){
		StringBuffer string = new StringBuffer("Mang can cam tim la: ");
		if(start >= end || start < 0 || end > array.length){
			throw new RuntimeException("Invalid");
		}
		for(int i=start;i<end;i++){
			string.append(array[i]).append(" ");
		}
		System.out.println(string.toString());
		
	}
	
	public void maxTwo(T[] array){
		int lenght = array.length;
		Arrays.sort(array);
		Pair<Integer> pair = new Pair(array[lenght-2], array[lenght-1]);
		System.out.println(pair.toString());

	}
	
}
