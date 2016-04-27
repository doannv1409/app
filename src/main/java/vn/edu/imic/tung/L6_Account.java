package vn.edu.imic.tung;

public abstract class L6_Account {
	// so tien con lai trong tai khoan
	protected double balance;
	// so giao dih troong mot thang
	protected int transactions;
	protected int count;
	// ham gui khoan tien
	protected void eposit (double amount){
		this.balance += amount;
		this.transactions++;
		
	}
	// ham rut khoan tien 
	protected void withdraw(double amount){
		this.balance -= amount;
		this.transactions ++;
		
	}
	protected void endMonth (){
		double fee = endMonthCharge();
		this.balance -=fee;
		System.out.println("so tien con lai"+this.balance);
		System.out.println("so giao dich trong thang"+ this.balance);
		this.transactions = 0;
		
	}
	protected abstract double endMonthCharge();

}
