package vn.edu.imic.hoangnd;

import java.util.Scanner;

public class Lecture2_Exercise2 {
	public static void main(String[] args) {
		String str = "";
		String str2 = "";
		String pheptoan = "";
		System.out.println("Nhap so a:");
		do {
			Scanner scanner1 = new Scanner(System.in);
			str = scanner1.next();
		} while (!isNumeric(str));

		System.out.println("Nhap so b");
		do {
			Scanner scanner2 = new Scanner(System.in);
			str2 = scanner2.next();
		} while (!isNumeric(str2));

		System.out.println("Chon phep toan: Cong-1; Tru-2; Nhan-3; Chia-4");
		do {
			Scanner tthn = new Scanner(System.in);
			pheptoan = tthn.next();
		} while (!isNumeric1(pheptoan));
		int pt = Integer.parseInt(pheptoan);
		double a = Double.parseDouble(str);
		double b = Double.parseDouble(str2);
		switch (pt) {
		case 1:
			System.out.println("Ket qua: a + b = " + a + " + " + b + " = " + (a + b));
			break;
		case 2:
			System.out.println("Ket qua: a - b = " + a + " - " + b + " = " + (a - b));
			break;
		case 3:
			System.out.println("Ket qua: a x b = " + a + " x " + b + " = " + (a * b));
			break;
		default:
			if (a == 0 && b == 0) {
				System.out.println("Ket qua: a/b = " + a + "/" + b + " = Khong xac dinh duoc ket qua");
			} else if (a != 0 && b == 0) {
				System.out.println("Ket qua: a/b = " + a + "/" + b + " = Khong the chia cho 0");
			} else
				System.out.println("Ket qua: a/b = " + a + "/" + b + " = " + (a / b));
			break;
		}

	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
			return true;
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap kieu so");
			return false;
		}
	}

	public static boolean isNumeric1(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d == 1 || d == 2 || d == 3 || d == 4) {
				return true;
			} else {
				System.out.println("Chon phep toan: Cong-1; Tru-2; Nhan-3; Chia-4");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Chon phep toan: Cong-1; Tru-2; Nhan-3; Chia-4");
			return false;
		}
	}
}
