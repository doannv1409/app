package vn.edu.imic.trinhnv;

class NickleNDime extends Account {
	
	double withdrawCount = 0.5;
	
	@Override
	protected void withdraw(double amount) {
		this.balance -= (amount + withdrawCount);
		this.transactions ++;
	}
	
	@Override
	protected double endMothCharge() {
		// TODO Auto-generated method stub
		return 0;
	}
}
