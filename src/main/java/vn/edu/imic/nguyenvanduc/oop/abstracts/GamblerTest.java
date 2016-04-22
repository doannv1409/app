package vn.edu.imic.nguyenvanduc.oop.abstracts;


public class GamblerTest {

	public static void main(String[] args) {
		Gambler gambler = new Gambler();
		gambler.deposit(1000);
		gambler.withdraw(100);
		gambler.withdraw(100);
		gambler.endMonth();
	}

}
