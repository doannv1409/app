package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

public class Baitap05 {

	public static void main(String[] args) {
		String Ten;
		int Tuoi;
		String strTemp;
		String TinhTrangHonNhan;
		String GioiTinh;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten cua ban: ");
		Ten = sc.nextLine();
		if (Ten.isEmpty()) {
			System.out.println("Ban chua nhap ten");
		}
		sc = new Scanner(System.in);
		System.out.println("Tuoi cua ban: ");
		strTemp = sc.nextLine();
		if (strTemp.isEmpty()) {
			System.out.println("Ban chua nhap tuoi");
		}

		Tuoi = Integer.parseInt(strTemp);

		sc = new Scanner(System.in);
		System.out.println("Tinh trang hon nhan: ");
		TinhTrangHonNhan = sc.nextLine();
		if (TinhTrangHonNhan.isEmpty()) {
			System.out.println("Ban chua nhap tinh trang hon nhan");
		}
		System.out.println("Gioi tinh: ");
		GioiTinh = sc.nextLine();
		if (GioiTinh.isEmpty()) {
			System.out.println("Ban chua nhap gioi tinh");
		}
		if (GioiTinh.equals("Nam") && Tuoi >= 22 && TinhTrangHonNhan.equals("Chua co gia dinh")
				|| TinhTrangHonNhan.equals("Ly hon")) {
			System.out.println("Được phép tham gia");
		} else if (GioiTinh.equals("Nu") && Tuoi >= 19 && TinhTrangHonNhan.equals("Chua co gia dinh")
				|| TinhTrangHonNhan.equals("Ly hon")) {
			System.out.println("Được phép tham gia");
		} else {
			System.out.println("Không được phép tham gia");
		}
	}

}
