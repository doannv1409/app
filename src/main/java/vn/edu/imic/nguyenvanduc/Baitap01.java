package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

public class Baitap01 {

	public static void main(String[] args) {
		String username="";
		String password="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Tên truy cập: ");
		username=sc.nextLine();
		if(username.isEmpty())
		{
			System.out.println("Bạn chưa nhập tên truy cập");
			return;
		}
		System.out.println("Mật khẩu: ");
		password=sc.nextLine();
		if(password.isEmpty())
		{
			System.out.println("Bạn chưa nhập mật khẩu");
			return;
		}
	
	if(username.equals("doannv") && password.equals("imic.edu.vn"))
		{
			System.out.println("Bạn đã đăng nhập thành công");
		}
		else
		{
			System.out.println("Đăng nhập không thành công. Vui lòng kiểm tra thông tin đăng nhập");
		}
	}

}
