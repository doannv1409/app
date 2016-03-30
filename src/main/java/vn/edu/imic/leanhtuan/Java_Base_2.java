package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Java_Base_2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Slide 1 :");
		double Slide1 = scan.nextDouble();
		
		System.out.println("Please Enter Slide 2 :");
		double Slide2 =scan.nextDouble();
		
		System.out.println("Please Enter Slide 3 :");
		double Slide3 = scan.nextDouble();
		
		double p = (Slide1+Slide2+Slide3)/2;
		double area = Math.sqrt(p*(p-Slide1)*(p-Slide2)*(p-Slide3));
		
		double peri = Slide1+Slide2+Slide3;
		
		System.out.println("Area of this triangle is :" + area);
		System.out.println("Perimeter of this triangle is :" + peri);
	}
}
