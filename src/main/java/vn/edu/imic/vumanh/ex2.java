package vn.edu.imic.vumanh;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so a:");
		String soa = sc.nextLine();
		System.out.println("nhap so b:");
		String sob = sc.nextLine();
		System.out.println("chon phep toan:");
		float a = 0, b = 0;
			if (soa.isEmpty()) {
				System.out.println("Ban chua nhap a");
			} else {
				a = Float.parseFloat(soa);
			}

		if (sob.isEmpty()) {
			System.out.println("Ban chua nhap b");
		} else {
			b = Float.parseFloat(sob);
		}

		System.out.println("+,-,*,/");
		String tinh = sc.nextLine();

		if (tinh.isEmpty()) {
			System.out.println("Ban chua chon phep toan");
		}
		if (tinh.equals("+")) {
			System.out.println("a+b =" + (a + b));
		} else if (tinh.equals("-")) {
			System.out.println("a-b =" + (a - b));
		} else if (tinh.equals("*")) {
			System.out.println("a*b =" + (a * b));
		} else if (tinh.equals("/")) {
		}
		if (a != 0 && b == 0) {
			System.out.println("Cannot divide by zero");
		} else if (a == 0 && b == 0) {
			System.out.println("Result of function is underfined");
		}
	}
}
