package vn.edu.imic.haiyen;

public class Lecture1 {
	public static void main(String[] args) {
		System.out.println("Say Hello.");

		int a = 1;
		int d = 1;
		float b = 12.4f;
		double c = 12.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		float sum = a + b;
		System.out.println("a+b = " + sum);

		if (++d == 2) {
			System.out.println("d==2: true" + d);
		} else {
			System.out.println("d==2: false" + d);
		}
	}
}