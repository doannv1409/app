package vn.edu.imic.linh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = 0;
		double b = 0;
		boolean flag = false;
		do {
			System.out.print("Nhap so a: ");
			try {
				a = scanner.nextDouble();
				flag = true;
			} catch (InputMismatchException e) {
				System.out.println("a phai la mot so thuc");
				flag = false;
				scanner.next();
			}
		} while (flag == false);

		do {
			try {
				System.out.print("Nhap so b: ");
				b = scanner.nextDouble();
				flag = true;
			} catch (InputMismatchException e) {
				System.out.println("b phai la mot so thuc");
				System.out.println();
				flag = false;
				scanner.next();
			}
		} while (flag == false);

		int select = 0;
		do {

			System.out.println("Chon phep toan: 1-Cong 2-Tru 3-Nhan 4-Chia:");
			try {
				select = scanner.nextInt();
				flag = true;
			} catch (InputMismatchException e) {
				System.out.println("Ban phai nhap vao 1 so thu 1 toi 4");
				System.out.println();
				flag = false;
				scanner.next();
			}

		} while (select < 0 || select > 4 || flag == false);

		if (select == 1) {
			System.out.println("Ket qua a + b la: " + (a + b));
		} else if (select == 2) {
			System.out.println("Ket qua a - b la: " + (a - b));
		} else if (select == 3) {
			System.out.println("Ket qua a * b la: " + (a * b));
		} else {
			if (b != 0) {
				System.out.println("Ket qua a / b la: " + (a / b));
			} else if (b == 0) {
				if (a == 0) {
					System.out.println("Result of function is underfined");
				} else {
					System.out.println("Cannot divided by zero");
				}

			}
		}

	}

}
