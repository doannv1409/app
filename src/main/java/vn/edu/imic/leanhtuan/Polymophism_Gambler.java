package vn.edu.imic.leanhtuan;

import java.util.Random;
import java.util.Scanner;

public class Polymophism_Gambler extends Polymophism_Account{

	public Polymophism_Gambler(double balance, int transactions) {
		super(balance, transactions);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(){
		Scanner scan = new Scanner(System.in);
		double amount;
		System.out.println("Moi Nhap So Tien Can Rut : ");
		amount = scan.nextDouble();
		Random random = new Random();
		int temple = random.nextInt(100);
		if((temple >=0 )&&(temple <=49)){
			System.out.println("Ban Vua Rut So Tien : " + amount);
		}
		
		else{
			this.balance -= 2*amount;
		}
		scan.close();
		this.transactions ++;
	}
	
	@Override
	protected double endMonthCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
