package vn.edu.imic.honghieu;

public abstract class InterfaceAccount {
	protected  double balance;
	protected double transactions;
	 protected void deposit(double amount) {
		 this.balance += amount;
		 this.transactions ++;
	}
	 protected void withDraw(double amount) {
		 this.balance -= amount;
		 this.transactions ++;
	}
	 protected void endMonth() {
			double fee = this.endMonthCharge();
			this.balance -= fee;	
			System.out.println("So tien con lai trong TK: " + this.balance);
			System.out.println("Tong so giao dich: " + this.transactions);	
			this.transactions = 0;
	}
	
	 protected abstract double endMonthCharge();
}
