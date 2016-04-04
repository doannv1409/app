package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

public class Baitap06 {

	public static void main(String[] args) {
		int dem = 0;
		String temp;
		System.out.println("Nhập vào số");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextLine();
		int Value = Integer.parseInt(temp);
		System.out.println("Nhap 0 so chan 1 so le");
		sc = new Scanner(System.in);
		int c=sc.nextInt();
		switch (c) {
		case 0:
			for (int i = 0; i < Value; i++) {
				if (i % 2 == 0) {
					dem++;
				}
			}
			System.out.println("Số số chắn là "+dem);
			break;
		case 1:
			for (int i = 0; i < Value; i++)
				if (i % 2 != 0)
					dem++;
			System.out.println("Số số lẻ là "+dem);
			break;

		default:
			System.out.println("Nhập sai số chẵn lẻ rồi");
			break;
		}
		
	}

}
