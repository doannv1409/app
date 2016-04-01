package vn.edu.imic.tung;

import java.util.Scanner;

public class EX_1 {
	public static void main ( String[] args)
	{
		System.out.println("nhap mot thang bat ki:");
		Scanner keyboard =new Scanner(System.in);			
		int M = keyboard.nextInt();
		System.out.println("nhap mot nam bat ki:");
		Scanner keyboard1 =new Scanner(System.in);
		int Y = keyboard1.nextInt();
		switch(M){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("co 31 ngay");
			break;
		case 4:
		case 6: 
		case 9:
		case 11:
			System.out.println("co 30 ngay");
			break;
		
		case 2:
			if (Y%4==0&&Y%100!=0||Y%400==0 )
			{
				System.out.println(" co 29 ngay");
			}
			else
			{
				System.out.println("co 28 ngay");
			}
		
			break;
		default: System.out.println("nhap lai");
		System.exit(0);
		}
		
	}

}
