package vn.edu.imic.tunglam;

import java.util.Scanner;

public class InheritanceEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon dong xe");
		System.out.print(0 + ". ToyotaiQ01");
		System.out.println("    "+ 1 + ". ToyotaiQ02");
		int so = sc.nextInt();
		Toyota_iQ toyota1 = new Toyota_iQ();
		Toyota_iQ toyota2 = new Toyota_iQ();
		if (so == 0) {
			toyota1.ToyotaiQ01();
			
		}
		if (so == 1) {
			toyota2.ToyotaiQ02();
		}
		sc.close();
	}
}
