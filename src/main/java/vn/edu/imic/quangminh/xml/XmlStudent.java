package vn.edu.imic.quangminh.xml;

import java.util.Date;

public class XmlStudent {
	private int id;
	private String maSV;
	private String hoTen;
	private String email;
	private String gioiTinh;
	private String soCMND;
	private String soDienThoai;
	private Date ngaySinh;
	
	public XmlStudent(int id, String maSv, 
			String gioiTinh, Date ngaySinh, 
			String hoten, String email,
			String soCMND, String soDT) {
		this.id = id;
		this.maSV = maSv;
		this.gioiTinh = gioiTinh;
		this.hoTen = hoten;
		this.email = email;
		this.soCMND = soCMND;
		this.soDienThoai = soDT;
		this.ngaySinh = ngaySinh;
	}
	
	public XmlStudent() {
	
	}
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "XmlStudent [id=" + id + ", maSV=" + maSV + ", hoTen=" + hoTen
				+ ", email=" + email + ", gioiTinh=" + gioiTinh + ", soCMND="
				+ soCMND + ", soDienThoai=" + soDienThoai + ", ngaySinh="
				+ ngaySinh + "]";
	}
}
