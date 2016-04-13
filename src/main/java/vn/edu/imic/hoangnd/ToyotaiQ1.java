package vn.edu.imic.hoangnd;

public class ToyotaiQ1 extends Toyota{
	
	public String guong = "Guong dieu khien va co suoi";
	public String amThanh = "Am thanh 6 loa";
	public String denSuongMu = "Den suong mu";
	
//	public ToyotaiQ1(String vanhDuc, String denPha, String canGat, String xyLanh, String tieuThuNhienLieu,
//			String nongDoKhiThai, String dieuHoa, String guong, String amThanh, String denSuongMu) {
//		super(vanhDuc, denPha, canGat, xyLanh, tieuThuNhienLieu, nongDoKhiThai, dieuHoa);
//		this.guong = guong;
//		this.amThanh = amThanh;
//		this.denSuongMu = denSuongMu;
//	}

	public ToyotaiQ1() { 
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ToyotaiQ1 iQ1 = new ToyotaiQ1();
		//System.out.println(iQ1.dieuHoa);
		System.out.println(iQ1.toString());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(super.toString());
		str.append("2 - Phu kien di rieng cho dong xe nay: ").append("\n")
		.append("+").append(guong).append("\n")
		.append("+").append(amThanh).append("\n")
		.append("+").append(denSuongMu);
		return str.toString();
	}
}
