package vn.edu.imic.tung;

public class L5_ToyotaiQ1 extends L5_ToyotaiQ {
	private String amThanh6loa;
	private String guong;
	private String suongmu;
	
	public L5_ToyotaiQ1(String guong,String amThanh6loa, String loSuoi)
	{
		super();
	}
	
	public String getAmThanh6loa() {
		return amThanh6loa;
	}
	public void setAmThanh6loa(String amThanh6loa) {
		this.amThanh6loa = amThanh6loa;
	}
	public String getGuong() {
		return guong;
	}
	public void setGuong(String guong) {
		this.guong = guong;
	}
	public String getSuongmu() {
		return suongmu;
	}
	public void setSuongmu(String suongmu) {
		this.suongmu = suongmu;
	}

	@Override
	public String toString() {
		return "am thanh 6 loa " + amThanh6loa +"/n "+"+ guong" + guong +"/n "+"+ suong mu" + suongmu + "/n";
	}


	
	
}
