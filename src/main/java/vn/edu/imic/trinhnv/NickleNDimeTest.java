package vn.edu.imic.trinhnv;

public class NickleNDimeTest {
	public static void main(String[] args) {
		NickleNDime nickNdime = new NickleNDime();
		nickNdime.deposit(1000);
		nickNdime.withdraw(100);
		nickNdime.withdraw(100);
		nickNdime.endMoth();
	}
}
