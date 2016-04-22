package vn.edu.imic.haiyen;

import java.util.Scanner;

public abstract class HDT_Account {
	protected double balance;//so tien hien co
	protected int transactions = 0;// so lan rut/gui

	// gui mot khoan tien vao tai khoan
	protected void deposit(double amount) {
		this.balance += amount;
		this.transactions++;
	}

	// rut tien
	protected void withdraw(double amount) {
		this.balance -= amount;// amount >0
		this.transactions++;

	}

	// tinh phi
	protected void endMonth() {
		double fee = this.endMonthCharge();//phi trong thang
		this.balance -= fee;//so tien con lai
		
		System.out.println("so tien con lai trong tai khoan: " + this.balance);
		System.out.println("tong so giao dich: " + this.transactions);
		//this.transactions = 0;
	}

	protected abstract double endMonthCharge();

}
