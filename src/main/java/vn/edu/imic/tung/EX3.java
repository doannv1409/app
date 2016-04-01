package vn.edu.imic.tung;

import java.util.Scanner;

public class EX3 {
	public static void main(String agrv[])
	{
		System.out.println("nhap mot so nguyen bat ki");
		Scanner keyboard =new Scanner(System.in);
		int n = keyboard.nextInt();
		int count=0;
		int i=0;
			while (i<=n)
			{
				if (i%2==0)
				count++;
			i++;
				
			}
		
		System.out.println("so chan trong day la "+count);
		System.exit(0);
	}
}
