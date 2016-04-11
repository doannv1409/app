package vn.edu.imic.honghieu;

public class Students {
	private String masv;
	private String hovaten;
	private String gmail;
	private String phone;
	Students(String ma,String ten,String gmail, String phone){
		this.masv = ma;
		this.hovaten = ten;
		this.gmail = gmail;
		this.phone = phone;
	}
	public void setma(String ma){
		this.masv = ma;
	}
	public void setten(String ten){
		this.hovaten = ten;
	}
	public void setgmail(String gmail){
		this.gmail = gmail;
	}
	public void setphone(String phone){
		this.phone = phone;
	}
	public String getma(){
		return this.masv;
	}
	public String getten(){
		return this.hovaten;
	}
	public String getgmail(){
		return this.gmail;
	}
	public String getphone(){
		return this.phone;
	}
}
