package vn.edu.imic.hongtran;

public class ToyotaiQ {
	protected String vanhduchopkim; 
	protected String denphacambienanhsang;
	protected String cangatnuoccambien;
	protected String Xylanh;
	protected String tieuthunhienlieu;
	protected String nongdokhithai;
	protected String dieuhoanhietdo;
	public String getVanhduchopkim() {
		return vanhduchopkim;
	}
	public void setVanhduchopkim(String vanhduchopkim) {
		this.vanhduchopkim = vanhduchopkim;
	}
	public String getDenphacambienanhsang() {
		return denphacambienanhsang;
	}
	public void setDenphacambienanhsang(String denphacambienanhsang) {
		this.denphacambienanhsang = denphacambienanhsang;
	}
	public String getCangatnuoccambien() {
		return cangatnuoccambien;
	}
	public void setCangatnuoccambien(String cangatnuoccambien) {
		this.cangatnuoccambien = cangatnuoccambien;
	}
	public String getXylanh() {
		return Xylanh;
	}
	public void setXylanh(String xylanh) {
		Xylanh = xylanh;
	}
	public String getTieuthunhienlieu() {
		return tieuthunhienlieu;
	}
	public void setTieuthunhienlieu(String tieuthunhienlieu) {
		this.tieuthunhienlieu = tieuthunhienlieu;
	}
	public String getNongdokhithai() {
		return nongdokhithai;
	}
	public void setNongdokhithai(String nongdokhithai) {
		this.nongdokhithai = nongdokhithai;
	}
	public String getDieuhoanhietdo() {
		return dieuhoanhietdo;
	}
	public void setDieuhoanhietdo(String dieuhoanhietdo) {
		this.dieuhoanhietdo = dieuhoanhietdo;
	}
	public ToyotaiQ(String vanhduchopkim, String denphacambienanhsang, String cangatnuoccambien,String Xylanh,String tieuthunhienlieu,String nongdokhithai,String dieuhoanhietdo){
		this.vanhduchopkim = vanhduchopkim;
		this.denphacambienanhsang = "denphacambienanhsang";
		this.cangatnuoccambien = "cangatnuoccambien";
		this.Xylanh = "Xylanh";
		this.tieuthunhienlieu = "tieuthunhienlieu";
		this.nongdokhithai = "nongdokhithai";
		this.dieuhoanhietdo = "dieuhoanhietdo";
	}
	
	public void Thongsochung(){
		
	}
}
