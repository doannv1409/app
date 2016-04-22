package vn.edu.imic.leanhtuan;

public class NickleNDime_Test extends Polymophism_NickleNDime{

	public NickleNDime_Test(double balance, int transactions) {
		super(balance, transactions);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args){
		Polymophism_NickleNDime account1 = new Polymophism_NickleNDime(10000, 0);
		account1.withdraw();
		account1.endMonth();
	}
}
