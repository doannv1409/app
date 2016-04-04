package vn.edu.imic.taind;

import java.util.Scanner;

public class Lecture2Ex2 {
	public static void main(String[] args){
		System.out.println("Nhap so a:");
		Scanner scanner = new Scanner(System.in);
		double a  = scanner.nextDouble();
		System.out.println("Nhap so b:");
		double b  = scanner.nextDouble();
		System.out.println("Chon phep tinh: 0 - Phep cong, 1 - Phep tru, 2 - Phep nhan, 3 - Phep chia");
		int pheptinh = scanner.nextInt();
		double ketqua;
		switch (pheptinh) {
		case 0:
			ketqua = a+b;
			System.out.println("Tong a + b = " + ketqua);
			break;
		case 1:
			ketqua = a-b;
			System.out.println("Hieu a - b = " + ketqua);
			break;
		case 2:
			ketqua = a*b;
			System.out.println("Tich a*b = " + ketqua);
			break;
		case 3:
			if(b==0){
				if(a==0){
					System.out.println("Result of function is underfinded");
				}
				else{
					System.out.println("Cannot divide by zero");
				}
			}
			else
			{
				ketqua = a/b;
				System.out.println("Thuong a/b = " + ketqua);
			}			
			break;
		default: System.out.println("Chon sai phep tinh roi, chay lai di");
			break;
		}
		scanner.close();
	}
}
