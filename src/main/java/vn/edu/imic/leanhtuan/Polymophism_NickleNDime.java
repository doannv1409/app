package vn.edu.imic.leanhtuan;


public class Polymophism_NickleNDime extends Polymophism_Account {

	//Sua lai chuyen sang properties withdrawCount de tinh phi
	//Note: reset ve 0 khi call endMonthCharge() bien withdrawCount

	
	protected double withdrawCount;
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
		transactions++;
		withdrawCount++;
	}

	@Override
	protected double endMonthCharge() {
		double fee = withdrawCount * 0.5;
		withdrawCount = 0;
		return fee;
	}
	
	
}
