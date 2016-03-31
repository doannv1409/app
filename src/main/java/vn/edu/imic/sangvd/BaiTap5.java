package vn.edu.imic.sangvd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaiTap5 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("- Hay nhap vao so thu nhat : ");
		double a = sc.nextDouble();
		System.out.print("- Hay nhap vao so thu hai : ");
		double b = sc.nextDouble();
		System.out.println("- Hay nhap vao phep tinh : ");
		System.out.println(" + Chon : 1 - cong");
		System.out.println(" + Chon : 2 - tru");
		System.out.println(" + Chon : 3 - nhan");
		System.out.println(" + Chon : 4 - chia");	
		
		String p = null;
		int ch;
		do{
			ch = sc.nextInt();
			if(ch == 1)
				System.out.print("    Ket qua cua phep cong la : "+(a + b));
			else if(ch == 2)
				System.out.print("    Ket qua cua phep tru so thu nhat cho so thu hai la : "+(a - b));
			else if(ch == 3)
				System.out.print("    Ket qua cua phep nhan la : "+(a*b));
			else if(ch == 4){
				if(b != 0)
				System.out.print("    Ket qua phep chia so thu nhat cho so thu hai la : "+(a /b));
				else
					System.out.println("   ban khong duoc chia cho so 0 nha .....");
			}
			else{
				System.out.println("Nhap sai phep tinh ");
				System.out.println("Ban co muon thuc hien lai khong");
				System.out.println("Hay nhan phim 'k' hoac 'K' de ket thuc");
				System.out.println("Neu khong muon ket thuc hay nhan 1 trong cac phim 1 ,2 ,3 ,4 de xem ket qua nha");
				p =  sc.nextLine();
			}
		}while(p !=  "k" || p != "K");
	}
}
