package vn.edu.imic.leanhtuan;

public class Gambler_Test extends Polymophism_Gambler{


	public static void main(String [] args){
		Polymophism_Gambler gambler = new Polymophism_Gambler();
		gambler.balance = 1000;
		gambler.withdraw();
		gambler.endMonth();
		
	}
}
