package vn.edu.imic.trinhnv;

import java.util.Scanner;

public class exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Vui long nhap thong tin cua ban------");
		System.out.print("Nhap ten cua ban: ");
		String ten = sc.nextLine();
		System.out.print("Tuoi cua ban: ");
		String sotuoi = sc.nextLine();
		System.out.print("Tinh trang hon nhan: chua co gia dinh, ly hon, da co gia dinh ");
		String tinhtrang = sc.nextLine();
		System.out.print("Gioi tinh: Nam, Nu");
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

		if (tuoi < 19) {
			System.out.println("Khong duoc tham gia");
		} else if (gioitinh.equals("Nam") && tuoi >= 22
				&& (tinhtrang.equals("chua co gia dinh") || tinhtrang.equals("ly hon"))) {
			System.out.println("Duoc phep tham gia");
		} else if (gioitinh.equals("Nu") && (tinhtrang.equals("chua co gia dinh") || tinhtrang.equals("ly hon"))) {
			System.out.println("Duoc phep tham gia");
		}
		sc.close();
	}

}
