package vn.edu.imic.nguyenvanduc;

public class ToyotaiQ1 extends ToyotaiQ {
	private String guongDieuKhien;
	private String amThanh;
	private String denSuong;

public ToyotaiQ1(String vanhDuc,String denPha,String canGat,
		String xyLanh,String tieuThu,String nongDo,String dieuHoa,String guongDieuKhien,String denSuong,String amThanh){
	super(vanhDuc,denPha,canGat,xyLanh,tieuThu,nongDo,dieuHoa);
	this.guongDieuKhien=guongDieuKhien;
	this.amThanh=amThanh;
	this.denSuong=denSuong;
}
public String getGuongDieuKhien() {
	return guongDieuKhien;
}

public void setGuongDieuKhien(String guongDieuKhien) {
	this.guongDieuKhien = guongDieuKhien;
}

public String getAmThanh() {
	return amThanh;
}

public void setAmThanh(String amThanh) {
	this.amThanh = amThanh;
}

public String getDenSuong() {
	return denSuong;
}

public void setDenSuong(String denSuong) {
	this.denSuong = denSuong;
}
@Override
public void print() {
	super.print();
	System.out.println("+ Gương và điều khiển "+guongDieuKhien);
	System.out.println("+ Âm thanh "+amThanh);
	System.out.println("+ Đèn "+denSuong);
}
}
