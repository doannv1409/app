package vn.edu.imic.tung.array;

import java.util.Scanner;

public class Ex1 {
	public static void main ( String[] args){
		int A[] = new int[]{ 1, -2,3, 4, 5,6, 7, 8, 9, 10};
	
		int sum =0;
		for(int i=0; i<10; i++){
			System.out.println(" phan tu mang thu A["+i+"]"+"="+A[i]);
			sum += A[i];
			
		}
	    int min=A[0];
	    for (int i=1; i<10; i++){
	    	if (A[i]<min) min= A[i];
	    }
		System.out.println(" tong = "+sum);
		System.out.println(" gia tri min"+min);
		
	}

}
