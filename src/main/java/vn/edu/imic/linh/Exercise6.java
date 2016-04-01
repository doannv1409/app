package vn.edu.imic.linh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args){
		int a =0;
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		do{
			try{
				System.out.println("Nhap vao so a: ");
				a = scanner.nextInt();
				flag= true;
			}
			catch(InputMismatchException e){
				System.out.println("a phai la mot so");
				scanner.next();
			}
		}while(flag==false);
		
		int countEven = 0;
		int countOdd = 0;
		int i = 0;
		int sumEven = 0;
		int sumOdd=0;
		while(i<a){
			if(i%2==0){
				sumEven +=i;
				countEven++;
			}
			else{
				sumOdd += i;
				countOdd++;
			}
			i++;
		}
		
		System.out.println("Day so co "+countEven+" so chan. Tong day so chan la: "+sumEven);
		System.out.println("Day so co "+countOdd+" so le. Tong day so le la: "+sumOdd);

	}
}
