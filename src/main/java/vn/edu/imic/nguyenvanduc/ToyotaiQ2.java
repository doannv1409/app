package vn.edu.imic.nguyenvanduc;

public class ToyotaiQ2 extends ToyotaiQ {
	private String guongDieukhien;
	private String denSuong;
	private String chiaKhoaThongMinh;
public ToyotaiQ2(String vanhDuc, String denPha, String canGat, String xyLanh, String tieuThu, String nongDo,
			String dieuHoa, String guongDieukhien,String denSuong,String chiaKhoaThongMinh) {
		super(vanhDuc, denPha, canGat, xyLanh, tieuThu, nongDo, dieuHoa);
		this.guongDieukhien=guongDieukhien;
		this.denSuong=denSuong;
		this.chiaKhoaThongMinh=chiaKhoaThongMinh;
		
	}
public String getGuongDieukhien() {
	return guongDieukhien;
}
public void setGuongDieukhien(String guongDieukhien) {
	this.guongDieukhien = guongDieukhien;
}
public String getDenSuong() {
	return denSuong;
}
public void setDenSuong(String denSuong) {
	this.denSuong = denSuong;
}
/*public String getChiaKhoaThongMinh() {
	return chiaKhoaThongMinh;
}*/
public void setChiaKhoaThongMinh(String chiaKhoaThongMinh) {
	this.chiaKhoaThongMinh = chiaKhoaThongMinh;
}

@Override
public void print() {
	super.print();
	System.out.println("+ Gương và điều khiển "+guongDieukhien);
	System.out.println("+ Đèn "+denSuong);
	System.out.println("+ Hệ thống "+chiaKhoaThongMinh);
}
}
