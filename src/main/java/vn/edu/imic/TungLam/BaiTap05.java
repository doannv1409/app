package vn.edu.imic.TungLam;

import java.util.Scanner;

public class BaiTap05 {
	public static void main(String[] args){
		//nhap vao man hinh 2 so thap phan a,b
		
	double a,b;	
		Scanner sc=new Scanner(System.in);
		System.out.println("+ Nhập a= ");
		a=sc.nextDouble();
		System.out.println("+ Nhập b= ");
		b=sc.nextDouble();
		
		//tính toán với a,b
		
	 float sum=(float) (a+b);
	 float hieu=(float) (a-b);
	 float tich=(float) (a*b);
	 float thuong=(float) (a/b);
	 
	 	System.out.println("+ Tổng bằng "+sum);
	 	System.out.println("+ Hiệu bằng "+hieu);
	 	System.out.println("+ Tích bằng "+tich);
	 	System.out.println("+ Thương bằng "+thuong);
	}
}
