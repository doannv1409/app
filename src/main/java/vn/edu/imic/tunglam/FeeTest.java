package vn.edu.imic.tunglam;

public class FeeTest {
		public static void main(String[] args) {
			Fee fee = new Fee();
			fee.deposit(1000);
			fee.withdraw(100);
			fee.endMonth();
			
			NickelNDime nickDime = new NickelNDime();
			nickDime.withdraw(100);
			nickDime.withdraw(100);
			nickDime.withdraw(100);
			nickDime.withdraw(100);
			nickDime.withdraw(100);
						
			Gambler gambler = new Gambler();
			gambler.deposit(10000);
			gambler.withdraw(400);
			gambler.endMonth();
		
		}
	}


