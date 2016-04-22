package vn.edu.imic.haiyen;

public class NickleDimeTest {
	public static void main(String[] args) {
		NickleDime nick = new NickleDime();
		nick.withdrawCount = 8;
		nick.deposit(1000);
		nick.withdraw(500);
		nick.endMonth();
	}

}
