package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise6_Friend_Request {
	public static void main(String [] args){
		
		String hoten = "";
		int  tuoi = 0;
		int tthn = 0;
		String gt = "";
		String kq = "";
		String tthn1 = "";
		String tuoi1 = "";
		
		System.out.println("Nhap Ten Cua Ban : ");
		Scanner scan1 = new Scanner(System.in);
		hoten = scan1.nextLine();
		if(hoten.isEmpty()){
			System.out.println("Moi Ban Nhap Ho Ten!");
		}
		
		System.out.println("Tuoi Cua Ban : ");
		Scanner scan2 = new Scanner(System.in);
		tuoi1 = scan2.nextLine();
		if(tuoi1.isEmpty()){
			System.out.println("Moi Ban Nhap Tuoi!");
		}
		
		
		System.out.println("Tinh Trang Hon Nhan : ");
		Scanner scan3 = new Scanner(System.in);
		tthn1 = scan3.nextLine();
		tthn = Integer.parseInt(tthn1);
		if(tthn1.isEmpty()){
			System.out.println("Moi Chon Tinh Trang Hon Nhan!");
		}
		
		switch(tthn){
		case(0):
			System.out.println("Doc Than");
		break;
		
		case(1):
			System.out.println("Ly Hon");
		break;
		
		case(2):
			System.out.println("Da Ket Hon");
		break;
		default:
			System.out.println("Sai O Dau Do Roi!");
		
		}
		
		
		System.out.println("Gioi Tinh: ");
		Scanner scan4 = new Scanner(System.in);
		gt = scan4.nextLine();
		if(gt.isEmpty()){
			System.out.println("Moi Ban Nhap Gioi Tinh!");
		}
		
		tuoi = Integer.parseInt(tuoi1);
		System.out.println("Ket Qua Dang Ky La : ");	
		if(((tuoi >= 22) && ((gt.equals("Nam")) || gt.equals("nam")) 
				|| ((tuoi >= 19) && ((gt.equals("Nu")) 
						|| (gt.equals("nu"))))) && ((tthn == 0) 
								|| (tthn == 1))){
			System.out.println("Duoc Phep Tham Gia");
		}
		else 
		{
			System.out.println("Khong Duoc Phep Tham Gia");
		}
	}
}
