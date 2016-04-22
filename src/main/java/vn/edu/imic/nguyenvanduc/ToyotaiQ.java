package vn.edu.imic.nguyenvanduc;

public class ToyotaiQ {
	private String vanhDuc;
	private String denPha;
	private String canGat;
	private String xyLanh;
	private String tieuThu;
	private String nongDo;
	private String dieuHoa;
	public ToyotaiQ(String vanhDuc,String denPha,String canGat,String xyLanh,String tieuThu,String nongDo,String dieuHoa){
		this.vanhDuc=vanhDuc;
		this.denPha=denPha;
		this.canGat=canGat;
		this.xyLanh=xyLanh;
		this.tieuThu=tieuThu;
		this.nongDo=nongDo;
		this.dieuHoa=dieuHoa;
		
	}
	public String getVanhDuc() {
		return vanhDuc;
	}
	public void setVanhDuc(String vanhDuc) {
		this.vanhDuc = vanhDuc;
	}
	public String getDenPha() {
		return denPha;
	}
	public void setDenPha(String denPha) {
		this.denPha = denPha;
	}
	public String getCanGat() {
		return canGat;
	}
	public void setCanGat(String canGat) {
		this.canGat = canGat;
	}
	public String getXyLanh() {
		return xyLanh;
	}
	public void setXyLanh(String xyLanh) {
		this.xyLanh = xyLanh;
	}
	public String getTieuThu() {
		return tieuThu;
	}
	public void setTieuThu(String tieuThu) {
		this.tieuThu = tieuThu;
	}
	public String getNongDo() {
		return nongDo;
	}
	public void setNongDo(String nongDo) {
		this.nongDo = nongDo;
	}
	public String getDieuHoa() {
		return dieuHoa;
	}
	public void setDieuHoa(String dieuHoa) {
		this.dieuHoa = dieuHoa;
	}
	public void print() {
		System.out.println("+ Vành đúc hợp kim : "+vanhDuc);
		System.out.println("+ Đèn pha "+denPha);
		System.out.println("+ Cần gạt có "+canGat);
		System.out.println("+ Xy lanh VVT-I dung tích "+xyLanh);
		System.out.println("+ Tiêu thụ nhiên liệu : "+tieuThu);
		System.out.println("+ Nồng độ khí thải : "+nongDo);
		System.out.println("+  Điều hòa : "+dieuHoa);
	}
}
