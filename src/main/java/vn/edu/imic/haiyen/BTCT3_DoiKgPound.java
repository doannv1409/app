package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTCT3_DoiKgPound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Kilogram:");
		int kg = sc.nextInt();
		System.out.println("Doi kg sang pounds: "+doi(kg));
		sc.close();
//		System.out.println("Converted  to pounds");
//		int pounds = (int) (kg * 2.2);
//		System.out.println("Results: " + kg + " kg = " + pounds + " pounds");
		
	}
	
	public static double doi(int kg){
		return kg*2.2;
	}
	
	

}
