package vn.edu.imic.hoangnd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lecture2_Exercise3 {
	public static void main(String[] args) {
		String str = "";
		String str2 = "";
		System.out.println("Nhap so Kilogram:");
		do {
			Scanner scanner1 = new Scanner(System.in);
			str = scanner1.next();
		} while (!isNumeric(str));
		double pounds = Double.parseDouble(str) * 2.2;
		DecimalFormat df = new DecimalFormat("0.00");
		String pound = df.format(pounds);
		System.out.println("Ket qua: " + str + " Kilogram = " + pound + "Pounds");
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
