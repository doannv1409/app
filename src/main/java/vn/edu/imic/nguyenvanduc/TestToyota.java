package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

public class TestToyota {

	public static void main(String[] args) {
		ToyotaiQ1 iQ1 = new ToyotaiQ1("15inch", "cảm biến ánh sáng", "nước cảm biến", "1lit/3 chiếc", "3,6lit/100km",
				"99g/km", "nhiệt độ", "điện và có sưởi", "sương mù", "6 loa");
		ToyotaiQ2 iQ2 = new ToyotaiQ2("15inch", "cảm biến ánh sáng", "nước cảm biến", "1lit/3 chiếc", "3,6lit/100km",
				"99g/km", "nhiệt độ", "điện và có sưởi", "sương mù", "chìa khóa thông mình");
		System.out.println("0 - Toyota iQ1 1 - Toyota iQ2");
		Scanner sc = new Scanner(System.in);
		int loai = sc.nextInt();

		switch (loai) {
		case 0:
			iQ1.print();
			
			break;
		case 1:
			iQ2.print();
			break;

		default:
			System.out.println("Nhập sai rồi mời nhập lại");
			break;
		}
sc.close();
	}
}
