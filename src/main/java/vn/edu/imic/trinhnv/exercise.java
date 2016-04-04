package vn.edu.imic.trinhnv;

import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		System.out.println("Vui long nhap thong tin dang nhap");
		Scanner sc =  new Scanner(System.in);
		System.out.print("Ten dang nhap : ");
		String username = sc.nextLine();
		System.out.print("Mat khau : ");
		String password = sc.nextLine();
		if (username ==" " || username.isEmpty()) {
			System.out.println("Ban chua nhap ten truy nhap !");
		}
		if (password ==" " || password.isEmpty()) {
			System.out.println("Ban chua nhap mat khau ! ");
		}
		if (username.equals("doannv") && password.equals("123")) {
			System.out.println("Ban da dang nhap thanh cong !");
		}else {
			System.out.println("Ban dang nhap khong thanh cong ! "
					+ "vui long xem lai thong tin");
		}
		sc.close();
	}
}
