package vn.edu.imic.hoangnd;

import java.util.Scanner;

public class Lecture2_Exercise6 {
	public static void main(String[] args) {
		String str = "";
		String str2 = "";
		System.out.println("Nhap so:");
		do {
			Scanner scanner1 = new Scanner(System.in);
			str = scanner1.next();
		} while (!isNumeric(str));
		System.out.println("So da nhap = " + str);
		System.out.println("Chon kieu chan hoac le: Chan-1; Le-2");
		do {
			Scanner scanner2 = new Scanner(System.in);
			str2 = scanner2.next();
		} while (!isNumeric1(str2));
		String noti = Integer.parseInt(str2) == 1 ? "So Chan" : "So Le";
		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		System.out.println("Kieu da chon la " + noti);
		int i = 0;
		int count = 0;
		if (num2 == 1) {
			System.out.println("Danh sach so chan la: ");
			while (i <= num1) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
					count++;
				}
				i++;
			}
			System.out.println("\nCo tat ca " + count + " so chan");
		} else if (num2 == 2) {
			System.out.println("Danh sach so le la: ");
			while (i <= num1) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
					count++;
				}
				i++;
			}
			System.out.println("\nCo tat ca " + count + " so le");
		}
	}

	public static boolean isNumeric1(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d == 1 || d == 2) {
				return true;
			} else {
				System.out.println("Chi nhap 1 hoac 2");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Chi nhap 1 hoac 2");
			return false;
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
}
