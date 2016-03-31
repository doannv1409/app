package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

public class Baitap02 {

	public static void main(String[] args) {
		double a,b;
		String strTemp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập a");
		strTemp=sc.nextLine();
		if(strTemp.isEmpty())
		{
			System.out.println("Bạn chưa nhập a");
			return;
		}
		a=Double.parseDouble(strTemp);
		System.out.println("Nhập b");
		strTemp=sc.nextLine();
		if(strTemp.isEmpty())
		{
			System.out.println("Bạn chưa nhập b");
			return;
		}
		b=Double.parseDouble(strTemp);
		double cong=a+b;
		System.out.println("Cong "+cong);
		double tru=a-b;
		System.out.println("Tru "+tru);
		double nhan=a*b;
		System.out.println("Nhan "+nhan);
	
		if(a!=0&&b==0)
		{
			System.out.println("Cannot divide by zero");
		}
		else if(a==0&&b==0)
		{
			System.out.println("Result of function is underfined");
		}
		else
	
		System.out.println("Chia "+(a/b));
	}

}
