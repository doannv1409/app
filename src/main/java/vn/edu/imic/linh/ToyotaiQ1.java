package vn.edu.imic.linh;

public class ToyotaiQ1 extends ToyotaiQ {
	private final String GUONG ="Gương điều khiển điện và có sưởi";
	private final String AM_THANH = "Âm thanh 6 loa";
	private final String DEN = "Đèn sương mù";
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("1 - Phu kien rieng cho dong xe iQ1:").append("\n")
		.append(VANH_DUC).append("\n")
		.append(GUONG).append("\n")
		.append(AM_THANH).append("\n")
		.append(DEN).append("\n");
		return builder.toString();
	}

}
