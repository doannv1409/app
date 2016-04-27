package vn.edu.imic.tunglam;

import java.util.Scanner;


public class InheritanceEx01 {
	public static void main(String[] args) {
		System.out.println("Chon : 1.Toyota_iQ1, 2.Toyota_iQ2");
		Scanner sc = new Scanner(System.in);
		int xe = sc.nextInt();
		
		switch(xe)	{
		
		case(1) :
		Toyota_iQ1 iq1 = new Toyota_iQ1(" 15 inch ", " Cam Bien Anh Sang "," Den Suong Mu ", " Cam bien ", " 1lit/3 chiec ", " 3,6lit/100km ", " 99gam/100km ", " dieu hoa nhiet do ", " dieu khien ", " co lo suoi ");
		iq1.amThanh6Loa = "Am Thanh 6 Loa";
		iq1.inThongSo();
		break;
		
		case(2):
		Toyota_iQ2 iq2 = new Toyota_iQ2(" 15 inch ", " Cam Bien Anh Sang "," Den Suong Mu ", " Cam bien ", " 1lit/3 chiec ", " 3,6lit/100km ", " 99gam/100km ", " dieu hoa nhiet do ", " dieu khien ", " co lo suoi ");
		iq2.chiaKhoa = "Chia Khoa Thong Minh";
		iq2.inThongSo();
		break;
		}
	sc.close();	
		
	}
}
