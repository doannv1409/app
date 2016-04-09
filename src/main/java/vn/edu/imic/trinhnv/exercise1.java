package vn.edu.imic.trinhnv;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
    	System.out.println("Moi ban nhap vao hai so");
    	float A = 0, B = 0;
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Nhap a: ");
    	String a = sc.nextLine();
    	if (a == "" || a.isEmpty()) {
			System.out.println("Ban chua nhap a !");
			return;
		}else {
			A = Float.parseFloat(a);
		}
    	
    	System.out.print("Nhap b: ");
    	String b = sc.nextLine();
    	if (b == "" || b.isEmpty()) {
			System.out.println("Ban chua nhap b !");
			return;
		}else {
			B = Float.parseFloat(b);
		}
    	
    	System.out.println("Vui long chon phep tinh 0(+), 1(-), 2(*), 3(/): ");
       	String choice = sc.nextLine();
    	if (choice == "" || choice.isEmpty() ) {
			System.out.println("Ban chua chon phep toan !");
		}
    	switch (choice) {
		case "0":
			System.out.println("a + b = " + (A + B));
			break;
		case "1":
			System.out.println("a - b = " + (A - B));
			break;
		case "2":
			System.out.println("a * b = " + (A * B));
			break;
		case "3":
				if (A != 0 && B == 0) {
					System.out.println("Cannot divide by zero");
				}else if (A == 0 & B == 0) {
					System.out.println("Result of function is underfined");
				}
			System.out.println("a / b = " + (A / B));
			break;	
    	}
    	sc.close();
    }
}
