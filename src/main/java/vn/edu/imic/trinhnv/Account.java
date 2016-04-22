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
		double fee = this.endMothCharge();
		this.balance -= fee;
		System.out.println("So tien con lai trong TK : " + this.balance);
		System.out.println("So giao dich trong thang : " + this.transactions);
		
		this.transactions = 0;
	}
	
	protected abstract double endMothCharge();
}
