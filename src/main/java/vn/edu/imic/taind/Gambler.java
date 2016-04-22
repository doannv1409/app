package vn.edu.imic.taind;

public class Gambler extends Account {
	public Gambler(double balance){
		super(balance);
	}
	
	@Override
	public void withdraw(double amount){
		super.withdraw(amount);
		this.balance = this.balance - this.fee(amount);
	}
	
	public double fee(double amount){
		double percent =  Math.random();
		if (percent <= 0.49) {
			return 0;
		}else{
			return amount*2;
		}			
	}
	
	@Override
	public double endMonthCharge(){
		return 0;
	}
}
