package vn.edu.imic.haiyen;

public class B1_ToyotaiQ2 extends B1_ToyotaiQ {
	protected String chiaKhoa;

	public B1_ToyotaiQ2(String vanhDuc, String denPha, String denSuongMu, String canGatNuoc, String xyLanh,
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
		System.out.println("+ Guong Co : " + guong);
		System.out.println("+ " + loSuoi);
		System.out.println("+ He Thong " + chiaKhoa);

	}

}
