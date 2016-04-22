package vn.edu.imic.haiyen;

public class HDT_NickleDime extends HDT_Account {
	private static final float FEE = (float) 0.5;
	protected int withdrawCount;

	@Override
	protected void endMonth() {
//		double count = this.endMonthCharge();
//		this.balance -= count;
//		System.out.println("So tien con lai trong tai khoan: " + this.balance);
//		System.out.println("Tong so giao dich: " + this.withdrawCount);
		super.endMonth();
		//Reset count withdraw here
	};

	@Override
	protected double endMonthCharge() {
		// TODO set withdrawCount ve 0
		double fee =  this.withdrawCount * FEE;
		//this.withdrawCount=0;
		return fee;
	}

	@Override
	protected void withdraw(double amount) {
		super.withdraw(amount);
		withdrawCount++;

	}

}
