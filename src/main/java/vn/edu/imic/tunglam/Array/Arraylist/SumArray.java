package vn.edu.imic.tunglam.Array.Arraylist;

import java.util.Scanner;

public class SumArray {
	// tinh tong mang
	public static int sumArray(int[] A) {
		int tong = 0;
		for (int i = 0; i < A.length; i++) {
			tong = tong + A[i];
		}
		return tong;
	}

	// tim max cua mang
	public static int maxArray(int[] A) {
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			if (max < A[i]) {
				max = A[i];
			}
		}
		return max;
	}

	public static int minArray(int[] A) {
		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[10];
		for (int i = 0; i < 10; i++) {
			A[i] = scanner.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("A[" + i + "]= " + A[i]);
		}

		System.out.println("Tong cua mang la " + sumArray(A));
		System.out.println("Max cua mang la " + maxArray(A));
		System.out.println("Min cua mang la " + minArray(A));
		scanner.close();
	}
}
