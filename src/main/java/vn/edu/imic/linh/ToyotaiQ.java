package vn.edu.imic.linh;

public class ToyotaiQ {
	protected final String VANH_DUC = "Vành đúc hợp kim 15inch";
	protected final String DEN_PHA = "Đèn pha cảm biến anh sáng";
	protected final String CAN_GAT = "Cần gạt nước cảm biến";
	protected final String XI_LANH = "Xy lanh VVT-I dung tích 1lit/3 chiếc";
	protected final String TIEU_THU = "Tiêu thụ nhiên liệu : 3,6lit/100km";
	protected final String NONG_DO = "Nồng độ khí thải : 99g/km";
	protected final String DIEU_HOA = "Điều hòa nhiệt độ";
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Thong so dong xe iQ:").append("\n")
		.append(VANH_DUC).append("\n")
		.append(DEN_PHA).append("\n")
		.append(CAN_GAT).append("\n")
		.append(XI_LANH).append("\n")
		.append(TIEU_THU).append("\n")
		.append(NONG_DO).append("\n")
		.append(DIEU_HOA ).append("\n");
		return builder.toString();
	}
}
