package vn.edu.imic.tung;

import java.util.Scanner;

public class EX2 {
	public static void main( String[] args)
	{
		System.out.println("nhap canh thu 1:");
		Scanner keyboard =new Scanner(System.in);
		double a = keyboard.nextInt();
		System.out.println("nhap canh thu 2:");
		double b = keyboard.nextInt();
		System.out.println("nhap canh thu 3:");
		double c = keyboard.nextInt();
		if ((a+b)<c||(a+c)<b||(b+c)<a)
		{ System.out.println("tam giac khong hop le");}
		else
		{
			double chuvi = a+b+c;
			double dientich = Math.sqrt(chuvi * (chuvi - a) * (chuvi - b) * (chuvi - c));
			System.out.println("dien tich  %f   chu vi  %f "+dientich+chuvi);
		}
		System.exit(0);
	}

}
