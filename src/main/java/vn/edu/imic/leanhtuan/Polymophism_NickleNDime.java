package vn.edu.imic.leanhtuan;

import java.util.Scanner;

public class Polymophism_NickleNDime extends Polymophism_Account {

	public Polymophism_NickleNDime(double balance, int transactions) {
		super(balance, transactions);
		// TODO Auto-generated constructor stub
	}

	public double withdrawCount() {
		double finalBalance = this.transactions * 0.5;
		return finalBalance;

	}

	@Override
	public void withdraw() {
		double amount;
		Scanner scan = new Scanner(System.in);
		System.out.println("Moi Nhap Vao So Tien Can Rut :");
		amount = scan.nextDouble();
		this.balance -= amount;
		scan.close();
		this.transactions++;
	}

	@Override
	protected double endMonthCharge() {
		
		return withdrawCount();
	}
	
	
}
