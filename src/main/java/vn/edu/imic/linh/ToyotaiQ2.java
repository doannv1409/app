package vn.edu.imic.linh;

public class ToyotaiQ2 extends ToyotaiQ {
	private final String GUONG ="Gương điều khiển điện và có sưởi";
	private final String CHIA_KHOA = "Hệ thống chìa khóa thông minh";
	private final String DEN = "Đèn sương mù";
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("2 - Phu kien rieng cho dong xe iQ2:").append("\n")
		.append(GUONG).append("\n")
		.append(CHIA_KHOA).append("\n")
		.append(DEN).append("\n");
		return builder.toString();
	}
}
