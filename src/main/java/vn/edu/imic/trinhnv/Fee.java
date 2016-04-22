package vn.edu.imic.trinhnv;

class Fee extends Account {
	public static final int FEE_AMOUNT = 5;
	@Override
	protected double endMothCharge() {
		// TODO Auto-generated method stub
		return FEE_AMOUNT;
	}

}
