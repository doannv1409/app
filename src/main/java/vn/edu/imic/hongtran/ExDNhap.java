package vn.edu.imic.hongtran;

import java.util.Scanner;

public class ExDNhap {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("+ Nhap User Name: ");
		String UName = scan.nextLine();
		if(UName.isEmpty()){
			System.out.println("+Ban chua nhap User Name:");
			return;
		}
		System.out.println("+Nhap Password :");
		String Pass= scan.nextLine();
		if(Pass.isEmpty()){
			System.out.println("+ Ban chua nhap Password:");
			return;
		}
		if(UName.equals("hongtran")&&Pass.equals("123")){
			System.out.println("+Chuc mung dang nhap thanh cong nhe");
			}
		else {
			System.out.println("+ Dang nhap khong thanh cong,kiem tra lai di");
		}
}
}
