package vn.edu.imic.nguyenvanduc.oop.abstracts;

public class NickleNDime extends Account {
	private int withdrawCount;
	
	@Override
	protected void withdraw(double amount) {
		balance -= amount;
		withdrawCount++;
		transactions++;
	}
	
	//TODO reset withdrawCount
	@Override
	protected double endMonthCharge() {
		return withdrawCount*0.5;
	}

}
