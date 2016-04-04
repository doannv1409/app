package vn.edu.imic.taind;

import java.util.Scanner;

public class Lecture2Ex1 {
	public static void main(String[] args){		
		Scanner scanner = new Scanner(System.in);
		String strTenDangNhap;		
		String strMatKhau;
		do{	
			System.out.println("Ten dang nhap:");
			strTenDangNhap = scanner.nextLine();
			System.out.println("Mat Khau:");
			strMatKhau = scanner.nextLine();
			if (strTenDangNhap.equals("") || strMatKhau.equals("")){
				System.out.println("Ban chua nhap du thong tin dang nhap. Vui long kiem tra lai!");
				}
			else{
				if (strTenDangNhap.equals("taind") && strMatKhau.equals("1982376450")){
					System.out.println("Chuc mung ban da dang nhap thanh cong!");
					break;
				}
				else{
					System.out.println("Dang nhap khong thanh cong. Vui long kiem tra lai thong tin dang nhap!");
				}
			}

			strTenDangNhap="";
			strMatKhau="";
		}while(!strTenDangNhap.equals("taind")&& !strMatKhau.equals("1982376450"));
		scanner.close();
	}
}
