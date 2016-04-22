package vn.edu.imic.trinhnv;

import java.util.Random;

class Gambler extends Account{

	@Override
	protected void withdraw(double amount) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int  n = rand.nextInt(100) + 1;
		//TODO ko tru tien
		if (n < 49) {
			this.balance -= amount;
			System.out.println("You are so lucky !");
		}else {
			this.balance -= (2 * amount);
			System.out.println("You are good but i'm sorry !");
		}
		this.transactions ++;
		
	}
	@Override
	protected double endMothCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
