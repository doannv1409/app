package vn.edu.imic.leanhtuan;

public class Toyota_iQ {
			protected String vanhDuc;
			protected String denPha;
			protected String canGatNuoc;
			protected String xyLanh;
			protected String tieuThuNhienLieu;
			protected String nongDoKhiThai;
			protected String dieuHoaNhietDo;
			protected String guong;
			protected String loSuoi;
			protected String denSuongMu;
			
			public Toyota_iQ(String vanhDuc, String denPha,String denSuongMu, String canGatNuoc, String xyLanh, String tieuThuNhienLieu, String nongDoKhiThai, String dieuHoaNhietDo, String guong, String loSuoi){
				
			}
			
			public String getGuong() {
				return guong;
			}
			public void setGuong(String guong) {
				this.guong = guong;
			}
			public String getLoSuoi() {
				return loSuoi;
			}
			public void setLoSuoi(String loSuoi) {
				this.loSuoi = loSuoi;
			}
			public String getDenSuongMu() {
				return denSuongMu;
			}
			public void setDenSuongMu(String denSuongMu) {
				this.denSuongMu = denSuongMu;
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
			public String getCanGatNuoc() {
				return canGatNuoc;
			}
			public void setCanGatNuoc(String canGatNuoc) {
				this.canGatNuoc = canGatNuoc;
			}
			public String getXyLanh() {
				return xyLanh;
			}
			public void setXyLanh(String xyLanh) {
				this.xyLanh = xyLanh;
			}
			public String getTieuThuNhienLieu() {
				return tieuThuNhienLieu;
			}
			public void setTieuThuNhienLieu(String tieuThuNhienLieu) {
				this.tieuThuNhienLieu = tieuThuNhienLieu;
			}
			public String getNongDoKhiThai() {
				return nongDoKhiThai;
			}
			public void setNongDoKhiThai(String nongDoKhiThai) {
				this.nongDoKhiThai = nongDoKhiThai;
			}
			public String getDieuHoaNhietDo() {
				return dieuHoaNhietDo;
			}
			public void setDieuHoaNhietDo(String dieuHoaNhietDo) {
				this.dieuHoaNhietDo = dieuHoaNhietDo;
			}
			
			public void inThongSo(){
				System.out.println(vanhDuc + denPha + canGatNuoc + xyLanh + tieuThuNhienLieu + nongDoKhiThai + dieuHoaNhietDo + guong + loSuoi);
			}
}
