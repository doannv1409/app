package vn.edu.imic.quangminh.oop.abstracts;

public class FeeTest {
	public static void main(String[] args) {
		Fee fee = new Fee();
		fee.deposit(1000);
		fee.withdraw(100);
		fee.endMonth();
	}
}
