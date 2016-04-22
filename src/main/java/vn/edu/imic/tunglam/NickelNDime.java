package vn.edu.imic.tunglam;

public class NickelNDime extends Account {
	protected double fee;
	protected int withdrawCount;

	@Override
	protected void withdraw(double amount) {
//		this.balance -= amount;
//		this.transactions++;
		super.withdraw(amount);
		this.withdrawCount++;
	}

	@Override
	protected double endMonthCharge() {
		double fee = withdrawCount * 0.5;
		this.withdrawCount=0;
		return fee;
	
	}

}
