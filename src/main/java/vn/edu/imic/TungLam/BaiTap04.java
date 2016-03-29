package vn.edu.imic.TungLam;

import java.util.Scanner;

public class BaiTap04 {
	public static void main(String[] args){
		
		int a;
		System.out.println("+ Nhập ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	/*	// câu lệnh if else
		if(a>0){
			System.out.print(" Giá trị của a>0");
		} else {
			System.out.print(" Giá trị của a<0");
		}
		
		
		if(a>1){
			System.out.print(" Giá trị của a>1");
		} else {
			System.out.print("Giá trị của a<1");
		}
		*/
	
	/*  //câu lệnh while  
	  int i=0;
	  while (i<a){
		  System.out.println("+ Giá trị của i = " + i);
		  i++;
	  }
	

		int j=0;
		while (j<a){
			System.out.println("+ Giá trị của j = " + j);
			j++;
		}*/
		
		
	/*   //câu lệnh do while
		int i=0;
		do{
			System.out.println("+ Giá trị của i = "+ i);
			i++;
		}while (i<a);
		*/
		
		//câu lệnh for
		for(int i=0;i<a;i++){
			System.out.println("+ Giá trị của i = "+ i);
		}
}
}	
