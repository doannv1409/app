package vn.edu.imic.leanhtuan;


public abstract class Polymophism_Account {

	protected double balance;
	protected int transactions = 0;
	
	//Remove scanner in method deposit, withdraw
	public void deposit(double amount){
		
		balance += amount;
		transactions ++;
		
	}

	protected void withdraw(double amount){
		
		balance -= amount;
		transactions ++;
	}
	
	protected void endMonth(){
		double fee = endMonthCharge();
		balance -= fee;
		System.out.println("So Tien Con Lai La : " + balance);
		System.out.println("Tong So Giao Dich : " + transactions);
		
	}
	
	protected abstract double endMonthCharge();
	
	
	
}
