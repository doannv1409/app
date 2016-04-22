package vn.edu.imic.linh;

public class NickeNDime extends Account {
	private int withDrawCount;
	
	public NickeNDime(double blance){
		super(blance);
	}
	
	@Override
	protected double endMonthCharge(){
		return this.withDrawCount * 0.5;
	}
	
	@Override
	public void withDraw(double amount){
		super.withDraw(amount);
		this.withDrawCount++;
	}
	
	@Override
	protected void endMonth(){
		super.endMonth();
		this.withDrawCount = 0;
	}
	
	public static void main(String[] args){

		NickeNDime  nickendime = new NickeNDime(10000);
		nickendime.deposite(500);
		nickendime.withDraw(5000);
		nickendime.endMonth();
		
	}
}
