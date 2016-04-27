package vn.edu.imic.vumanh;

import java.util.Scanner;

public class TestToyotaIQ {
	public static void main(String[] args) {
		ToyotaQI1 t1=new ToyotaQI1("", "", "");
		ToyotaQI2 t2=new ToyotaQI2("Gương điều khiển có lò sưởi","am thanh 6 loa","he thong chia khoa thong minh");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chon loai xe can xem: 1. ToyotaQ1 - 2. ToyotaQ2");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(t1);
			break;
		case 2:
			System.out.println(t2);
			break;
		default:
			System.out.println("Loai xe khong ton tai");
			break;
		}
		
		scanner.close();
	}
}
	