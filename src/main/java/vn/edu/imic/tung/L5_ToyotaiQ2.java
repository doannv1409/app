package vn.edu.imic.tung;

public class L5_ToyotaiQ2 extends L5_ToyotaiQ {
	private String amThanh6loa;
	private String suongmu;
	private String khoa;
	public L5_ToyotaiQ2(String amThanh6loa,String suongmu,String khoa){
		super();
	}
	public String getAmThanh6loa() {
		return amThanh6loa;
	}
	public void setAmThanh6loa(String amThanh6loa) {
		this.amThanh6loa = amThanh6loa;
	}
	public String getSuongmu() {
		return suongmu;
	}
	public void setSuongmu(String suongmu) {
		this.suongmu = suongmu;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	@Override
	public String toString() {
		return "+ am thanh 6 loa" + amThanh6loa + "/n"+"+ suong mu" + suongmu +"/n"+ "+ khoa" + khoa + "/n";
	};
	

}
