package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise3_Calculate {
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		float tong = 0;
		float hieu = 0;
		float tich = 0;
		float thuong = 0;
		
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
			tong = a + b;
		System.out.println("Ket qua la :" + tong);
		break;
		case(1):
			hieu = a - b;
		System.out.println("Ket qua la :" + hieu);
		break;
		case(2):
			tich = a * b;
		System.out.println("Ket qua la :" + tich);
		break;
		case(3):
			thuong = a / b;
		if(a != 0 && b == 0){
			System.out.println("Cannot divide by zero");
		}
		else if( a == 0 && b == 0){
			System.out.println("Result of function is underfined");
		}
		else{
		System.out.println("Ket qua la :" + thuong);
		}
		break;
		default:
			System.out.println("Sai O Dau Do Roi");
		}
		scan.close();
		scan1.close();
	}
	
}
