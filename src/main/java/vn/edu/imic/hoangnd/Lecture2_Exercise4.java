package vn.edu.imic.hoangnd;

import java.util.Scanner;

public class Lecture2_Exercise4 {
	public static void main(String[] args) {
		String str = "";
		String str2 = "";
		String strMon = "";
		String strYear = "";
		System.out.println("Nhap thang: ");
		do {
			Scanner scanner1 = new Scanner(System.in);
			str = scanner1.next();
		} while (!isNumericMonth(str));
		System.out.println("Nhap nam: ");
		do {
			Scanner scanner2 = new Scanner(System.in);
			str2 = scanner2.next();
		} while (!isNumericYear(str2));
		int month = Integer.parseInt(str);
		int year = Integer.parseInt(str2);
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			strMon = "30";
		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				strMon = "29";
			} else
				strMon = "28";
		} else
			strMon = "31";
		System.out.println("==> Thang " + month + " Nam " + year + " co " + strMon + " Ngay");
	}

	public static boolean isNumericMonth(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d > 0 && d < 13) {
				return true;
			} else {
				System.out.println("Nhap thang tu 1 den 12");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap thang tu 1 den 12");
			return false;
		}
	}

	public static boolean isNumericYear(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d > 0 && d <= 9999) {
				return true;
			} else {
				System.out.println("Nhap nam tu 0 den 9999");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap nam tu 0 den 9999");
			return false;
		}
	}
}
