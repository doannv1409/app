package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise5_Calendar {
	public static void main(String [] args){
		int thang = 0;
		int nam = 0;
		
		System.out.println("Moi Nhap Vao Nam :");
		Scanner scan1 = new Scanner(System.in);
		nam = scan1.nextInt();
		
		System.out.println("Moi Nhap Vao Thang :");
		Scanner scan2 = new Scanner(System.in);
		thang = scan2.nextInt();
		
		switch(thang){
		
		case(1):
			System.out.println("Thang 1 co 31 ngay");
		break;
		
		case(2):
			if(((nam % 400) == 0) || (((nam % 4) == 0) && ((nam % 100) != 0))){
				System.out.println("Nam nhuan nen thang 2 co 29 ngay");
			}
			else{
				System.out.println("Thang 2 co 28 ngay");
			}
		break;
		
		case(3):
			System.out.println("Thang 3 co 31 ngay");
		break;
		
		case(4):
			System.out.println("Thang 4 co 30 ngay");
		break;
		
		case(5):
			System.out.println("Thang 5 co 31 ngay");
		break;
		
		case(6):
			System.out.println("Thang 6 co 30 ngay");
		break;
		
		case(7):
			System.out.println("Thang 7 co 31 ngay");
		break;
		
		case(8):
			System.out.println("Thang 8 co 31 ngay");
		break;
		
		case(9):
			System.out.println("Thang 9 co 30 ngay");
		break;
		
		case(10):
			System.out.println("Thang 10 co 31 ngay");
		break;
		
		case(11):
			System.out.println("Thang 11 co 30 ngay");
		break;
		
		case(12):
			System.out.println("Thang 12 co 31 ngay");
		break;
		
		default:
			System.out.println("Ban Nhap Sai Roi!");
		}
	}
}
