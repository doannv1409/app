package vn.edu.imic.leanhtuan;

public class NickleNDime_Test extends Polymophism_NickleNDime{

	
	public static void main(String [] args){
		Polymophism_NickleNDime account1 = new Polymophism_NickleNDime();
		
		account1.balance = 10000;
		account1.withdraw();
		account1.endMonth();
	}
}
