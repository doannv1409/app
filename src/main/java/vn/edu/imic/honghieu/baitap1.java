package vn.edu.imic.honghieu;

import java.util.Scanner;

public class baitap1 {
	public static void main (String[] args)
	{
		String user;
		String pass;
		Scanner re = new Scanner (System.in);
		System.out.println("Username: " );
		user = re.nextLine();
		if(user.length()==0){
			System.out.println("Ban can nhap ten truy cap");
		}else if(user.intern() !="hieukhi"){
			System.out.println("Sai id");
		}
		System.out.println("Password: " );
		pass = re.nextLine();
		if(pass.length()==0){
			System.out.println("Ban can nhap mat khau");
		}else if(pass.intern() !="123456"){
			System.out.println("Sai pass");
		}
	}
}