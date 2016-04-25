package vn.edu.imic.leanhtuan;


public class NickleNDime_Test extends Polymophism_NickleNDime{
	
	
	public static void main(String [] args){
		
		Polymophism_NickleNDime account1 = new Polymophism_NickleNDime();
		
		account1.deposit(10000);
		account1.withdraw(5000);
		account1.endMonth();
	}
}
