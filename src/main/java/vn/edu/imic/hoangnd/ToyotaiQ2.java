package vn.edu.imic.hoangnd;

public class ToyotaiQ2 extends Toyota{
	
	public String guong = "Guong dieu khien va co suoi";
	public String amThanh = "Am thanh 6 loa";
	public String heThong = "He thong chia khoa thong minh";


	public ToyotaiQ2() { 
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ToyotaiQ2 iQ2 = new ToyotaiQ2();
		//System.out.println(iQ2.dieuHoa);
		System.out.println(iQ2);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(super.toString());
		str.append("2 - Phu kien di rieng cho dong xe nay: ").append("\n")
		.append("+").append(guong).append("\n")
		.append("+").append(amThanh).append("\n")
		.append("+").append(heThong);
		return str.toString();
	}
}
