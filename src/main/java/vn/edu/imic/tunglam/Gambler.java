package vn.edu.imic.tunglam;

import java.util.Random;

public class Gambler extends Account {
	
	@Override
	protected void withdraw(double amount) {
		Random random = new Random();
		int r = random.nextInt(100);
		if ((r >= 0) && (r <= 49)) {
			System.out.println("So tien rut la: " + amount);
		} else {
			System.out.println("So tien rut ra la: " + (this.balance -= 2 * amount));
		}
	}

	@Override
	protected double endMonthCharge() {
		return 0;
	}
}
