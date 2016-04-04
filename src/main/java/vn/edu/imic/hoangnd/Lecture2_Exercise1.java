package vn.edu.imic.hoangnd;

import java.util.Scanner;

public class Lecture2_Exercise1 {
	public static void main(String[] args) {
		String str = "";
		String str2 = "";
		int count = 0;
		do {
			if (count != 0) {
				System.out.println("Sai thong tin dang nhap. Vui long nhap lai !");
			}
			System.out.println("Ten dang nhap:");
			Scanner scanner1 = new Scanner(System.in);
			str = scanner1.next();
			System.out.println("Mat khau:");
			Scanner scanner2 = new Scanner(System.in);
			str2 = scanner2.next();
			count++;
		} while (!str.equals("hoangnd") || !str2.equals("tieuthulonton"));
		System.out.println("Dang nhap thanh cong !");
	}
}
