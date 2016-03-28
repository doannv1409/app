package vn.edu.imic.quangminh;

public class Lecture1 {
	
	public static void main(String[] args) {
		//Print say hello
		System.out.println("Say Hello.");
		
		//Khai bao bien kieu
		int a, d;
		a = d = 1;
		float b = 12.4f;
		double c = 12.5;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		float sum = a + b;
		System.out.println("a + b = " + sum);
		
		/*
		 * ++, --: 
		 * a++ : dung gia tri cua a de tinh toan, 
		 * 		 sau do moi tang gia tri cua a len 1
		 * ++a: tang gia tri a len 1 truoc, sau do 
		 * 		 moi thuc hien phep toan
		 */
		
		if(a++ == 2) {
			System.out.println("a==2: true " + a);
		} else {
			System.out.println("a==2: false " + a);
		}
		
		if(++d == 2) {
			System.out.println("d==2: true " + d);
		} else {
			System.out.println("d==2: false " + d);
		}
	}
}
