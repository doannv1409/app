package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

public class sample {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Mời nhập vào mã sinh viên");
		int RollNo1 = sc.nextInt();

		System.out.println("Mời nhập vào họ và tên");
		sc = new Scanner(System.in);
		String Fullname = sc.nextLine();

		System.out.println("Mời nhập vào tuổi");
		sc = new Scanner(System.in);
		int Tuoi = sc.nextInt();

		System.out.println("Mời nhập vào email");
		sc = new Scanner(System.in);
		String Email = sc.next();

		System.out.println("Mời nhập vào điểm");
		sc = new Scanner(System.in);
		double Diem = sc.nextDouble();

		System.out.println("--> RollNo1: " + RollNo1);
		System.out.println("--> Fullname: " + Fullname);
		System.out.println("--> Age: " + Tuoi);
		System.out.println("--> Email: " + Email);
		System.out.println("--> Mark: " + Diem);
	}

}
