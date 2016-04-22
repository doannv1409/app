package vn.edu.imic.haiyen;

public class HDT_FeeTest {
	public static void main(String[] args) {
		HDT_Fee fee=new HDT_Fee();
		fee.deposit(1000);
		fee.withdraw(100);
		fee.endMonth();
	}

}
