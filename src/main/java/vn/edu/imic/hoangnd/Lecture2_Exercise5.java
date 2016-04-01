package vn.edu.imic.hoangnd;

import java.util.Scanner;

public class Lecture2_Exercise5 {
	public static void main(String[] args) {
		String strTuoi = "";
		String strTTHN = "";
		String strGT = "";

		System.out.println("Nhap ten: ");
		Scanner ten = new Scanner(System.in);
		String strTen = ten.nextLine();

		System.out.println("Nhap tuoi: ");
		do {
			Scanner tuoi = new Scanner(System.in);
			strTuoi = tuoi.nextLine();
		} while (!isNumeric(strTuoi));

		System.out.println("Tinh trang hon nhan: Chua co gia dinh-1; Co gia dinh-2; Ly hon-3");
		do {
			Scanner tthn = new Scanner(System.in);
			strTTHN = tthn.next();
		} while (!isNumeric1(strTTHN));

		System.out.println("Gioi tinh: Nam-1; Nu-2; Khac-3");
		do {
			Scanner gt = new Scanner(System.in);
			strGT = gt.next();
		} while (!isNumeric1(strGT));

		System.out.println("Thong tin dang ky:");
		System.out.println("Ho va ten: " + strTen);
		System.out.println("Tuoi: " + strTuoi);
		String noti1 = Integer.parseInt(strTTHN) == 1 ? "Chua co gia dinh"
				: Integer.parseInt(strTTHN) == 2 ? "Co gia dinh" : "Ly hon";
		System.out.println("Tinh trang hon nhan: " + noti1);
		String noti2 = Integer.parseInt(strGT) == 1 ? "Nam" : Integer.parseInt(strGT) == 2 ? "Nu" : "Khac";
		System.out.println("Gioi tinh: " + noti2);
		String noti3 = "";
		if (Integer.parseInt(strGT) == 1 && Integer.parseInt(strTuoi) >= 22
				&& (Integer.parseInt(strTTHN) == 1 || Integer.parseInt(strTTHN) == 3)) {
			noti3 = "Duoc phep tham gia";
		} else if (Integer.parseInt(strGT) == 2 && Integer.parseInt(strTuoi) >= 19
				&& (Integer.parseInt(strTTHN) == 1 || Integer.parseInt(strTTHN) == 3)) {
			noti3 = "Duoc phep tham gia";
		} else
			noti3 = "Khong duoc phep tham gia";
		System.out.println("\nKet qua dang ky: " + noti3);
	}

	public static boolean isNumeric1(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d == 1 || d == 2 || d == 3) {
				return true;
			} else {
				System.out.println("Chi nhap 1 hoac 2 hoac 3");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Chi nhap 1 hoac 2 hoac 3");
			return false;
		}
	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
			return true;
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap lai tuoi: ");
			return false;
		}
	}
}
