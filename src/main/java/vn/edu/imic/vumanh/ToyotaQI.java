package vn.edu.imic.vumanh;

public class ToyotaQI {
	private static final String LOAI_DIEU_HOA_MAC_DINH = "Dieu hoa nhiet do";
	private static final String NONG_DO_KHI_THAI = "99g/km";
	private static final String MUC_TIEU_THU_MAC_DINH = "3,6lit/100km";
	private static final String XY_LANH = "Xy lanh VVT-I dung tich 1lit/3 chiec";
	private static final String CAN_GAT = "Can gat nuoc cam bien";
	private static final String DEN = "Den pha anh sang";
	private static final String VANH = "Vanh duc hop kim 15inch";
	
	protected String vanh;
	protected String den;
	protected String canGatNuoc;
	protected String xyLanh;
	protected String mucTieuThuNhienLieu;
	protected String nongDoKhiThai;
	protected String loaiDieuHoa;
	
	public ToyotaQI() {
		this.vanh = VANH;
		this.den = DEN;
		this.canGatNuoc = CAN_GAT;
		this.xyLanh = XY_LANH;
		this.mucTieuThuNhienLieu = MUC_TIEU_THU_MAC_DINH;
		this.nongDoKhiThai = NONG_DO_KHI_THAI;
		this.loaiDieuHoa = LOAI_DIEU_HOA_MAC_DINH;	
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("1. Thong so chung cho cac dong xe: \n");
		info.append("+ ").append(vanh).append("\n")
		.append("+ ").append(den).append("\n")
		.append("+ ").append(canGatNuoc).append("\n")
		.append("+ ").append(xyLanh).append("\n")
		.append("+ Tieu thu nhien lieu: ").append(mucTieuThuNhienLieu).append("\n")
		.append("+ Nong do khi thai: ").append(nongDoKhiThai).append("\n");
		return info.toString();
	}
	
}
