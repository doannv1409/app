package vn.edu.imic.linh;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		String fullName = "";
		int gender = 0;
		int old = 1;
		int relationship = 0;

		do {
			System.out.print("Nhap ho ten cua ban: ");
			fullName = scanner.nextLine();
		} while (fullName.isEmpty());

		do {
			try {
				System.out.print("Nhap tuoi cua ban: ");
				old = scanner.nextInt();
				flag = true;
			} catch (InputMismatchException e) {
				System.out.print("Ban phai nhap 0 hoac 1");
				flag = false;
			}
		} while (old < 0 || flag == false);

		do {
			try {
				System.out.print("Nhap gioi tinh cua ban: 0-Nu, 1-Nam: ");
				gender = scanner.nextInt();
				flag = true;
			} catch (InputMismatchException e) {
				System.out.print("Ban phai nhap 0 hoac 1");
				flag = false;
			}
		} while (gender < 0 || gender > 1 || flag == false);

		do {
			try {
				System.out.print("Tinh trang hon nhan cua cua ban: 0-Chua ket hon 1-Da ket hon 2-Da ly hon: ");
				relationship = scanner.nextInt();
				flag = true;
			} catch (InputMismatchException e) {
				System.out.print("Ban phai nhap 0, 1 hoac 2");
				flag = false;
			}
		} while (relationship < 0 || relationship > 2 || flag == false);

		if (old < 19) {
			System.out.print("Khong phep tham gia ket ban");
		} else {
			if (gender == 1) {
				if (old >= 22 && relationship != 1) {
					System.out.print("Duoc phep tham gia ket ban");
				} else {
					System.out.print("Khong phep tham gia ket ban");
				}
			} else {
				if (relationship != 1) {
					System.out.print("Duoc phep tham gia ket ban");
				} else {
					System.out.print("Khong phep tham gia ket ban");
				}
			}
		}

	}
}
