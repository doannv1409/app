package vn.edu.imic.leanhtuan;

public class Fee_Test extends Polymophism_Fee{

	public static void main(String [] args){
		Polymophism_Fee fee = new Polymophism_Fee();
		fee.balance = 1000;
		fee.deposit();
		fee.withdraw();
		fee.endMonth();
		
	}
}
