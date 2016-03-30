package vn.edu.imic.TungLam;

import java.util.Scanner;

public class JavaForBase01 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); //Khởi tạo scanner
		Scanner str=new Scanner(System.in);
	 //khai báo biến
		int RollNo, Age;
		double Mark;
		String FullName , Email;
		
		//Nhập dữ liệu
		System.out.print("+ RollNo : ");
		RollNo=sc.nextInt();
		System.out.print("+ FullName : ");
		FullName=str.nextLine();
		System.out.print("+ Age : ");
		Age=sc.nextInt();
		System.out.print("+ Email : ");
		Email=str.nextLine();
		System.out.print("+ Mark : ");
		Mark=sc.nextDouble();
		
		
		
		//In dữ liệu ra ngoài màn hình
		System.out.println("--> RollNo: "+RollNo);
		System.out.println("--> FullName: "+FullName);
		System.out.println("--> Age: "+Age);
		System.out.println("--> Email: "+Email);
		System.out.println("--> Mark: "+Mark);
	}
}
