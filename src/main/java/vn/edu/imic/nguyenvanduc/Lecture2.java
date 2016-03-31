package vn.edu.imic.nguyenvanduc;

public class Lecture2 {

	public static void main(String[] args) {
		if (2 > 1) {
			System.out.println("2 lon hon 1");
		}
		int a;
		a=1;
		int b = 3;
		if (a >= b) {
			System.out.println("you are stupid");
		} else {
			System.out.println("you are intelligent");
		}

		switch (a) {
		case 0: 
		System.out.println("Zero");
			break;
		case 1: 
			System.out.println("One");
			break;
		case 2: 
			System.out.println("Two");
			break;
		case 3: 
			System.out.println("Three");
			break;

		default:
			System.out.println("No");
			break;
		}
}
}