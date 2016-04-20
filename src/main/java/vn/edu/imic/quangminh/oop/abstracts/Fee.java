package vn.edu.imic.quangminh.oop.abstracts;

public class Fee extends Account {

	private static final int FEE_AMOUNT = 5;

	@Override
	protected double endMonthCharge() {
		return FEE_AMOUNT;
	}
}
