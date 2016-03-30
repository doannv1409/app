package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

import com.sun.xml.internal.ws.message.saaj.SAAJHeader;

public class tamgiac {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Mời nhập vào cạnh thứ nhất");
	int side01 =sc.nextInt();
	System.out.println("Mời nhập vào cạnh thứ hai");
	int side02 =sc.nextInt();
	System.out.println("Mời nhập vào cạnh thứ ba");
	int side03 =sc.nextInt();
	float p,Peri,Area ;
	p=(side01+side02+side03)/2;
	Area = (float) Math.sqrt(p*(p-side01)* (p-side02)*(p-side03));
	Peri = side01+ side02+side03;
	System.out.println("Chu vi của tam giác là:"+Peri);
	System.out.println("Diện tích của tam giác là:"+Area);

	}

}
