package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTCT1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin dang nhap");
		System.out.println("Ten truy cap:");
		String username = sc.nextLine();
		System.out.println("Mat khau: ");
		String password = sc.nextLine();
		
		if (username.isEmpty()) {
			System.out.println("Ban chua nhap ten truy cap");
		}
		if (password.isEmpty()) {
			System.out.println("Ban chua nhap mat khau");
		} 
		
		if (username.equals("doannv") && password.equals("imic.edu.vn")) {
			System.out.println("Ban da dang nhap thanh cong");
		} else {
			System.out.println("Dang nhap khong thanh cong. Vui long kiem tra thong tin dang nhap");
		}
		
		sc.close();
	}

}
