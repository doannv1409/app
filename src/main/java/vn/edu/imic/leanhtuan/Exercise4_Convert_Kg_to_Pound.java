package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise4_Convert_Kg_to_Pound {
	public static void main(String [] args){
		float kg = 0;
		
		
		System.out.println("Moi Nhap Vao So Kilagram : ");
		Scanner scan = new Scanner(System.in);
		kg = scan.nextFloat();
		
		float pound = (float) (kg * 2.2);
		
		System.out.println("Result : " + kg + "Kilogram = " + pound + "Pounds");
	}
}
