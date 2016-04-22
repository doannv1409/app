package vn.edu.imic.leanhtuan;

public class Polymophism_Fee extends Polymophism_Account{

	public Polymophism_Fee(double balance, int transactions) {
		super(balance, transactions);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double endMonthCharge() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}
