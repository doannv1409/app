package vn.edu.imic.quocthinh;

import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		if (2>1){
			System.out.println("2>1");
		}
		int a=2;
		int b=3;
		String message = a >= b ? "you are stupid" : "you are intelligent";
		System.out.println(message);
	
		if (a>b){
			System.out.println("stupid");
		} else if (a==b) {
			System.out.println("hello");
		} else { System.out.println("intelligent");
		
	}
		//switch ... case...
		switch (a){
		case 0: System.out.println("0");
			break;
		case 1: System.out.println("1");
			break;
		default: System.out.println("unknow number"); 
			break;
		}
		
		// while
		int count=1;
		while(count<=10) {
			System.out.println(count);
			count++;
		}
	
		int count2=1;
		while(true){
			System.out.println(count2);
			if(count2<10){ 
				System.out.println(count2);
				count2++;
			} else { break; }
			}
			count2++;
			
		//do while
			int check =1;
			do {
				System.out.println(check);
				check++;
			} while (check<10);
			
		// for 
			for(int check1=1; check1 <10; check1++){
				System.out.println(check1);
			}
		//Scanner
			Scanner scanner = new Scanner(System.in);
		//DOc kieu so 
			int number = scanner.nextInt();
		//doc kieu chuoi den khi gap dau cach
			String str =  scanner.next();
		//doc 1 dong
			String str2 = scanner.nextLine();
		}
	}




