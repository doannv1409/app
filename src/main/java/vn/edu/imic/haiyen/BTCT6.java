package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTCT6 {
	public static void main(String[] args) {
		System.out.println("Nhap so: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Chon kieu: Chan-0, Le-1");
		int kieu = sc.nextInt();

		// int i=0;
		if (kieu == 0) {
			// while (a>i) {
			// if (i % 2 == 0) {
			// System.out.println(i + " ");
			// }
			// }
			System.out.println("Cac so chan:");
			for (int i = 0; i <= a; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("Cac so le:");
			for (int i = 0; i <= a; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
