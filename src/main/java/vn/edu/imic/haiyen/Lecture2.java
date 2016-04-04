package vn.edu.imic.haiyen;

import java.util.Scanner;

public class Lecture2 {
	public static void main(String[] args) {
		if (2 > 1) {
			System.out.println("2>1");

			int a = 2;
			int b = 3;
			if (a >= b) {
				System.out.println("stupid");
			} else {
				System.out.println("intelligent");
			}

			String message = a >= b ? "stupid" : "intelligent";
			System.out.println(message);

			if (a > b) {
				System.out.println("stupid");
			} else if (a == b) {
				System.out.println("say hello");
			} else {
				System.out.println("intelligent");
			}
			// cau dieu kien long nhau chu y mien thoa man
			// neu true thi ko check nua //b=1 chi in stupid
			// neu chua true thi moi check cai sau nua

			a = 0;
			switch (a) {
			case 0:
				System.out.println("zero");
				// break;
			case 1:
				System.out.println("one");

			default:
				System.out.println("unknow");
				break;
			}
			/*
			 * a= 0: ket qua: zero, one, unknow number khi ket qua da so sanh
			 * true, khong so sanh case nua, thuc thi tat ca cac lenh trong case
			 * cho den khi gap break nen co default de xu li ngoai le moi case
			 * nen co 1 break neu gom thi nen dung if..else
			 */
		}

		// int a = 5, b = 3;
		// if (a > 2 && b > 0) {
		// System.out.println("hello");
		// }
		// }
		int count = 1;
		while (count < 10) {
			System.out.println(count);
			// count++; neu bo count ++ => in 1,1, ...
		}
		// true chek dieu kien, lap lap cho den false

		int count2 = 1;
		/*
		 * while (true) { System.out.println(count2); if (count2 < 10) {
		 * break;// thoat vong lap } else { System.out.println(count2);
		 * count2++; } }
		 */
		// in tu 1->9
		while (true) {
			System.out.println(count2);
			count2++;

			if (count2 >= 10) {
				break;// thoat vong lap
			}
		}

		// thuc hien truoc kiem tra dk sau
		int check = 1;
		do {
			System.out.println(check);
			check++;
		} while (check < 10);

		for (int c = 1; c < 10; c++) {
			System.out.println(c);
		}
		// lop vo han dung for
		for (int i = 0;; i++) {
			System.out.println("vo han" + i);
			if (i > 100)
				break;
		}
		System.out.println("in so le");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;// bo cau lenh dang sau continue de chay tiep vong lap
							// tiep theo
			}
			System.out.println(i);
		}
		// => in ra so le

		for (int i = 0, j = 10; i < j; i += 2, j -= 2) {
			System.out.println(String.format("i=%s, j=%s", i, j));
		} // tim duong cheo ma tran

		// doc tu ban phim
		Scanner sc = new Scanner(System.in);

		// doc kieu so
		int number = sc.nextInt();
		System.out.println("number=" + number);
		// doc kieu chuoi
		String str = sc.nextLine();// next: chi doc den dau cach
		// nextLine: doc mot dong
		double db = sc.nextDouble();

	}
	// continue: bo vong lap hien tai, chay vong lap tiep theo
	// break: dung vong lap
}
//chon phep toan: 0 : cong, 1: tru