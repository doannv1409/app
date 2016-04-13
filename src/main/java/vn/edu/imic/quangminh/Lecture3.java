package vn.edu.imic.quangminh;

import java.util.Scanner;

public class Lecture3 {
	public double b = 1;
	
	public double sum() {
		//local variable: bien dia phuong trong ham tinh tong
		double a = 2.9;
		
		return a + b;
	}
	
	public void print() {
		
		System.out.println("hello" + b);
	}
	
	public static double power(double x) {
		System.out.println("double: " + x);
		return x*x;
	}
	
	public static double power(int x) {
		System.out.println("int: " + x);
		return x*x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(power(2.3));
		System.out.println("-------------------");
		System.out.println(power(2));
		Scanner scanner = new Scanner(System.in);
		String username = readInput(scanner, "Nhap username: ");
		String password = readInput(scanner, "Nhap password: ");
		String old = readInput(scanner, "Nhap tuoi: ");
		
		int oldInt = Integer.valueOf(old);
		
		if(checkLogin(username, password)) {
			System.out.println("Dang nhap thanh cong, tuoi: " + oldInt);
		} else {
			System.out.println("Dang nhap khong thang cong, tuoi: " + oldInt);
		}
		
		scanner.close();
	}
	
	private static boolean checkLogin(String username, String password) {
		
		
		
		return "imic".equals(username) && "123456".equals(password);
	}

	public static String readInput(Scanner scanner, String message) {
		System.out.println(message);
		String input =  scanner.nextLine();
		return input;
	}
}
