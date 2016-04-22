package vn.edu.imic.nguyenvanduc.oop.abstracts;

public abstract class Account {
	protected float balance;
	protected float transactions;

	protected void deposit(double amount) {
		balance += amount;
		transactions++;
	}

	protected void withdraw(double amount) {
		balance -= amount;
		transactions++;
	}

	protected void endMonth() {
		double fee = endMonthCharge();

		this.balance -= fee;

		System.out.println("So tien con lai trong TK: " + balance);
		System.out.println("Tong so giao dich: " + this.transactions);

		this.transactions = 0;
	}

	protected abstract double endMonthCharge();

}
