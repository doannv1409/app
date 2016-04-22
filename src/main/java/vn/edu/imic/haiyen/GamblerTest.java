package vn.edu.imic.haiyen;

public class GamblerTest {
	public static void main(String[] args) {

		Gamble gamble = new Gamble();
		gamble.deposit(10000);
		gamble.withdraw(500);
		gamble.endMonth();

	}

}
