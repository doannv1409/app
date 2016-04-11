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
}
