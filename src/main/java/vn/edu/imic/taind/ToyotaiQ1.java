package vn.edu.imic.taind;

public class ToyotaiQ1 extends ToyotaiQ {
	public String guong = "Guong dieu khien dien va co suoi";
	public String loa = "Am thanh 6 loa ";
	public String den = "Den suong mu";
	
//	public ToyotaiQ1(String vanh, String denpha, String cangat, String xylanh, String nhienlieu, String khithai,
//			String dieuhoa, String guong, String loa, String den) {
//		super(vanh, denpha, cangat, xylanh, nhienlieu, khithai, dieuhoa);
//		this.guong = guong;
//		this.loa = loa;
//		this.den = den;
//		// TODO Auto-generated constructor stub
//	}

	public ToyotaiQ1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("1 - Thong so chung cho cac dong xe:").append("\n")
		.append("+ ").append(vanh).append("\n")
		.append("+ ").append(denpha).append("\n")
		.append("+ ").append(cangat).append("\n")
		.append("+ ").append(xylanh).append("\n")
		.append("+ ").append(nhienlieu).append("\n")
		.append("+ ").append(khithai).append("\n")
		.append("------------------------------").append("\n")
		.append("2 - Phu kien rieng cho dong xe nay:").append("\n")
		.append("+ ").append(guong).append("\n")
		.append("+ ").append(loa).append("\n")
		.append("+ ").append(den).append("\n");	
		return str.toString();
	}
	
	public static void main(String[] args){
		ToyotaiQ1 toyotaiq1 = new ToyotaiQ1();
		System.out.println(toyotaiq1.toString());
	}
	
	
}
