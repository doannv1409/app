package vn.edu.imic.linh;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so kg:");
		double weight = 0;
		boolean flag = false;
		
		do{
			try{
				flag = true;
				weight = scanner.nextDouble();
				System.out.println("Result: "+weight+ " Kg = " + (weight*2.2) + " Pound" );
				
			}
			catch(InputMismatchException e){
				System.out.println("Ban can nhap vao mot so thuc");
			}
		}while(flag==false);
		
		
		
			
		
	}
}
