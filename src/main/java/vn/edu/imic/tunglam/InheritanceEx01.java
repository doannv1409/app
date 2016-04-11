package vn.edu.imic.tunglam;

import java.util.Scanner;

public class InheritanceEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon dong xe");
		System.out.print(0 + ". ToyotaiQ01");
		System.out.println("    "+ 1 + ". ToyotaiQ02");
		int so = sc.nextInt();
		
		if (so == 0) {
			ToyotaiQ01();
			
		}
		if (so == 1) {
			ToyotaiQ02();
		}
		sc.close();
	}

	private static void ToyotaiQ02() {
		// TODO Auto-generated method stub
		
	}

	private static void ToyotaiQ01() {
		// TODO Auto-generated method stub
		
	}
}
