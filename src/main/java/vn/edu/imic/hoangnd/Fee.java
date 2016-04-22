package vn.edu.imic.hoangnd;

public class Fee extends Account{

	@Override
	protected double endMonthCharge() {
		return 5;
	}

}
