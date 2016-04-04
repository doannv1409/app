package vn.edu.imic.quangminh;

import java.util.Scanner;

public class Lecture2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// if .... else
		if (2 > 1) {
			System.out.println("2 lon hon 1");
		}
		//Comment ...
		int a = 2;
		int b = 3;
		if (a >= b) {
			System.out.println("You are stupid");
		} else {
			System.out.println("You are intelligent");
		}

		String message = a >= b ? "you're stupid" : "you're intelligent";
		System.out.println(message);

		b = 1;
		if (a > b) {
			System.out.println("You are stupid");
		} else if (a == b) {
			System.out.println("say hello");
		} else {
			System.out.println("You are intelligent");
		}
		
		if(a > 1 && b > 0) {
			System.out.print("say hello");
			System.out.print(" Hong ");
		}
		// switch ... case ...
		/*
		 * Note: khi dieu kien a == 0 la dung se in ra "Zero"
		 * thuc thi tiep cac lenh trong case den khi nao gap
		 * lenh break thi stop
		 */
		a = 0;
		switch(a) {
		case 0:
			System.out.println("Zero");
		case 1: 
			System.out.println("One");
			break;
		default:
			System.out.println("Unknow number");
			break;
		}
		
		
		//while
		int count = 1;
		while(count <= 10) {
			System.out.println(count);
			count++;
		}
		
		int count2 = 1;
		while(true) {
			System.out.println(count2);	
			count2++;

			if(count2 > 10) {
				break;
			}
			
		}
		
		//do ... while
		int check = 1;
		do {
			System.out.println(check);
			check++;
		} while(check < 10);
		
		//for
		System.out.println("for: ");
		for(int c=1; c < 10; c++) {
			System.out.println(c);
		}
		
		//Loop vo han dung for
//		for(int i=0;;i++) {
//			System.out.println("vo han: " + i);
//		}
		
		System.out.println("in so le: ");
		for(int i = 0; i<10; i ++) {
			if(i%2 == 0){
				continue;
			}
			
			System.out.println(i);
		}
		
		for(int i=0, j=10; i<j; i+=2, j-=2) {
			System.out.println(String.format("i = %s, j = %s", i, j));
		}
		
		
		//Scanner 
		Scanner scanner1 = new Scanner(System.in);
		//Doc kieu so
		int number = scanner1.nextInt();
		System.out.println("number = " + number);
		
		//Doc kieu chuoi den khi gap dau cach
		Scanner scanner2 = new Scanner(System.in);
		String str = scanner2.next();
		System.out.println("str = " + str);
		
		//Doc 1 dong 
		Scanner scanner3 = new Scanner(System.in);
		String str2 = scanner3.nextLine();
		System.out.println("read line: str2 = " + str2);
		
		
	}
}
