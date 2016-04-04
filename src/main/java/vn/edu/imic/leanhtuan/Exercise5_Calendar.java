package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise5_Calendar {
	public static void main(String[] args) {
		int thang = 0;
		int nam = 0;

		System.out.println("Moi Nhap Vao Nam :");
		Scanner scan1 = new Scanner(System.in);
		nam = scan1.nextInt();

		System.out.println("Moi Nhap Vao Thang :");
		Scanner scan2 = new Scanner(System.in);
		thang = scan2.nextInt();

		switch (thang) {

		
		case (2):
			if (((nam % 400) == 0) || (((nam % 4) == 0) && ((nam % 100) != 0))) {
				System.out.println("Nam nhuan nen thang 2 co 29 ngay");
			} else {
				System.out.println("Thang 2 binh thuong co 28 ngay");
			}
			break;
			
		case (1):

		case (3):

		case (7):

		case (8):

		case (10):

		case (12):
			System.out.println("Thang  co 31 ngay");
			break;

		
		case (4):

		case (5):
		
		case (6):
		
		case (9):
		
		case (11):
			System.out.println("Thang  co 30 ngay");
			break;

		
		default:
			System.out.println("Ban Nhap Sai Roi!");
		}
		scan1.close();
		scan2.close();
	}
}
