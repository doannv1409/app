package vn.edu.imic.leanhtuan;

public class Fee_Test extends Polymophism_Fee{

	public Fee_Test(double balance, int transactions) {
		super(balance, transactions);
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args){
		Polymophism_Fee fee = new Polymophism_Fee(1000, 0);
		fee.deposit();
		fee.withdraw();
		fee.endMonth();
		
	}
}
