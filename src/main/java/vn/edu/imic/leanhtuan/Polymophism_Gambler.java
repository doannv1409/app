package vn.edu.imic.leanhtuan;

import java.util.Random;

public class Polymophism_Gambler extends Polymophism_Account{

	@Override
	public void withdraw(double amount){
		
		System.out.println("Moi Nhap So Tien Can Rut : ");
		Random random = new Random();
		int temple = random.nextInt(100);
		if((temple >=0 )&&(temple <=49)){
			System.out.println("Ban Vua Rut So Tien : " + amount);
		}
		
		else{
			balance -= 2*amount;
		}
		transactions ++;
	}
	
	@Override
	protected double endMonthCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
