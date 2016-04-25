package vn.edu.imic.trinhnv;

class NickleNDime extends Account {
	//TODO implement lai phan tru tien cuoi thang
	double withdrawCount = 0;
	
	@Override
	protected void withdraw(double amount) {
		this.balance -= (amount);
		this.transactions ++;
		this.withdrawCount ++;
	}
	
	@Override
	protected double endMothCharge() {
		// TODO Auto-generated method stub
		double tax = this.withdrawCount * 0.5;
		this.withdrawCount = 0;
		return tax;
	}
}
