package vn.edu.imic.tunglam;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao so a: ");
		String soa = sc.nextLine();
		System.out.println("Nhap vao so b: ");
		String sob = sc.nextLine();

		int a = 0, b = 0;

		if (soa.isEmpty()) {
			System.out.println("Chua nhap a");
		} else {
			a = Integer.parseInt(soa);
		}

		if (sob.isEmpty()) {
			System.out.println("Chua nhap b");
		} else {
			b = Integer.parseInt(sob);
		}
		System.out.println("Chon phep toan: +, -, x, / ");
		String tinh = sc.nextLine();

		if (tinh.isEmpty()) {
			System.out.println("Chua chon phep toan");
		}
		if (tinh.equals("+")) {
			System.out.println("a + b = " + (a + b));//neu khong co ngoac( a+b)thi se ra a, b
			//neu de a+b+" " thi se ra ket qua a+b
			//uu tien xet kieu cua cach nhau dau + truoc, vi du string + string thi mac dinh toan bo phia sau deu String
			//neu de 2 int gan nhau thi cong lai truoc
		} else if (tinh.equals("-")) {
			System.out.println("a - b = " + (a - b));
		} else if (tinh.equals("x")) {
			System.out.println("a x b = " + (a * b));
		} else if (tinh.equals("/")) {
			if (a != 0 && b == 0) {
				System.out.println("Cannot devide by zero");
			} else if (a == 0 && b == 0) {
				System.out.println("Result of function is underfined");
			} else {
				System.out.println("a / b = " + (float) a / b);
			}

		}
	sc.close();
	}
}
//neu a, b la int thi ket qua la
//thuc hien trong ngoac truoc (float)a/b
//neu dung float(a/b) thi ket qua la int
//parse thi phai chuyen qua kieu so, neu nhap string thi bi loi
