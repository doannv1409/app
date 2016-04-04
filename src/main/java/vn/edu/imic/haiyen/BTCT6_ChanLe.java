package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTCT6_ChanLe {
	public static void main(String[] args) {
		System.out.println("Nhap so: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Chon kieu: Chan-0, Le-1");
		int kieu = sc.nextInt();

		StringBuilder odd = new StringBuilder("Cac so le: ");
		StringBuilder even = new StringBuilder("Cac so le");
		for (int i = 0; i <= a; i++) {
			if (a % 2 == 0) {
				even.append(i).append(" ");
			} else {
				odd.append(i).append(" ");
			}
		}
		if (kieu == 0) {
			System.out.println(even.toString());
		} else {
			System.out.println(odd.toString());
		}

		// if (kieu == 0) {
		//
		// System.out.println("Cac so chan:");
		// for (int i = 0; i <= a; i++) {
		// if (i % 2 == 0) {
		// System.out.print(i + " ");
		// }
		// }
		// } else {
		// System.out.println("Cac so le:");
		// for (int i = 0; i <= a; i++) {
		// if (i % 2 != 0) {
		// System.out.print(i + " ");
		// }
		// }
		// }
		// }
	}
}
