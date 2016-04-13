package vn.edu.imic.leanhtuan;

public class Toyota_iQ2  extends Toyota_iQ{
		protected String chiaKhoa;

	
		public Toyota_iQ2(String vanhDuc, String denPha,String denSuongMu, String canGatNuoc, String xyLanh, String tieuThuNhienLieu,
			String nongDoKhiThai, String dieuHoaNhietDo, String guong, String loSuoi) {
		super(vanhDuc, denPha,denSuongMu, canGatNuoc, xyLanh, tieuThuNhienLieu, nongDoKhiThai, dieuHoaNhietDo, guong, loSuoi);
		this.vanhDuc = vanhDuc;
		this.denPha = denPha;
		this.canGatNuoc = canGatNuoc;
		this.xyLanh = xyLanh;
		this.tieuThuNhienLieu = tieuThuNhienLieu;
		this.nongDoKhiThai = nongDoKhiThai;
		this.dieuHoaNhietDo = dieuHoaNhietDo;
		this.guong = guong;
		this.loSuoi = loSuoi;
		this.denSuongMu = denSuongMu;
		
		}

	
		public String getChiaKhoa() {
			return chiaKhoa;
		}

		public void setChiaKhoa(String chiaKhoa) {
			this.chiaKhoa = chiaKhoa;
		}
		
		@Override
		public void inThongSo(){
			System.out.println(vanhDuc + denPha + canGatNuoc + xyLanh + tieuThuNhienLieu + nongDoKhiThai + dieuHoaNhietDo + guong + loSuoi + chiaKhoa);
		}
		
		
}
