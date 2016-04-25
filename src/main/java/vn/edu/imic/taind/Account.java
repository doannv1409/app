package vn.edu.imic.taind;

public abstract class Account {
	protected double balance;
	protected double transactions;
	
	public Account (double balance){
		this.balance = balance;
	}
	
	public void deposit (double amount){
		this.balance = this.balance + amount;
		this.transactions++;
	}
	
	public void withdraw (double amount){
		this.balance = this.balance - amount;
		this.transactions++;
	}
	
	public void endMonth(){
		this.balance = this.balance - this.endMonthCharge();
		System.out.println("So tien con lai trong tai khoan: " + this.balance);
		System.out.println("So giao dich trong thang: " + this.transactions );
		this.transactions = 0;
	}
	
	abstract double endMonthCharge();
	
	public static void main(String[] args) {
		Fee Taind = new Fee(2000000);
		Taind.deposit(1000000);
		Taind.withdraw(500000);
		Taind.endMonth();
		
		NickleNDime Hoangnd = new NickleNDime(3000000);
		Hoangnd.deposit(2000000);
		Hoangnd.endMonth();
		
		Gambler Linhdm = new Gambler(5000000);
		Linhdm.deposit(1000000);
		Linhdm.withdraw(5000000);
		Linhdm.endMonth();
	}
}
