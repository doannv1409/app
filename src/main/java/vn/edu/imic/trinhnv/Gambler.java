package vn.edu.imic.trinhnv;

import java.util.Random;

class Gambler extends Account{

	@Override
	protected void withdraw(double amount) {
		Random rand = new Random();
		int n = rand.nextInt(100) + 1;
		if (n >= 49) {
			balance -= (amount * 2);
		}

	}
	@Override
	protected double endMothCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
