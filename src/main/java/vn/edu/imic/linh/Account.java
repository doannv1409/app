package vn.edu.imic.linh;

abstract class Account {
	protected double blance;
	protected int transaction;
	
	public Account(double blance){
		this.blance = blance;
		this.transaction = 0;
	}
	protected void deposite(double amount){
		this.blance += amount;
		this.transaction++;
	}
	
	protected  void withDraw(double amount){
		this.blance -= amount;
		this.transaction++;
	}
	
	abstract double endMonthCharge();
	
	protected void endMonth(){
		System.out.printf("So tien con lai trong tai khoan la: %f\n", (this.blance - this.endMonthCharge()));
		System.out.printf("So giao dich trong thang la: %d", this.transaction);
		this.transaction = 0;
	}

}
