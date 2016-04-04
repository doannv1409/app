package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise7_Count_Number {
	public static void main(String[] args) {

		int number = 0;
		int i = 0;
		int kind = 0;
		int j = 1;
		System.out.println("Moi Nhap Vao So Ban Muon :");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();

		System.out.println("Moi Ban Nhap Loai So : 0.Chan, 1.Le ");
		Scanner scan1 = new Scanner(System.in);
		kind = scan1.nextInt();
		switch (kind) {
		case (0):
			System.out.println("Day So Chan Nho Hon So Nhap Vao La :");
			for (i = 0; i < number; i++) {
				if ((i % 2) == 0) {
					System.out.print(i + " ");
				}
			}
			break;

		case (1):
			System.out.println("Day So Le Nho Hon So Nhap Vao La :");
		
		
			for (i = 1; i < number; i++) {
				if ((i % 2) != 0) {
					System.out.print(i + " ");
				}
			}
			break;
		default:
			System.out.println("Sai Cho Nao Do Roi!");
		}
		
		scan.close();
		scan1.close();
	}
}
