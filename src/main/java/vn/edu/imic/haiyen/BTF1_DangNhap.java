package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTF1_DangNhap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = readInput(sc, "Nhap ten:");
		String password = readInput(sc, "Nhap mat khau: ");
		String old = readInput(sc, "Nhap tuoi: ");
		Integer oldInt = Integer.valueOf(old);
		if (checkLogin(username, password)) {
			System.out.println("Dang nhap thanh cong, tuoi: " + oldInt);
		} else {
			System.out.println("Dang nhap khong thanh cong, tuoi: " + oldInt);
		}
		sc.close();
	}

	public static String readInput(Scanner sc, String message) {
		System.out.println(message);
		String input = sc.nextLine();
		return input;
	}

	public static boolean checkLogin(String username, String password) {
		return username.equals("imic") && password.equals("123456");
	}
}
