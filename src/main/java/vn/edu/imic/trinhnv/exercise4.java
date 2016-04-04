package vn.edu.imic.trinhnv;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
    	Scanner sc =  new Scanner(System.in);
    	System.out.print("Input month : ");
    	int month = sc.nextInt();
    	
    	System.out.print("Input Year: ");
    	int year =  sc.nextInt();
    	 
    	if (month < 1 || month > 12) {
			System.out.println("Invalid Month !");
		}else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("There are 30 days in this month !");
		}else if (month == 2 && (year % 4 == 0 && year % 400 == 0 && year % 100 != 0)) {
			System.out.println("There are 28 days in this month");
		}else if (month == 2) {
			System.out.println("There are 29 days in this month");
		}else {
			System.out.println("There are 31 days in this month");
		} 
			
    	sc.close();
    }
}
