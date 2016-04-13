package vn.edu.imic.honghieu;

public class InherToyotaIQ {
	protected  String vanh;
	protected String denpha;
	protected String cangat;
	protected String xilanh;
	protected String xang;
	protected String gio;
	protected String dieuhoa;
	public InherToyotaIQ vanh (String vanh){
		this.vanh = vanh;
		return this;
	}
	public InherToyotaIQ denpha (String denpha){
		this.denpha = denpha;
		return this;
	}
	public InherToyotaIQ cangat (String cangat){
		this.cangat = cangat;
		return this;
	}
	public InherToyotaIQ xilanh (String xilanh){
		this.xilanh = xilanh;
		return this;
	}
	public InherToyotaIQ xang (String xang){
		this.xang = xang;
		return this;
	}
	public InherToyotaIQ gio (String gio){
		this.gio = gio;
		return this;
	}
	public InherToyotaIQ dieuhoa (String dieuhoa){
		this.dieuhoa = dieuhoa;
		return this;
	}
	public void print(){
		System.out.println("------Thong so ki thuat cua xe");
		System.out.println("Vanh duc hop kim 15ich");
		System.out.println("Den pha cam bien anh sang");
		System.out.println("Can gat nuoc cam bien");
		System.out.println("Xy lanh VVT-I dung tich 1lit/3chiec");
		System.out.println("Tieu thu nhien lieu: 3,6lit/100km");
		System.out.println("Nong do khi thai: 99g/km");
		System.out.println("Dieu hoa nhiet do");
	}
	public void scan(){
		
	}
	public static void main (String[] args){
		InherToyotaIQ inherToyotaIQ = new InherToyotaIQ();
		inherToyotaIQ.print();
	}
}
