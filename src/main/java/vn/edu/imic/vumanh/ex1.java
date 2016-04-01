package vn.edu.imic.vumanh;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("nhap thong tin nguoi dung");
				System.out.println("nhap Usename:");
				String Usename=sc.nextLine();
				System.out.println("nhap PassWord:");
				String PassWord=sc.nextLine();
				
				if(Usename.isEmpty()){
					System.out.println("Ban chua nhap ten truy cap");
				}
				if(PassWord.isEmpty()){
					System.out.println("Ban chua nhap mat khau");
				}
				if(Usename="doannv" && PassWord="imic.edu.vn"){
					System.out.println("Ban da dang nhap thanh cong");
				}
				else{
					System.out.println("dang nhap khong thanh cong vui long kiem tra lai de dang nhap");
				}
					
	}
}
