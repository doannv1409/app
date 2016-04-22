package vn.edu.imic.trinhnv;

abstract class Account {
	protected double balance;
	protected int transactions;
	
	protected void deposit(double amount){
		this.balance += amount;
		this.transactions ++;
	}
	
	protected void withdraw(double amount) {
		this.balance -= amount;
		this.transactions ++;
	}
	
	protected void endMoth(){
		//
		double fee = endMothCharge();
		//
	}
	
	protected abstract double endMothCharge();
	
	public static void main(String[] args) {
		
	}
}
