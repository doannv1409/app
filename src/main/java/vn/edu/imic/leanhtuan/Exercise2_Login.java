package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise2_Login {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("UserName : ");
		String username = scan.nextLine();
		
		System.out.println("PassWord : ");
		String password = scan.nextLine();
		
		String string1 = "doannv";
		String string2 = "imic.edu.vn";
		
		if(username.isEmpty()){
			System.out.println("Bạn chưa nhập tên đăng nhập");
		}
		else if(password.isEmpty()){
			System.out.println("Bạn chưa nhập mật khẩu");
		}
		
		if(username.isEmpty() && password.isEmpty()){
			System.out.println("Bạn chưa nhập mật khẩu");
			
		}
		else if(username.equals(string1) && password.equals(string2)){
			System.out.println("Bạn Đã Đăng Nhập Thành Công!");
		} 
		else{
			System.out.println("Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin đăng nhập");
		}
	}
}
