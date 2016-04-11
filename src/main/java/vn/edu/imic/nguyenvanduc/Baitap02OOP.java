package vn.edu.imic.nguyenvanduc;

public class Baitap02OOP {
	public static void main(String[] args) {
		People people1 = new People("Nguyễn Văn Minh", 2, 2, "Đen", "VNI", "Nam");
		People people2 = new People("Phạm Hồng Nhung", 2, 2, "Nâu", "VNI", "Nữ");
		People people3 = new People("Hoàng Minh Hiếu", 2, 2, "Vàng", "VNI", "Nam");
		People people4 = new People("J.Brave", 2, 2, "Đỏ", "VNI", "Nam");
		people1.setTen("Nguyễn Văn Mạnh");
		people1.setToc("Đỏ");
		people1.setNgonNgu("VNI, ENG");
		people2.setTen("Phạm Thị Hồng Nhung");
		people2.setToc("Tím");
		people2.setNgonNgu("VNI, ENG");
		people3.setToc("Xanh");
		people3.setNgonNgu("VNI, ENG, KOREA");
		people4.setToc("Vàng");
		people4.setNgonNgu("ENG, VNI");
		System.out.println("----------------1----------------");
		print(people1);
		System.out.println("----------------2----------------");
		print(people2);
		System.out.println("----------------3----------------");
		print(people3);
		System.out.println("----------------4----------------");
		print(people4);
	}

	private static void print(People people) {

		System.out.println("+ Họ và Tên: "+people.getTen());
		System.out.println("+ Số chân: "+people.getChan()+" - Số tay: "+people.getTay()+" - Màu tóc: "+people.getToc());
		System.out.println("+ Ngôn ngữ: "+people.getNgonNgu());
		System.out.println("+ Giới tính: "+people.getGioiTinh());
	
	}
}

class People {
	private String Ten;
	private int Chan;
	private int Tay;
	private String Toc;
	private String NgonNgu;
	private String GioiTinh;

	public People(String Ten, Integer Chan, Integer Tay, String Toc, String NgonNgu, String GioiTinh) {
		this.Ten = Ten;
		this.Chan = Chan;
		this.Tay = Tay;
		this.Toc = Toc;
		this.NgonNgu = NgonNgu;
		this.GioiTinh = GioiTinh;
	}

	public String getTen() {
		return Ten;
	}

	public int getChan() {
		return Chan;
	}

	public int getTay() {
		return Tay;
	}

	public String getToc() {
		return Toc;
	}

	public String getNgonNgu() {
		return NgonNgu;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setTen(String Ten) {
		this.Ten = Ten;
	}

	public void setChan(Integer Chan) {
		this.Chan = Chan;
	}

	public void setChan(int chan) {
		Chan = chan;
	}

	public void setTay(int tay) {
		Tay = tay;
	}

	public void setToc(String toc) {
		Toc = toc;
	}

	public void setNgonNgu(String ngonNgu) {
		NgonNgu = ngonNgu;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}

}
