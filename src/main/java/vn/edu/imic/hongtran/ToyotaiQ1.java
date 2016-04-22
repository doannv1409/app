package vn.edu.imic.hongtran;

public class ToyotaiQ1 extends ToyotaiQ {
	protected String guongdkiendienvacosuoi;
	protected String amthanh6loa;
	protected String densuongmu;
	public String getGuongdkiendienvacosuoi() {
		return guongdkiendienvacosuoi;
	}
	public void setGuongdkiendienvacosuoi(String guongdkiendienvacosuoi) {
		this.guongdkiendienvacosuoi = guongdkiendienvacosuoi;
	}
	public String getAmthanh6loa() {
		return amthanh6loa;
	}
	public void setAmthanh6loa(String amthanh6loa) {
		this.amthanh6loa = amthanh6loa;
	}
	public String getDensuongmu() {
		return densuongmu;
	}
	public void setDensuongmu(String densuongmu) {
		this.densuongmu = densuongmu;
	}
	public ToyotaiQ1(String vanhduchopkim,
					 String denphacambienanhsang,
					 String cangatnuoccambien,
					 String Xylanh,String tieuthunhienlieu,
					 String nongdokhithai,String dieuhoanhietdo  ){
		super(  vanhduchopkim,denphacambienanhsang,
				cangatnuoccambien,Xylanh,
				tieuthunhienlieu,nongdokhithai,dieuhoanhietdo);
	}
	
		
	}

