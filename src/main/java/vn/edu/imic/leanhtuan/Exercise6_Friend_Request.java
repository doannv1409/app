package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise6_Friend_Request {
	public static void main(String[] args) {
//
//		String hoten = "";
//		int tuoi = 0;
//		int tthn = 0;
//		String gt = "";
//		String kq = "";
//		String tthn1 = "";
//		String tuoi1 = "";
//
//		do {
//			System.out.println("Nhap Ten Cua Ban : ");
//			Scanner scan1 = new Scanner(System.in);
//			hoten = scan1.nextLine();
//
//		} while (hoten == null && hoten.length() == 0);
//
//		do {
//			System.out.println("Tuoi Cua Ban : ");
//			Scanner scan2 = new Scanner(System.in);
//			tuoi1 = scan2.nextLine();
//		} while (tuoi1 == null && tuoi1.length() == 0);
//
//		System.out.println("Tinh Trang Hon Nhan : 0(Doc Than), 1(Ly Hon), 2(Da Ket Hon)");
//		Scanner scan3 = new Scanner(System.in);
//		tthn1 = scan3.nextLine();
//		tthn = Integer.parseInt(tthn1);
//		if (tthn1 == null && tthn1.length() == 0) {
//			System.out.println("Moi Chon Tinh Trang Hon Nhan!");
//		}
//
//		switch (tthn) {
//		case (0):
//
//			break;
//
//		case (1):
//
//			break;
//
//		case (2):
//
//			break;
//		default:
//			System.out.println("Sai O Dau Do Roi!");
//
//		}
//
//		do {
//			System.out.println("Gioi Tinh Cua Ban : ");
//			Scanner scan4 = new Scanner(System.in);
//			gt = scan4.nextLine();
//		} while (gt == null && gt.length() == 0);
//
//		tuoi = Integer.parseInt(tuoi1);
//		System.out.println("Ket Qua Dang Ky La : ");
//		if ((tuoi >= 22 && gt.equalsIgnoreCase("nam") || (tuoi >= 19 && gt.equalsIgnoreCase("nu")))
//				&& (tthn == 0 || tthn == 1)) {
//			System.out.println("Duoc Phep Tham Gia");
//		} else {
//			System.out.println("Khong Duoc Phep Tham Gia");
//		}
//		scan3.close();

	}
	
	public static String readInput(Scanner scan, String message){
		System.out.println(message);
		String input = scan.nextLine();
		return input;
	}
	
	
}
