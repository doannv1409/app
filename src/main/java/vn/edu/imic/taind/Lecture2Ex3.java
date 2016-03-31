package vn.edu.imic.taind;

import java.util.Scanner;

public class Lecture2Ex3 {
	public static void main(String[] args){
		double a;
		System.out.println("Nhap so Kilogram:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		System.out.println("Result: " + a + " " + "Kilogram = " + a*2.2 + " Pounds");
	}
}
