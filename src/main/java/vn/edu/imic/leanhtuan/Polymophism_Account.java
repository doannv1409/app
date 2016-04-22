package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public abstract class Polymophism_Account {

	protected double balance;
	protected int transactions = 0;
	
	
	public void deposit(){
		double amount;
		Scanner scan = new Scanner(System.in);
		System.out.println("Moi Nhap Vao So Tien Can Gui :");
		amount = scan.nextDouble();
		this.balance += amount;
		scan.close();
		this.transactions ++;
		
	}

	protected void withdraw(){
		double amount;
		Scanner scan = new Scanner(System.in);
		System.out.println("Moi Nhap Vao So Tien Can Rut :");
		amount = scan.nextDouble();
		this.balance -= amount;
		this.transactions ++;
		scan.close();
		
	}
	
	protected void endMonth(){
		double fee = endMonthCharge();
		this.balance -= fee;
		System.out.println("So Tien Con Lai La : " + this.balance);
		System.out.println("Tong So Giao Dich : " + this.transactions);
		
	}
	
	protected abstract double endMonthCharge();
	
	
	
}
