package vn.edu.imic.trinhnv;

import java.util.Scanner;


public class exercise2 {
    public static void main(String[] args) {
    	System.out.println("Convet kilogram to pound");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Input a Kilogram: ");
    	String a =  sc.nextLine();
      	double kg = 0 ;
    	if (a == "" || a.isEmpty()) {
			System.out.println("Please input a number !");
		}else {
			kg = Double.parseDouble(a);		
		}
    	double pound =(double)(kg * 2.2);
    		System.out.println("Result :" + kg + " kilogram = " + pound + " pound");
    	sc.close();
    }
}
