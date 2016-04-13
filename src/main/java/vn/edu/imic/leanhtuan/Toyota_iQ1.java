package vn.edu.imic.leanhtuan;

public class Toyota_iQ1 extends Toyota_iQ{
			protected String amThanh6Loa;

			public Toyota_iQ1(String vanhDuc, String denPha,String denSuongMu, String canGatNuoc, String xyLanh, String tieuThuNhienLieu, String nongDoKhiThai, String dieuHoaNhietDo, String guong, String loSuoi){
				super(vanhDuc,canGatNuoc,tieuThuNhienLieu,denPha,denSuongMu,xyLanh, nongDoKhiThai, dieuHoaNhietDo, guong, loSuoi);
				this.vanhDuc = vanhDuc;
				this.canGatNuoc = canGatNuoc;
				this.tieuThuNhienLieu = tieuThuNhienLieu;
				this.denPha = denPha;
				this.nongDoKhiThai = nongDoKhiThai;
				this.dieuHoaNhietDo = dieuHoaNhietDo;
				this.guong = guong;
				this.loSuoi = loSuoi;
				this.denSuongMu = denSuongMu;
			}
			
			
			public String getAmThanh6Loa() {
				return amThanh6Loa;
			}
			public void setAmThanh6Loa(String amThanh6Loa) {
				this.amThanh6Loa = amThanh6Loa;
			}
			
			@Override
			public void inThongSo(){
				System.out.println(vanhDuc + denPha + denSuongMu + canGatNuoc + xyLanh + tieuThuNhienLieu + nongDoKhiThai + dieuHoaNhietDo + guong + loSuoi + amThanh6Loa);
			}
				
}
