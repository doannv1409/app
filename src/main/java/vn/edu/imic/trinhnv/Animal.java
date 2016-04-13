package vn.edu.imic.trinhnv;

public class Animal {
	protected String chan;
	protected String mat;
	protected String tai;
	
	public Animal(){
		
	}
	public Animal(String chan, String mat, String tai){
	}
	public void Chay(){
		System.out.println("+Biet chay");
	}
	
	public void Ngu(){
		System.out.println("+Biet ngu \n");
	}

	public void showInfor() {
		// TODO Auto-generated method stub
		System.out.println("1-Dac diem chung cua Dong Vat");
		System.out.println("+Co chan");
		System.out.println("+Co mat");
		System.out.println("+Co tai");
	}
}
