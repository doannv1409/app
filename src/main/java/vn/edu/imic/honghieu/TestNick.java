package vn.edu.imic.honghieu;

public class TestNick {
	public static void main(String[] args) {
		InterfaceNickleNDime nick= new InterfaceNickleNDime();
		nick.withdrawCount = 20;
		nick.deposit(1000);
		nick.withDraw(500);
		nick.endMonth();
	}
}
