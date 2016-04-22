package vn.edu.imic.nguyenvanduc.oop.abstracts;

public class Fee extends Account {
	private static final int FEE_AMOUNT = 5;

	@Override
	protected double endMonthCharge() {
		// TODO Auto-generated method stub
		return FEE_AMOUNT;
	}
}
