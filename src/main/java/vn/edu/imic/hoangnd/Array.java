package vn.edu.imic.hoangnd;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[1] = 1;
		int i = 0;
		System.out.println("Nhap day so: ");
		while (i < 10) {
			Scanner sc = new Scanner(System.in);
			arr[i] = Integer.parseInt(sc.next());
			i++;
		}
		System.out.println("Chuoi da nhap: ");
		int tong = 0;
		int min = arr[0];
		int max = arr[0];
		for (i = 0; i < arr.length; i++) {
			tong += arr[i];
			if (arr[i] <= min) {
				min = arr[i];
			}
			if (arr[i] >= max) {
				max = arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nTong: " + tong);
		System.out.println("So lon nhat la: " + max);
		System.out.println("So nho nhat la: " + min);
	}
}
