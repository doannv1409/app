package vn.edu.imic.tunglam;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao Thang can xem: ");
		int thang = sc.nextInt();

		System.out.println("Nhap vao Nam can xem: ");
		int nam = sc.nextInt();

		if (thang < 1 || thang > 12) {
			System.out.println("nhap sai thang");
		} else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
			System.out.println("Thang " + thang + "nam " + nam + " co 30 ngay");
		} else if (thang == 2 && ((nam % 4 == 0 && nam % 100 != 0) && nam % 400 == 0)) {
			System.out.println("Thang 2 nam " + nam + " co 29 ngay");
		} else if (thang == 2) {
			System.out.println("Thang 2 nam " + nam + " co 28 ngay");
		} else {
			System.out.println("Thang " + thang + "nam " + nam + " co 31 ngay");
		}
	sc.close();
	}
}
//nam nhuan chia het cho 4, khong chia het cho 100 hoac chia het cho 400

