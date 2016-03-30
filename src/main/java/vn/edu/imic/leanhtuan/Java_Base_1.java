package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Java_Base_1 {
//	public static void main(String[] args) {
//		
//		// TODO Auto-generated method stub
//
//	Scanner sc = new Scanner(System.in);
//
//	System.out.println("Please Enter Your ID : ");
//	int RollNo =sc.nextInt();
//
//	System.out.println("Please Enter Your Full Name :");
//	sc=new Scanner(System.in);
//	String Fullname =sc.nextLine();
//
//	System.out.println("Please Enter Your Age :");
//	sc=new Scanner(System.in);
//	int Age =sc.nextInt();
//
//	System.out.println("Please Enter Your Email :");
//	sc=new Scanner(System.in);
//	String Email =sc.next();
//
//	System.out.println("Please Enter Your Mark :");
//	sc=new Scanner(System.in);
//	double Mark =sc.nextDouble();
//
//
//			System.out.println("--> RollNo1: " + RollNo);
//			System.out.println("--> Fullname: " + Fullname);
//			System.out.println("--> Age: " + Age);
//			System.out.println("--> Email: " + Email);
//			System.out.println("--> Mark: " + Mark);
//		}	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter Your Roll ID Number :");
		int RollNo = scanner.nextInt();
		
		System.out.println("Please Enter Your Full Name :");
		scanner = new Scanner(System.in);
		String FullName = scanner.nextLine();
		
		System.out.println("Please Enter Your Age :");
		scanner = new Scanner(System.in);
		int Age = scanner.nextInt();
		
		System.out.println("Please Enter Your Email :");
		scanner = new Scanner(System.in);
		String Email = scanner.nextLine();
		
		System.out.println("Please Enter Your Mark :");
		scanner = new Scanner(System.in);
		double Mark = scanner.nextDouble();
		
		System.out.println("-->RollNo :" + RollNo);

		System.out.println("-->FullName :" + FullName);

		System.out.println("-->Age :" + Age);

		System.out.println("-->Email :" + Email);

		System.out.println("-->Mark :" + Mark);
		
	}
}
