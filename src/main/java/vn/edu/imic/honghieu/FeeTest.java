package vn.edu.imic.honghieu;

public class FeeTest {
	public static void main(String[] args) {
		InterfaceFree fee = new InterfaceFree();
		fee.deposit(1000);
		fee.withDraw(5);
		fee.endMonth();
		
		InterfaceNickleNDime nickDime = new InterfaceNickleNDime();
		nickDime.endMonth();
	}
}
