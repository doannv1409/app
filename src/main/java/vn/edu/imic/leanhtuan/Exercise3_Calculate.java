package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise3_Calculate {
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		float a = 0 ;
		float b	= 0;
		String strTemp1;
		String strTemp2;
		
		System.out.println("Nhap Vao So a :");
		strTemp1 = scan.nextLine();
		if(strTemp1.isEmpty()){
			System.out.println("Ban Chua Nhap a");
			
		}
		
		System.out.println("Nhap Vao So b :");
		Scanner scan1 = new Scanner(System.in);
		strTemp2 = scan1.nextLine();
		if(strTemp2.isEmpty()){
			System.out.println("Ban Chua Nhap b");
			
		}
		
		a = Float.parseFloat(strTemp1);
		b = Float.parseFloat(strTemp2);
		
		System.out.println("Moi Chon Loai Phep Tinh : 0.Cong, 1.Tru, 2.Nhan, 3.Chia");
		int loai = scan.nextInt();
		
		switch(loai){
			
		case(0):
		
		System.out.println("Ket qua la :" + (a+b));
		break;
		case(1):
		
		System.out.println("Ket qua la :" + (a-b));
		break;
		case(2):
			
		System.out.println("Ket qua la :" + (a*b));
		break;
		case(3):
		
		if(a != 0 && b == 0){
			System.out.println("Cannot divide by zero");
		}
		else if( a == 0 && b == 0){
			System.out.println("Result of function is underfined");
		}
		else{
		System.out.println("Ket qua la :" + (a/b));
		}
		break;
		default:
			System.out.println("Sai O Dau Do Roi");
		}
		scan.close();
		scan1.close();
	}
	
}
