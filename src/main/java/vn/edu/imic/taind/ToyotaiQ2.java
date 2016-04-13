package vn.edu.imic.taind;

public class ToyotaiQ2 extends ToyotaiQ{
	public String guong = "Guong dieu khien dien va co suoi";
	public String khoa = "He thong chia khoa thong minh";
	public String den = "Den suong mu";
	public ToyotaiQ2() {
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
		.append("+ ").append(den).append("\n")
		.append("+ ").append(khoa).append("\n");	
		return str.toString();
	}
	
	public static void main(String[] args){
		ToyotaiQ2 toyotaiq1 = new ToyotaiQ2();
		System.out.println(toyotaiq1.toString());
	}
	
}
