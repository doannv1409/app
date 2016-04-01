package vn.edu.imic.honghieu;

import java.util.Scanner;

public class baitap3 {
	public static void main(String[] args){
		float a,b;
		Scanner ret = new Scanner (System.in);
		System.out.println("So kilogam = ");
		a=ret.nextFloat();
		System.out.println("So Pounds = ");
		b=ret.nextFloat();
		float c=a*b*2.2f;
		System.out.println(+a+"kilogam"+"=" +c+"Pounds");
	}
}
