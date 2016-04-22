package vn.edu.imic.hoangnd;

public class Toyota { 
	public String vanhDuc = "Vanh duc hop kim 15inch";
	public String denPha = "Den pha cam bien anh sang";
	public String canGat = "Can gat nuoc cam bien";
	public String xyLanh = "Xy lanh VVT-I dung tich 1lit/3";
	public String tieuThuNhienLieu = "Tieu thu nhien lieu: 3,6lit/100km";
	public String nongDoKhiThai = "Nong do khi thai: 99g/km";
	public String dieuHoa = "Dieu hoa nhiet do";
	
	public Toyota () {
		
	}
	
	public Toyota(String vanhDuc, String denPha, String canGat, String xyLanh, String tieuThuNhienLieu,
			String nongDoKhiThai, String dieuHoa) {
		this.vanhDuc = vanhDuc;
		this.denPha = denPha;
		this.canGat = canGat;
		this.xyLanh = xyLanh;
		this.tieuThuNhienLieu = tieuThuNhienLieu;
		this.nongDoKhiThai = nongDoKhiThai;
		this.dieuHoa = dieuHoa;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("1 - Thong so chung cho cac dong xe: ").append("\n")
		.append("+").append(vanhDuc).append("\n")
		.append("+").append(denPha).append("\n")
		.append("+").append(canGat).append("\n")
		.append("+").append(xyLanh).append("\n")
		.append("+").append(tieuThuNhienLieu).append("\n")
		.append("+").append(nongDoKhiThai).append("\n");
		return str.toString();
	}

}
