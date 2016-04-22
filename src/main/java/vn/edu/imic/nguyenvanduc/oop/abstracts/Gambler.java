package vn.edu.imic.nguyenvanduc.oop.abstracts;

import java.util.Random;

public class Gambler extends Account {

	@Override
	protected void withdraw(double amount) {
		Random rand = new Random();
		int n = rand.nextInt(100) + 1;
		if (n >= 49) {
			balance -= (amount * 2);
		}
	}

	@Override
	protected double endMonthCharge() {
		return 0;
	}

}
