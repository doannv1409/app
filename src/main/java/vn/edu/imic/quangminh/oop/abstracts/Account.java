

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
//		double fee = this.endMonthCharge();
		
		this.balance -= fee;
		
		System.out.println("So tien con lai trong TK: " + this.balance);
		System.out.println("Tong so giao dich: " + this.transactions);
		
		this.transactions = 0;
	}
	
	//Tinh phi trong thang: Tuy vao loai tai khoan se co cash tinh phi 
	//khac nhau -> abstract method
	protected abstract double endMonthCharge();
}
