package vn.edu.imic.leanhtuan;

public class Gambler_Test extends Polymophism_Gambler{

	public Gambler_Test(double balance, int transactions) {
		super(balance, transactions);
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args){
		Polymophism_Gambler gambler = new Polymophism_Gambler(1000,0);
		gambler.withdraw();
		gambler.endMonth();
		
	}
}
