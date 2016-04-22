package vn.edu.imic.haiyen;

public class Fee extends Account{
	private static final int FEE_AMOUNT = 5;

	@Override
	public double endMonthCharge() {
		return FEE_AMOUNT;
		
	}

}
