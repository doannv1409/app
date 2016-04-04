package vn.edu.imic.honghieu;

import java.util.Scanner;

public class baitap6 {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int a = sc.nextInt();
		System.out.println("Chon kieu so: 0.chan,1.le");
		int type = sc.nextInt();
		if (type == 0) {
			for (i = 0; i < a; i++) {
				if (i % 2 == 0) {
					System.out.println("day cac so chan: " + i);
				}
			}
		} else {
			for (i = 0; i <= a; i++) {
				if (i % 2 != 0) {
					System.out.println("day cac so le:  " + i);
				}
			}
		}
	}
}
