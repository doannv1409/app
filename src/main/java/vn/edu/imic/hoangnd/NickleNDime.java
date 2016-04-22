package vn.edu.imic.hoangnd;

public class NickleNDime extends Account{
	protected int withdrawCount;
	@Override
	protected double endMonthCharge() {
		return this.withdrawCount*0.5;
	}

	@Override
	protected void withdraw(double amount) {
		this.balance -= amount;
		this.transactions++;
		this.withdrawCount++;
	}
}
