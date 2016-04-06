package vn.edu.imic.haiyen;

import java.util.Scanner;

public class BTF5_CapDoi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ten=readInput(sc, "Nhap ten: ");
		String tuoi=readInput(sc, "Nhap tuoi: ");
		String gioitinh=readInput(sc, "Nhap gioi tinh: nam, nu");
		String tinhtrang=readInput(sc, "Nhap tinh trang hon nhan: da co gia dinh, chua co gia dinh, ly hon");
		Integer tuoiInt=Integer.parseInt(tuoi);
		if(check(tuoiInt, gioitinh, tinhtrang)){
			System.out.println("Duoc phep tham gia");
		}else{
			System.out.println("Khong duoc phep");
		}
		sc.close();
	}
	
	public static String readInput(Scanner sc, String message){
		System.out.println(message);
		String input=sc.nextLine();
		if(input.isEmpty()){
			System.out.println("nhap lai");
		}
		return input;
	}
	
	public static boolean check(int tuoiInt, String gioitinh, String tinhtrang){
		return !(tuoiInt < 19 || tinhtrang.equals("da co gia dinh") || (gioitinh.equals("nam") && tuoiInt < 22));
	}

}
