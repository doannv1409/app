package vn.edu.imic.quangminh.oop.abstracts;

public abstract class Account {
	protected double balance;
	protected int transactions;
	
	//Gui tien vao tai khoan
	protected void deposit(double amount) {
		this.balance += amount;
		this.transactions ++;
	}

	//Rut tien khoi tai khoan
	protected void withdraw(double amount) {
		this.balance -= amount;
		this.transactions ++;
	}
	
	protected void endMonth() {
		double fee = endMonthCharge();
		
		double remainingBalace = this.balance - fee;
		
		System.out.println("So tien con lai trong TK: " + remainingBalace);
		System.out.println("Tong so giao dich: " + this.transactions);
		
		this.transactions = 0;
	}
	
	protected abstract double endMonthCharge();
}
