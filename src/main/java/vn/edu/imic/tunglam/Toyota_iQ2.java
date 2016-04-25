package vn.edu.imic.tunglam;

public class Toyota_iQ2 extends Toyota_iQ {
	protected String chiaKhoa;

	public Toyota_iQ2(String vanhDuc, String denPha, String denSuongMu, String canGatNuoc, String xyLanh,
			String tieuThuNhienLieu, String nongDoKhiThai, String dieuHoaNhietDo, String guong, String loSuoi) {
		super(vanhDuc, denPha, denSuongMu, canGatNuoc, xyLanh, tieuThuNhienLieu, nongDoKhiThai, dieuHoaNhietDo, guong,
				loSuoi);

	}

	public String getChiaKhoa() {
		return chiaKhoa;
	}

	public void setChiaKhoa(String chiaKhoa) {
		this.chiaKhoa = chiaKhoa;
	}

	@Override
	public void inThongSo() {
		super.inThongSo();
		System.out.println(chiaKhoa);
	}

}
