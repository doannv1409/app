package vn.edu.imic.quocthinh;

import java.util.Scanner;

public class baitap3 {
	public static void main(String[] args) {
		System.out.println("CHuyen doi Kilogram ---> Pounds");
		float kg;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so kilograms: ");
		kg = sc.nextFloat();
		float p = kg * 2.2f;
		System.out.println("Result: " + kg + "kilograms= " + p + "pounds");
	}
}
