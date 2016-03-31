package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

public class Baitap03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so kilogram");
		int kg=sc.nextInt();
double pound =kg*2.2;
System.out.println("Result: "+kg+ " Kilogram = "+pound+" Pounds");
	}

}
