package vn.edu.imic.haiyen;

public class B1_ToyotaiQ1 extends B1_ToyotaiQ {
	protected String amThanh6Loa;

	public B1_ToyotaiQ1(String vanhDuc, String denPha, String denSuongMu, String canGatNuoc, String xyLanh,
			String tieuThuNhienLieu, String nongDoKhiThai, String dieuHoaNhietDo, String guong, String loSuoi) {
		super(vanhDuc, canGatNuoc, tieuThuNhienLieu, denPha, denSuongMu, xyLanh, nongDoKhiThai, dieuHoaNhietDo, guong,
				loSuoi);

	}

	public String getAmThanh6Loa() {
		return amThanh6Loa;
	}

	public void setAmThanh6Loa(String amThanh6Loa) {
		this.amThanh6Loa = amThanh6Loa;
	}

	@Override
	public void inThongSo() {
		super.inThongSo();
		System.out.println("+ Guong Co : " + guong);
		System.out.println("+ " + loSuoi);
		System.out.println("+ " + amThanh6Loa);
	}

}
