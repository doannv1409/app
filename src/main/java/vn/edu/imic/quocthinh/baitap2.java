package vn.edu.imic.quocthinh;

import java.util.Scanner;

public class baitap2 {
	public static void main(String[] args) {
		float a, b;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a=");
		a = sc.nextFloat();
		System.out.println("nhap b=");
		b = sc.nextFloat();
		System.out.println(" Chon phep toan : 1.+  2.-  3.x  4./ ");
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("a+b= " + (a + b));
		}
		if (i == 2) {
			System.out.println("a-b= " + (a - b));
		}
		if (i == 3) {
			System.out.println("axb= " + (a * b));
		}
		if (i == 4) {
			if (b == 0) {
				System.out.println("cannot divide by 0");
			}
			if ((a == 0) && (b == 0)) {
				System.out.println("result of function is underfined");
			} else {
				System.out.println("a/b= " + (a / b));
			}

		}
	}
}
