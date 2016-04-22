package vn.edu.imic.hongtran;

public class ToyotaiQ2 extends ToyotaiQ {
	public ToyotaiQ2(String vanhduchopkim, String denphacambienanhsang, String cangatnuoccambien, String Xylanh,
			String tieuthunhienlieu, String nongdokhithai, String dieuhoanhietdo) {
		super(vanhduchopkim, denphacambienanhsang, cangatnuoccambien, Xylanh, tieuthunhienlieu, nongdokhithai, dieuhoanhietdo);
		// TODO Auto-generated constructor stub
	}
	protected String guongdkiendienvacosuoi;
	protected String densuongmu;
	protected String hethongchiakhoathongminh;
	public String getGuongdkiendienvacosuoi() {
		return guongdkiendienvacosuoi;
	}
	public void setGuongdkiendienvacosuoi(String guongdkiendienvacosuoi) {
		this.guongdkiendienvacosuoi = guongdkiendienvacosuoi;
	}
	public String getDensuongmu() {
		return densuongmu;
	}
	public void setDensuongmu(String densuongmu) {
		this.densuongmu = densuongmu;
	}
	public String getHethongchiakhoathongminh() {
		return hethongchiakhoathongminh;
	}
	public void setHethongchiakhoathongminh(String hethongchiakhoathongminh) {
		this.hethongchiakhoathongminh = hethongchiakhoathongminh;
	}
	
}
