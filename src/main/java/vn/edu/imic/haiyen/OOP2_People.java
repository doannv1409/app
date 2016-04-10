package vn.edu.imic.haiyen;

public class OOP2_People {
	private int id;
	private String hoten;
	private int sochan;
	private int sotay;
	private String mautoc;
	private String ngonngu;
	private String gioitinh;
	
	public OOP2_People() {
		
	}

	public OOP2_People(int id, String hoten, int sochan, int sotay, String mautoc, String ngonngu, String gioitinh) {
		
		this.id = id;
		this.hoten = hoten;
		this.sochan = sochan;
		this.sotay = sotay;
		this.mautoc = mautoc;
		this.ngonngu = ngonngu;
		this.gioitinh = gioitinh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getSochan() {
		return sochan;
	}

	public void setSochan(int sochan) {
		this.sochan = sochan;
	}

	public int getSotay() {
		return sotay;
	}

	public void setSotay(int sotay) {
		this.sotay = sotay;
	}

	public String getMautoc() {
		return mautoc;
	}

	public void setMautoc(String mautoc) {
		this.mautoc = mautoc;
	}

	public String getNgonngu() {
		return ngonngu;
	}

	public void setNgonngu(String ngonngu) {
		this.ngonngu = ngonngu;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	

}
