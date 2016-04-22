package vn.edu.imic.hoangnd;

public class NickleNDime extends Account{
	protected int withdrawCount;
	@Override
	protected double endMonthCharge() {
		double fee = this.withdrawCount*0.5;
		this.withdrawCount = 0;
		return fee;
	} 

	@Override
	protected void withdraw(double amount) {
		this.balance -= amount;
		this.transactions++;
		this.withdrawCount++;
	}
} 
