package vn.edu.imic.hoangnd;

public class Gambler extends Account{

	
	@Override
	protected void withdraw(double amount) {
		this.balance -= amount;
		this.transactions++;
		if(Math.random() >= 0.49){
			this.balance -= amount;
		} 
	} 
	
	@Override
	protected void endMonth() {
		System.out.println("So tien con lai: " + this.balance);
		System.out.println("So giao dich: " + this.transactions);
		this.transactions = 0;
	}

	@Override
	protected double endMonthCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
