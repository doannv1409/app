package vn.edu.imic.haiyen;

public class HDT_Fee extends HDT_Account{
	private static final int FEE_AMOUNT = 5;

	@Override
	public double endMonthCharge() {
		return FEE_AMOUNT;
		
	}

}
