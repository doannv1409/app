package vn.edu.imic.tung;

public class Oop1_Student {
	private String Msv;
	private String Name;
	private String Mail;
	private String Phone;
	// ham tao
	public Oop1_Student(){};
	public Oop1_Student( String Msv, String Name, String Mail, String Phone){
		this.Msv = Msv;
		this.Name = Name;
		this.Mail= Mail;
		this.Phone = Phone;
		
	};
	// gan gt+lay gt cua thuoc tinh
	public void setMsv( String Msv){
		this.Msv = Msv;
		
	};
	public String getMsv(){
		return this.Msv;
		
	};
	public void setName( String Name){
		this.Name = Name;
		
	};
	public String getName(){
		return this.Name;
		
	};
	public void setMail( String Mail){
		this.Mail = Mail;
		
	};
	public String getMail(){
		return this.Mail;
		
	};
	public void setPhone( String Phone){
		this.Phone = Phone;
		
	};
	public String getPhone(){
		return this.Phone;
		
	};
	

}
