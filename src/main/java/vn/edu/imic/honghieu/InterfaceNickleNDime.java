package vn.edu.imic.honghieu;



public class InterfaceNickleNDime extends InterfaceAccount {
	protected  int withdrawCount;

	 @Override
	 protected void endMonth() {
		 double next = withdrawCount*0.5;
			this.balance -= next;	
			System.out.println("So tien con lai trong TK: " + this.balance);
			System.out.println("Tong so giao dich: " + this.transactions);	
			this.transactions = 0;
	 }
	 @Override
	 protected void withDraw(double amount) {
		 this.balance -= amount;
		 this.transactions ++;
	 }
	@Override
	protected double endMonthCharge() {
		// TODO Auto-generated method stub
		return 0;
	}
}
