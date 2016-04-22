package vn.edu.imic.taind;

public class Fee extends Account {
	public Fee(double balance){
		super(balance);
	}
	
	
	@Override
	public double endMonthCharge(){
		return 5.00;
	}
}
