package vn.edu.imic.haiyen;

import java.util.Scanner;

public class B1_Test {

	private static Scanner sc;

	public static void main(String[] args) {
		B1_ToyotaiQ1 toyota1 = new B1_ToyotaiQ1();
		B1_ToyotaiQ2 toyota2 = new B1_ToyotaiQ2();

		sc = new Scanner(System.in);
		System.out.println("- Chon xe Toyota iQ1 - so 1\n- Chon xe Toyota iQ2 - so 2");
		int so = sc.nextInt();
		if (so == 1) {
			toyota1.display();
		} else {
			toyota2.display();
		}

	}

}
