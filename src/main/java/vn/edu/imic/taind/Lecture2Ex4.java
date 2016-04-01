package vn.edu.imic.taind;

import java.util.Scanner;

public class Lecture2Ex4 {
	public static void main(String[] args){
		int intThang;
		int intNam;
		System.out.println("Nhap vao thang can xem:");
		Scanner scanner = new Scanner(System.in);
		intThang = scanner.nextInt();
		System.out.println("Nhap vao nam can xem:");
		intNam = scanner.nextInt();
		if (intThang==4 || intThang==6 || intThang==9 || intThang==11) {
			System.out.println("Thang " + intThang + " Nam " + intNam + " co " + 30 + " Ngay");
		}else{
			if (intThang==2) {
				if ((intNam%4==0 && intNam%100!=0) || intNam%400==0) {
					System.out.println("Thang " + intThang + " Nam " + intNam + " co " + 29 + " Ngay");
				}else{
					System.out.println("Thang " + intThang + " Nam " + intNam + " co " + 28 + " Ngay");
				}
			}else{
				System.out.println("Thang " + intThang + " Nam " + intNam + " co " + 31 + " Ngay");
			}
		}
	}
}
