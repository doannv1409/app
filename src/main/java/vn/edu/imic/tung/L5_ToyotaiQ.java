package vn.edu.imic.tung;

public class L5_ToyotaiQ {
	protected String vanhDuc;
	protected String denPha;
	protected String canGatNuoc;
	protected String xyLanh;
	protected String tieuThuNhienLieu;
	protected String nongDoKhiThai;
	protected String dieuHoaNhietDo;
	public L5_ToyotaiQ(){};
	public L5_ToyotaiQ(String vanhDuc, String denPha, String canGatNuoc, String xyLanh, String tieuThuNhienLieu, String nongDoKhiThai, String dieuHoaNhietDo){
		
		
	}
	public String getVanhDuc() {
		return vanhDuc;
	}
	public String getDenPha() {
		return denPha;
	}
	public String getCanGatNuoc() {
		return canGatNuoc;
	}
	public String getXyLanh() {
		return xyLanh;
	}
	public String getTieuThuNhienLieu() {
		return tieuThuNhienLieu;
	}
	public String getNongDoKhiThai() {
		return nongDoKhiThai;
	}
	public String getDieuHoaNhietDo() {
		return dieuHoaNhietDo;
	}

	@Override
	public String toString() {
		return "+ vanh duc" + vanhDuc +"/n"+ "+ den Pha=" + denPha + "+ can Gat Nuoc=" + "/n"+ canGatNuoc
				+ "+ xy Lanh=" + xyLanh+"/n" + "+ tieu Thu Nhien Lieu=" + tieuThuNhienLieu+"/n" + "+ nong Do Khi Thai"
				+ nongDoKhiThai+"/n" + "+ dieu Hoa Nhiet Do" + dieuHoaNhietDo +"/n";
	

}}
