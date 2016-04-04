package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTCT5_CapDoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------NHAP CAC THONG TIN CAN THIET------");
		System.out.println("Nhap ten cua ban: ");
		String ten = sc.nextLine();
		System.out.println("Tuoi cua ban: ");
		String sotuoi = sc.nextLine();
		System.out.println("Tinh trang hon nhan: chua co gia dinh, ly hon, da co gia dinh ");
		String tinhtrang = sc.nextLine();
		System.out.println("Gioi tinh: Nam, Nu");
		String gioitinh = sc.nextLine();

		int tuoi = 0;
		if (ten.isEmpty()) {
			System.out.println("Chua nhap ten");
		}
		if (sotuoi.isEmpty()) {
			System.out.println("Chua nhap tuoi");
		} else {
			tuoi = Integer.parseInt(sotuoi);
		}
		if (tinhtrang.isEmpty()) {
			System.out.println("Chua nhap tinh trang hon nhan");
		}
		if (gioitinh.isEmpty()) {
			System.out.println("Chua nhap gioi tinh");
		}

		System.out.println("KET QUA:");

//		if (tuoi < 19 || tinhtrang.equals("da co gia dinh") || (gioitinh.equals("nam") && tuoi < 22)) {
//			System.out.println("ko dc phep");
//		} else {
//			System.out.println("ok");
//		}

		 if (tuoi < 19) {
		 System.out.println("Khong duoc tham gia");
		 } else if (gioitinh.equals("Nam") && tuoi >= 22
		 && (tinhtrang.equals("chua co gia dinh") || tinhtrang.equals("ly hon"))) {
		 System.out.println("Duoc phep tham gia");
		 } else if (gioitinh.equals("Nu") && (tinhtrang.equals("chua co gia dinh") || tinhtrang.equals("ly hon"))) {
		 System.out.println("Duoc phep tham gia");
		 } else{
			 System.out.println("ko duoc phep");
		 }

		if (tuoi <= 19) {
			System.out.println("Khong duoc tham gia");
		} else if (gioitinh.equals("Nam") && tuoi >= 22
				&& (tinhtrang.equals("chua co gia dinh") || tinhtrang.equals("ly hon"))) {
			System.out.println("Duoc phep tham gia");
		} else if (gioitinh.equals("Nu") && (tinhtrang.equals("chua co gia dinh") || tinhtrang.equals("ly hon"))) {
			System.out.println("Duoc phep tham gia");
		}

	}

}
