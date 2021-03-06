package vn.edu.imic.quangminh.oop.inheritance;

public class ToyotaQ1 extends ToyotaQ {
	private String guong;
	private String amThanh;
	private String denSuongMu;
	public ToyotaQ1(String guong, String amThanh, String denSuongMu, String vanh) {
		super();
		this.amThanh = amThanh;
		this.guong = guong;
		this.denSuongMu = denSuongMu;
		this.vanh = vanh;
	}
	
	@Override
	public String toString() {
		String thuocTinhChung = super.toString();
		StringBuilder info = new StringBuilder(thuocTinhChung);
		
		info.append("2. Phu kien di rieng cho dong xe nay: \n")
		.append("+ ").append(guong).append("\n")
		.append("+ ").append(amThanh).append("\n")
		.append("+ ").append(denSuongMu).append("\n");
		
		return info.toString();
	}
}
