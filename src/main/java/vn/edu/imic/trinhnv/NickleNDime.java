package vn.edu.imic.trinhnv;

class NickleNDime extends Account {
	//TODO implement lai phan tru tien cuoi thang
	double withdrawCount = 0;
	
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
