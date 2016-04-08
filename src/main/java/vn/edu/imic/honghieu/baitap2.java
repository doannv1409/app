package vn.edu.imic.honghieu;

import java.util.Scanner;

public class baitap2 {
	public static void main (String[] agrs)
	{
		float a,b;
		int c;
		Scanner rel = new Scanner (System.in);
		System.out.println("Nhap a = " );
		a = rel.nextFloat();
		System.out.println("nhap b = ");
		b = rel.nextFloat();
		System.out.println("chon phep tinh: 1.+,2.-,3.*,4./");
		c=rel.nextInt();
		float cong=a+b,tru=a-b,nhan=a*b;
		if(c==1){System.out.println("a+b= " +cong);}
		if(c==2){System.out.println("a-b= " +tru);}
		if(c==3){System.out.println("a*b= " +nhan);}
		if(c==4){
			System.out.println( "a/b= "+(a/b));
			
		}
	}
}
