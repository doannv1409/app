package vn.edu.imic.hoangnd;

public abstract class Account {
	protected double balance = 50;
	protected int transactions = 0;
	protected int count;

	protected void deposit(double amount) {
		this.balance += amount;
		this.transactions++;
	}

	protected void withdraw(double amount) {
		this.balance -= amount;
		this.transactions++;
	} 

	protected void endMonth() {
		double fee = endMonthCharge();
		this.balance -= fee;
		System.out.println("So tien con lai: " + this.balance);
		System.out.println("So giao dich: " + this.transactions);
		this.transactions = 0;
	}

	protected abstract double endMonthCharge();

	public static void main(String[] args) {
		Fee fee = new Fee();
		fee.deposit(10);
		fee.withdraw(20);
		System.out.println("Tai khoan Fee: ");
		fee.endMonth();
		
		NickleNDime nickleDime = new NickleNDime();
		nickleDime.deposit(10);
		nickleDime.withdraw(15);
		nickleDime.withdraw(25);
		System.out.println("\nTai khoan NickleDime: ");
		nickleDime.endMonth();
		
		Gambler gambler = new Gambler();
		gambler.deposit(10);
		gambler.withdraw(15);
		gambler.withdraw(5);
		System.out.println("\nTai khoan Gambler: ");
		gambler.endMonth();
	}
}
