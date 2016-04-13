package vn.edu.imic.quangminh.oop.inheritance;

import java.util.Scanner;

public class TestToyotaQ {
	public static void main(String[] args) {
		ToyotaQ1 q1 = new ToyotaQ1("Gương dieu khiển điện và có sưởi", 
				"Âm thanh 6 loa", "Den sương mù", "Vanh duc 20inch");
		ToyotaQ2 q2 = new ToyotaQ2("Gương đieu khiển điện và có sưởi", 
				"Dèn sương mù", "Hệ thống chìa khóa thông minh");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chon loai xe can xem: 1. ToyotaQ1 - 2. ToyotaQ2");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(q1);
			break;
		case 2:
			System.out.println(q2);
			break;
		default:
			System.out.println("Loai xe khong ton tai");
			break;
		}
		
		scanner.close();
	}
}
