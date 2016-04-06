package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTF2_TinhToan {

	public static String nhap(Scanner sc, String message) {
		System.out.println(message);
		String input = sc.nextLine();
		if(input.isEmpty()){
			System.out.println("Chua nhap");
		}
		return input;
	}

	public static int tong(int a, int b) {
		return a + b;
	}

	public static int hieu(int a, int b) {
		return a - b;
	}

	public static int tich(int a, int b) {
		return a * b;
	}

	public static float thuong(int a, int b) {
		if (a != 0 && b == 0) {
			System.out.println("Cannot devide by zero");
		} else if (a == 0 && b == 0) {
			System.out.println("Result of function is underfined");
		} else {
			return (float) a / b;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String soa = nhap(sc, "Nhap a: ");
		String sob = nhap(sc, "Nhap b: ");
		String soc = nhap(sc, "Nhap phep tinh: +, -, x, /");
		
		Integer a = Integer.parseInt(soa);
		Integer b = Integer.parseInt(sob);
	
		if (soc.equals("+")) {
			System.out.println("Tong la: " + tong(a, b));
		} else if (soc.equals("-")) {
			System.out.println("Hieu la: " + hieu(a, b));
		} else if (soc.equals("x")) {
			System.out.println("Tich la: " + tich(a, b));
		} else if (soc.equals("/")) {
			System.out.println("Thuong la: " + thuong(a, b));
		}
		sc.close();
	}

}
