package vn.edu.imic.linh;

public class Fee extends Account {
	
	public Fee(double blance){
		super(blance);
	}
	
	@Override
	protected double endMonthCharge(){
		double fee = 5;
		return fee;
	}
	
	public static void main(String[] args){

		Fee fee = new Fee(10000);
		fee.deposite(5000);
		fee.withDraw(5000);
		fee.endMonth();
		
	}

}
