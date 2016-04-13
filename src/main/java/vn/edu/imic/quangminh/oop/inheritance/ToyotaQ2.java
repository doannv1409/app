package vn.edu.imic.quangminh.oop.inheritance;

public class ToyotaQ2 extends ToyotaQ {
	private String guong;
	private String amThanh;
	private String chiaKhoa;
	
	public ToyotaQ2(String guong, String amThanh, String chiaKhoa) {
		super();
		this.guong = guong;
		this.amThanh = amThanh;
		this.chiaKhoa = chiaKhoa;
	}
	
	@Override
	public String toString() {
		String thuocTinhChung = super.toString();
		StringBuilder info = new StringBuilder(thuocTinhChung);
		
		info.append("2. Phu kien di rieng cho dong xe nay: \n")
		.append("+ ").append(guong).append("\n")
		.append("+ ").append(amThanh).append("\n")
		.append("+ ").append(chiaKhoa).append("\n");
		
		return info.toString();
	}
}
