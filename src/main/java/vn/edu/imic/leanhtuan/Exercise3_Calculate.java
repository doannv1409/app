package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Exercise3_Calculate {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float a = 0;
		float b = 0;

		// su dung function readInput;

		String strTemp1 = readInput(scan, "Moi Ban Nhap So a : ");
		String strTemp2 = readInput(scan, "Moi Ban Nhap So b : ");

		a = Float.parseFloat(strTemp1);
		b = Float.parseFloat(strTemp2);

		System.out.println("Moi Chon Loai Phep Tinh : 0.Cong, 1.Tru, 2.Nhan, 3.Chia");
		int loai = scan.nextInt();

		switch (loai) {

		// su dung cac function cong, tru, nhan, chia;

		case (0):
			float sum = cong_Sum(a, b);
			System.out.println("Ket qua la : " + sum);
			break;
		case (1):
			float subtraction = tru_Subtraction(a, b);
			System.out.println("Ket qua la :" + subtraction);
			break;
		case (2):
			float multiplication = nhan_Multiplication(a, b);
			System.out.println("Ket qua la : " + multiplication);
			break;
		case (3):

			float divison = chia_Division(a, b);
			System.out.println("Ket qua la : " + divison);
			break;
		default:
			System.out.println("Sai O Dau Do Roi");
		}

		scan.close();
	}

	public static String readInput(Scanner scan, String message) {
		System.out.println(message);
		String input = scan.nextLine();
		 if (input == null || input.length() == 0) {
		 System.out.println("Moi Ban Nhap Lai !");
		 }
//		do {
//			System.out.println("Moi Ban Nhap Lai !");
//			break;
//		} while (input == null || input.length() == 0);

		return input;

	}

	public static float cong_Sum(float a, float b) {
		float sum = a + b;
		return sum;
	}

	public static float tru_Subtraction(float a, float b) {
		float subtraction = a - b;
		return subtraction;
	}

	public static float nhan_Multiplication(float a, float b) {
		float multiplication = a * b;
		return multiplication;
	}

	public static float chia_Division(float a, float b) {
		float division = a / b;
		if (a != 0 && b == 0) {
			System.out.println("Cannot divide by zero");
		} else if (a == 0 && b == 0) {
			System.out.println("Result of function is underfined");
		}
		return division;
	}
}
