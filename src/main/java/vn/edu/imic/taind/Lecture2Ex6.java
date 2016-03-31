package vn.edu.imic.taind;

import java.util.Scanner;

public class Lecture2Ex6 {
	public static void main(String[] args){
		System.out.println("Nhap vao 1 so:");
		int a;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Chon kieu so: 0 - So chan, 1 - So le");
		int intKieuSo;
		intKieuSo = scanner.nextInt();
		switch (intKieuSo) {
		case 0:
			System.out.println("Ket qua:");
			for (int i = 0; i <= a; i++) {
				if (i%2==0) {
					System.out.println(i);
				}
			}			
			break;
		case 1:
			System.out.println("Ket qua:");
			for (int i = 0; i <= a; i++) {
				if (i%2==0) {
					continue;
				}	
				System.out.println(i);
			}
			break;
		default: System.out.println("Khong biet chon kieu so a???");
			break;
		}		
	}
}
