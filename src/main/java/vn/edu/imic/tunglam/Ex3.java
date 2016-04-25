package vn.edu.imic.tunglam;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Kilogram:");
		int kg = sc.nextInt();
		System.out.println("Converted  to pounds");
		int pounds = (int) (kg * 2.2);
		System.out.println("Results: " + kg + " kg = " + pounds + " pounds");

		sc.close();
	}
}
