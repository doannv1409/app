package vn.edu.imic.sangvd;

import java.util.Scanner;

public class BaiTap3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("người dùng nhập vào giá trị kiểu số nguyên cho các biến có tên: a,b,c,d,e,f,g,h,I lần lượt với các giá trị 100,200,300,400,500,600,700,800,900");
	
		System.out.print("Gia tri cua a = ");
		int a = sc.nextInt();
		
		System.out.print("Gia tri cua b = ");
		int  b =sc.nextInt();
		
		System.out.print("Gia tri cua c = ");
		int c = sc.nextInt();
		
		System.out.print("Gia tri cua d = ");
		int d = sc.nextInt();
		
		System.out.print("Gia tri cua e = ");
		int e = sc.nextInt();
		
		System.out.print("Gia tri cua f = ");
		int f = sc.nextInt();
		
		System.out.print("Gia tri cua g = ");
		int g = sc.nextInt();
		
		System.out.print("Gia tri cua h = ");
		int h = sc.nextInt();
		
		System.out.print("Gia tri cua l = ");
		int l = sc.nextInt();
		
		System.out.println(" người dùng nhập vào giá trị kiểu số thập phân cho các biến có tên: numA, numB, numC, numD, numE, numF, numG, numH, numI lần lượt với các giá trị 100.5, 200.5, 300, 400.5, 500.6, 600.7, 700.8, 800.9, 900");

		System.out.print("Gia tri cua numA = ");
		double numA =sc.nextDouble();
		
		System.out.print("Gia tri cua numB = ");
		double numB =sc.nextDouble();
		
		System.out.print("Gia tri cua numC = ");
		double numC =sc.nextDouble();
		
		System.out.print("Gia tri cua numD = ");
		double numD =sc.nextDouble();
		
		System.out.print("Gia tri cua numE = ");
		double numE =sc.nextDouble();
		
		System.out.print("Gia tri cua numF = ");
		double numF =sc.nextDouble();
		
		System.out.print("Gia tri cua numG = ");
		double numG =sc.nextDouble();
		
		System.out.print("Gia tri cua numH = ");
		double numH =sc.nextDouble();
		
		System.out.print("Gia tri cua numL = ");
		double numL =sc.nextDouble(); 
	
		System.out.println("người dùng nhập vào giá trị kiểu chuỗi cho các biến có tên: strA, strB, strC, strD, strE, strF, strG, strH, strI lần lượt với các giá trị “Xin”, “chào”, “các”, “bạn”, “đến”, “với”, “khóa”, “học”, “Java for base”");
		
		System.out.print("Nhap vao chuoi srtA : ");
		String strA = sc.nextLine();
		
		System.out.print("Nhap vao chuoi strB : ");
		String strB = sc.nextLine();
		
		System.out.print("Nhap vao chuoi strC : ");
		String strC = sc.nextLine();
		
		System.out.print("Nhap vao chuoi strD : ");
		String strD = sc.nextLine();
		
		System.out.print("Nhap vao chuoi strE : ");
		String strE = sc.nextLine();

		System.out.print("Nhap vao chuoi strF : ");
		String strF = sc.nextLine();
		
		System.out.print("Nhap vao chuoi strG : ");
		String strG = sc.nextLine();
		
		System.out.print("Nhap vao chuoi strH : ");
		String strH = sc.nextLine();
		
		System.out.print("Nhap vao chuoi strL : ");
		String strL = sc.nextLine();
		
		String str = strA +" " + strB + " " + strC + " " + strD + " " + strE + " " + strF +" " +  strG + " "+  strH +" "+ strL;
		System.out.println(str.toString());
		
	}

}
