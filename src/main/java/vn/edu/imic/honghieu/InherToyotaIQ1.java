package vn.edu.imic.honghieu;

public class InherToyotaIQ1 extends InherToyotaIQ {
	protected String guongvasuoi;
	protected String loa;
	protected String densuongmu;
	public InherToyotaIQ1(){
		super();
	}
	public void print(){
		System.out.println("------Phu kien rieng cho xe");
		System.out.println("Guong dieu khien dien va co suoi");
		System.out.println("Den suong mu");
		System.out.println("Am thanh 6 loa");
	}
	public static void main (String[] args){
		InherToyotaIQ inherToyotaIQ = new InherToyotaIQ();
		inherToyotaIQ.print();
		
		InherToyotaIQ1 inherToyotaIQ1 = new InherToyotaIQ1();
		inherToyotaIQ1.print();
	}
}
