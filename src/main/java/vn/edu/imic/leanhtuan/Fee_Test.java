package vn.edu.imic.leanhtuan;

public class Fee_Test extends Polymophism_Fee{

	public static void main(String [] args){
		Polymophism_Fee fee = new Polymophism_Fee();
		
		fee.deposit(1000);
		fee.withdraw(500);
		fee.endMonth();
		
	}
}
