package vn.edu.imic.quocthinh;

import java.util.Scanner;

public class baitap1 {
	public static void main(String[] agrs) {
		String user, password;
<<<<<<< Updated upstream
		int a,b;
		Scanner sc = new Scanner(System.in);//comment........
		
		
=======
		Scanner sc = new Scanner(System.in);
>>>>>>> Stashed changes
		System.out.println("Nhap username: ");
		user = sc.nextLine();

		if (user.length() == 0) {
			System.out.println("Chua nhap username ");
		} else if (user.intern() != "thinh") {
			System.out.println("sai username ");
		}

		System.out.println("Nhap password: ");
		password = sc.nextLine();
		if (password.length() == 0) {
			System.out.println("chua nhap password");
<<<<<<< Updated upstream
		} else if (password.intern() != "1111111") {
=======
		} else if (password.intern() != "1111") {
>>>>>>> Stashed changes
			System.out.println("sai password ");
			System.out.println("dang nhap that bai ");
		}

		else {
			System.out.println("dang nhap thanh cong");
		}

	}

}
