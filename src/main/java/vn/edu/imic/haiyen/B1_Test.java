package vn.edu.imic.haiyen;

import java.util.Scanner;

public class B1_Test {
	public static void main(String[] args) {

		System.out.println("Chon : 1.De in ra Toyota_iQ1, 2.De in ra Toyota_iQ2");
		Scanner scan = new Scanner(System.in);
		int loai = scan.nextInt();

		switch (loai) {

		case (1):
			B1_ToyotaiQ1 iq1 = new B1_ToyotaiQ1("15 inch", "Cam Bien Anh Sang", "Den Suong Mu", "Cam bien",
					"1lit/3 chiec", "3,6lit/100km", "99gam/100km", "dieu hoa nhiet do", "dieu khien", "Co lo suoi");
			iq1.amThanh6Loa = "Am Thanh 6 Loa";
			iq1.inThongSo();
			break;

		case (2):
			B1_ToyotaiQ2 iq2 = new B1_ToyotaiQ2("15 inch", "Cam Bien Anh Sang", "Den Suong Mu", "Cam bien",
					"1lit/3 chiec", "3,6lit/100km", "99gam/100km", "dieu hoa nhiet do", "dieu khien", "Co lo suoi");
			iq2.chiaKhoa = "Chia Khoa Thong Minh";
			iq2.inThongSo();
			break;
		}
		scan.close();

	}
}
