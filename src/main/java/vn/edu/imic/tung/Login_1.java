package vn.edu.imic.tung;

import java.util.Scanner;

public class Login_1 {
	
	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		
		System.out.println("Nhap thong tin dang nhap");
		System.out.println("Ten truy cap:");
		String username = kb.nextLine();
		System.out.println("Mat khau: ");
		String password = kb.nextLine();
		if (username.isEmpty()) {
			System.out.println("Ban chua nhap ten ");
		}
		if (password.isEmpty()) {
			System.out.println("Ban chua nhap mat khau");
		} 
		if (username == "hoangtung" && password == "imic.edu.vn") {
			System.out.println("Ban da dang nhap thanh cong");
		} else {
			System.out.println("Dang nhap khong thanh cong. Kiem tra lai thong tin");
}
	}
}
