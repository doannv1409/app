package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTCT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao so a: ");
		String soa = sc.nextLine();
		System.out.println("Nhap vao so b: ");
		String sob = sc.nextLine();

		float a = 0, b = 0;

		if (soa.isEmpty()) {
			System.out.println("Chua nhap a");
		} else {
			a = Float.parseFloat(soa);// chuyen string ve float
		}

		if (sob.isEmpty()) {
			System.out.println("Chua nhap b");
		} else {
			b = Float.parseFloat(sob);
		}
		System.out.println("Chon phep toan: +, -, x, / ");
		String tinh = sc.nextLine();

		if (tinh.isEmpty()) {
			System.out.println("Chua chon phep toan");
		}
		if (tinh.equals("+")) {
			System.out.println("a + b = " + (a + b));
		} else if (tinh.equals("-")) {
			System.out.println("a - b = " + (a - b));
		} else if (tinh.equals("x")) {
			System.out.println("a x b = " + (a * b));
		} else if (tinh.equals("/")) {
			if (a != 0 && b == 0) {
				System.out.println("Cannot devide by zero");
			} else if (a == 0 && b == 0) {
				System.out.println("Result of function is underfined");
			} else {
				System.out.println("a / b = " + (float) (a / b));
			}

		}
	}
}
