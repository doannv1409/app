package vn.edu.imic.taind;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lecture2Ex5 {
	public static void main(String[] args){
		System.out.println("---Nhap cac thong tin theo yeu cau---");		
		System.out.println("Nhap ten cua ban:");
		Scanner scanner = new Scanner(System.in);
		
		String strName = scanner.nextLine();
		int intTuoi=0;
		try {
			System.out.println("Nhap tuoi cua ban:");
			intTuoi = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Chi duoc nhap so");
			scanner.next();
		}
		//System.out.println("Nhap tuoi cua ban:");
		//int intTuoi = scanner.nextInt();
		System.out.println("Chon tinh trang hon nhan: 0 - Chua co gia dinh hoac Ly hon, 1 - Da co gia dinh");
		int intHonNhan = scanner.nextInt();
		System.out.println("Chon gioi tinh cua ban: 0 - Nam, 1 - Nu, 2 - ba D");
		int intGioiTinh = scanner.nextInt();
		switch (intGioiTinh) {
		case 0:
			if (intTuoi>=22 && intHonNhan==0) {
				System.out.println("Ket qua dang ky: Duoc phep tham gia ket ban");
			}else {
				System.out.println("Ket qua dang ky: Khong duoc phep tham gia ket ban");
			}
			break;
		case 1:
			if (intTuoi>=19 && intHonNhan==0) {
				System.out.println("Ket qua dang ky: Duoc phep tham gia ket ban");
			}else {
				System.out.println("Ket qua dang ky: Khong duoc phep tham gia ket ban");
			}
			break;
		case 2:
			System.out.println("Ket qua dang ky: Be De nen deo ai them ket ban dau");
			break;
		default: System.out.println("Unknow!");
			break;
		}
		scanner.close();
	}
}
