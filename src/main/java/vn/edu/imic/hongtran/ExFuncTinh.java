package vn.edu.imic.hongtran;

import java.util.Scanner;


public class ExFuncTinh {

	public static void main(String[] args) {
		double a = 0,b = 0;
		
		Scanner scan = new Scanner(System.in);
		String choose= scan.nextLine();
		String temp = scan.nextLine();
		
		
		if(Input(temp)&& Choose(choose)){
			if(choose.equals("+")){
				System.out.println("a + b = "+ (a+b));
			}
			else if(choose.equals("-")){
				System.out.println("a - b = "+ (a-b));
			}
			else if(choose.equals("*")){
				System.out.println("a * b = "+ (a*b));
			}
			else if(choose.equals("/")){
	            if(a!=0 && b==0){
	                System.out.println("Cannot divide by zero");
	            }
	            else if(a==0 && b==0){
	                System.out.println("Result of function is underfined");
	            }
	            else{
	                System.out.println("a / b = "+ (a/b));
	            }
	        }		
		}
	}

	private static boolean Choose(String choose) {
		if(choose.isEmpty()){
			System.out.println("+ Bạn chưa chọn phép toán!");
		}
		return "choose".equals("+, - , *, /");
	}

	private static boolean Input(String temp) {
		System.out.println("Hay nhap vao a,b");
		if(temp.isEmpty()){
			System.out.println("Ban chua nhap vao gia tri cua a");
		}
		double a = Double.parseDouble(temp);
		if(temp.isEmpty()){
			System.out.println("Ban chua nhap vao gia tri cua b");
		}
		return "temp".equals("a,b");
	}

}
