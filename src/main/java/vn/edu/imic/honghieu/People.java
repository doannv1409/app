package vn.edu.imic.honghieu;

public class People {
	private String id;
	private String FullName;
	private int Tay;
	private int Chan;
	private String HairColor;
	private String Language;
	private String GioiTinh;
	People(String id,String name,int tay,int chan,String haircolor, String language,String gioitinh){
		this.id = id;
		this.FullName = name;
		this.Tay = tay;
		this.Chan = chan;
		this.HairColor = haircolor;
		this.Language = language;
		this.GioiTinh = gioitinh;
	}
	public void setid(String id){
		this.id = id; 
	}
	public void setFullName(String name){
		this.FullName = name;
	}
	public void setTay(int tay){
		this.Tay = tay;
	}
	public void setChan(int chan){
		this.Chan = chan;
	}
	public void setHairColor(String haircolor){
		this.HairColor = haircolor;
	}
	public void setLanguage(String language){
		this.Language = language;
	}
	public void setGioiTinh(String gioitinh){
		this.GioiTinh = gioitinh;
	}
	
	public String getid(){
		return this.id;
	}
	public String getname(){
		return this.FullName;
	}
	public int gettay(){
		return this.Tay;
	}
	public int getchan(){
		return this.Chan;
	}
	public String gethaircolor(){
		return this.HairColor;
	}
	public String getlanguage(){
		return this.Language;
	}
	public String getgioitinh(){
		return this.GioiTinh;
	}
	public static void main (String[] args){
		People sv1 = new People("1", "NguyenVanMinh", 2, 2,"Den", "VNI", "Nam");
		print(sv1);
		People sv2 = new People("2","PhamHongNhung",2,2,"Nau","VNI","Nu");
		print(sv2);
		People sv3 = new People("3","HoangMinhHieu",2,2,"Vang","VNI","Nam");
		print(sv3);
		People sv4 = new People("4","J.Brave",2,2,"Do","ENG","Nam");
		print(sv4);
	}

	private static void print(People People) {
		System.out.println(People.getid());
		System.out.println(People.getname());
		System.out.println(People.gettay());
		System.out.println(People.getchan());
		System.out.println(People.gethaircolor());
		System.out.println(People.getlanguage());
		System.out.println(People.getgioitinh());
	}
}
