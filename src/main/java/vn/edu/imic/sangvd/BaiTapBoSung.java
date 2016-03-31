package vn.edu.imic.sangvd;

import java.util.Scanner;

public class BaiTapBoSung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		int count1 = 0;//count1 de lam cho viec nhap thang khong qua 1 lan khi dung 
		int count2 = 0;//count2 de lam cho viec nhap nam khong qua 1 lan khi dung 
		int month;
		
		do{
		System.out.print("Vui long nhap vao thang : ");
		 month = sc.nextInt();
		 if(month <= 0 || month > 12){
			System.out.println(" Thang khong ton tai xin nhap lai");
			System.out.println( "Hay nhan \"1 \" de ket thuc viec nhap ");
			 ch = sc.nextInt();
			count1 ++;
		 }else{
			 count1 = count1 +2;
		 }
		}while( ch != 1 && count1 != 2);
		
		int year;
		do{
		System.out.print("Vui long nhap vao nam :");
		year =sc.nextInt();
		if(year < 0 ){
			System.out.println("Nam khon ton tai xin nhap lai");
			System.out.println("Nhap phim \"2\" de ket thuc");		
			ch = sc.nextInt();
			count2 ++;
		}else{
			count2 = count2 + 2;
		}
		}while(ch != 2 && count2 != 2);
		
		if(month > 0 && month <=12){
		if(month == 4 || month == 6 || month == 9 || month == 11){
			System.out.println("Thang co 30 ngay");
		}else if(month == 2){
			if( year % 4 == 0 && year % 400 == 0)
			System.out.println("Thang co 29 ngay");
			else
			System.out.println("Thang co 28 ngay");
		}else {
			System.out.println("Thang co 31 ngay");
		}
		}else
			System.out.println("Thang khong ton tai");
		
	}
}
