package vn.edu.imic.linh;

public class Gambler extends Account {
	
	
	public Gambler(double blance){
		super(blance);
	}
	
	@Override
	protected double endMonthCharge(){
		return 1;
	}
	
	private double createFee(double amount){
		double percentage = Math.random();
		
		if(percentage <= 0.49 ){
			return 0;
		}
		else{
			return amount * 2;
		}
	}
	
	@Override
	protected void withDraw(double amount){
		super.withDraw(amount);
		this.blance -= this.createFee(amount);
	}
	
	public static void main(String[] args){

		Gambler  gambler = new Gambler(10000);
		gambler.deposite(50000);
		gambler.withDraw(500);
		gambler.endMonth();
		
	}
	
}
