package vn.edu.imic.nguyenvanduc.oop.abstracts;

import java.util.Random;

public class Gambler extends Account {
	int n;

	@Override
	protected void withdraw(double amount) {
		Random rand = new Random();

		n = rand.nextInt(100) + 1;
		if (n < 49) {

		} else {
			balance -= (amount * 2);
		}
	}

	@Override
	protected double endMonthCharge() {
		return 0;
	}

}
