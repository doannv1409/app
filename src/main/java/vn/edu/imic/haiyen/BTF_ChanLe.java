package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTF_ChanLe {

	public static int readInt(Scanner sc, String message) {
		System.out.println(message);
		int i = sc.nextInt();
		return i;
	}

	public static int checkchan(int a) {
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		return a;
	}

	public static int checkle(int a) {
		for (int i = 0; i <= a; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = readInt(sc, "nhap a: ");
		int kieu = readInt(sc, "chon kieu chan - 0, le - 1");
		if (kieu == 0) {
			System.out.println(checkchan(a));
		} else if (kieu == 1) {
			System.out.println(checkle(a));
		} else {
			System.out.println("nhap sai. nhap lai");
		}
		sc.close();
	}

}
