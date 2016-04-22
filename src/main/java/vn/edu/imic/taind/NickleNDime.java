package vn.edu.imic.taind;

public class NickleNDime extends Account{
	private int withdrawCount;
	public NickleNDime(double balance){
		super(balance);
	}
	
	@Override 
	public void withdraw(double amount){
		super.withdraw(amount);
		this.withdrawCount++;
	}
	
	@Override
	public double endMonthCharge(){
		return this.withdrawCount*0.5;
	} 
	
	@Override
	public void endMonth(){
		super.endMonth();
		this.withdrawCount = 0;
	}
}
