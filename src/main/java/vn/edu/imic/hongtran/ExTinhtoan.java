package vn.edu.imic.hongtran;

import java.util.Scanner;

public class ExTinhtoan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a,b;
		System.out.print("+ a = ");
        String box = scan.nextLine();        
        if(box.isEmpty()){
            System.out.println("Ban chua nhap vao gia tri cua a");
            return;
        }
       
            a = Double.parseDouble(box);
     
            
        System.out.print("+ b = ");
        box = scan.nextLine();
        if(box.isEmpty()){
            System.out.println("Ban chua nhap vao gia tri cua b");
            return;
        }
       
            b = Double.parseDouble(box);
                     
        
        System.out.print("+ Chọn phép toán: +, - , *, /? ");
        scan = new Scanner(System.in);
        String opt = scan.nextLine();
        
        
        if(opt.isEmpty()){
            System.out.println("+ Bạn chưa chọn phép toán!");
            return;
        }
        if(opt.equals("+")){
            System.out.println("a + b = "+ (a+b));
        }
        else if(opt.equals("-")){
            System.out.println("a - b = "+ (a-b));
        }
        else if(opt.equals("*")){
            System.out.println("a * b = "+ (a*b));
        }
        else if(opt.equals("/")){
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

