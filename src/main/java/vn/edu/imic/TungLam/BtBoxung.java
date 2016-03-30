package vn.edu.imic.TungLam;

import java.util.Scanner;

public class BtBoxung {
	public static void main(String[] args){
		Scanner	so=new Scanner(System.in);
		int Nam, Thang;
		
		
		Thang=so.nextInt();
		Nam=so.nextInt();
		
		if ((Nam==0)||(Thang==0)){

			System.out.println(" Vui lòng nhập Tháng cần xem ");
		}  else {
			System.out.println("+ Năm "+ Nam);
			System.out.println("+ Tháng "+ Thang);
			if ((Thang==4)||(Thang==6)||(Thang==9)||(Thang==11)||Thang==2){
				if (Thang==2){
					if ((Nam%4)==0){
						System.out.println("Tháng "+Thang+" Năm "+Nam+ " có 29 ngày" );
					}else {
						System.out.println("Tháng "+Thang+" Năm "+Nam+ " có 28 ngày" );
					}
				}else{
				System.out.println("Tháng "+Thang+" Năm "+Nam+ " có 30 ngày" );	
			}
		} else {
			System.out.println("Tháng "+Thang+" Năm "+Nam+ " có 31 ngày" );
		}
	   }
	}
}
