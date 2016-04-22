package vn.edu.imic.nguyenvanduc.oop.abstracts;

public class NickleNDime extends Account {
private int withdrawCount;
	@Override
	protected void withdraw(double amount) {
		balance -= amount;
		withdrawCount++;
		transactions++;
	}
	@Override
	protected double endMonthCharge() {
		// TODO Auto-generated method stub
		return withdrawCount*0.5;
	}

}
