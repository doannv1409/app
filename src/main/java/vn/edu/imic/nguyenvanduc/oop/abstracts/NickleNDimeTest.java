package vn.edu.imic.nguyenvanduc.oop.abstracts;

public class NickleNDimeTest {

	public static void main(String[] args) {
		NickleNDime nick = new NickleNDime();
		nick.deposit(1000);
		nick.withdraw(100);
		nick.withdraw(100);
		nick.endMonth();
	}

}
