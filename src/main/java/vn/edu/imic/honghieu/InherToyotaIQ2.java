package vn.edu.imic.honghieu;

public class InherToyotaIQ2 extends InherToyotaIQ{
	protected String intelkey;
	public InherToyotaIQ2(){
		super();
	}
	public void print(){
		System.out.println("------Thong tin rieng");
		System.out.println("Guong dieu khien va co suoi");
		System.out.println("Den suong mu");
		System.out.println("He thong chia khoa thong minh");
	}
	public static void main (String[] args){
		InherToyotaIQ inherToyotaIQ = new InherToyotaIQ();
		inherToyotaIQ.print();
		InherToyotaIQ2 inherToyotaIQ2 = new InherToyotaIQ2();
		inherToyotaIQ2.print();
	}
}
