package vn.edu.imic.tunglam;

public abstract class Account {
	protected double balance;
	protected int transactions;

	// gửi tiền vào 1 tài khoản
	protected void deposit(double amount) {
		this.balance += amount;
		this.transactions++;
	}

	// rut tien tu 1 tai khoan
	protected void withdraw(double amount) {
		this.balance -= amount;
		this.transactions++;
	}

	protected void endMonth() {
		double fee = this.endMonthCharge();
		this.balance -= fee;
		System.out.println("So tien con lai trong tai khoan la " + this.balance);
		System.out.println("So giao dich duoc thuc hien trong thang la " + this.transactions);
		this.transactions = 0;
	}

	protected abstract double endMonthCharge();
}
