package vn.edu.imic.honghieu;

public class InterfaceFree extends InterfaceAccount {
	private static final double FEE = 5;
	@Override
	protected double endMonthCharge() {
		return FEE;
	}
}
