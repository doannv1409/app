package vn.edu.imic.linh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		int month = 0;
		int year = 0;
		int day = 31;
		do {
			try {
				System.out.println("Nhap nam can xem: ");
				year = scanner.nextInt();
				flag = true;
			} catch (InputMismatchException e) {
				System.out.println("Thang phai la mot so nguyen tu 1 toi 12");
				scanner.next();
			}
		} while (flag == false || year < 0);

		do {

			try {
				System.out.println("Nhap thang can xem: ");
				month = scanner.nextInt();
				flag = true;
			} catch (InputMismatchException e) {
				System.out.println("Thang phai la mot so nguyen tu 1 toi 12");
				scanner.next();
			}

		} while (month < 1 || month > 12 || flag == false);
		
		
		if(month==4 || month==6 || month==9 || month==11){
			day = 30;
		}
		if((year%4==0  && year%100!=0) || year%400==0 ){
			if(month==2){
				day = 29;
			}
		}
		else{
			day =28;
		}
		
		System.out.println("Thang "+month+" nam "+year+" co: "+day+" ngay");
		scanner.close();

	}

}
