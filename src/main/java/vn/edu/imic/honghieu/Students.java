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
		public static void main (String[] args){
			Students sv1 = new Students("sv01","  HoangVanThanh","  thanh@gmail.com","  0988123456");
			print(sv1);
			Students sv2 = new Students("sv02","  PhamThiThuyLinh","  linh@gmail.com","  0988123457");
			print(sv2);
			Students sv3 = new Students("sv03","  TranVanHieu","  hieu@gmail.com","  0988123458");
			print(sv3);
			Students sv4 = new Students("sv04","  NguyenVanHung","  hung@gmail.com","  0988123459");
			print(sv4);
		}

		private static void print(Students students) {
			System.out.println(students.getma()+students.getten()+students.getgmail()+students.getphone());
		}

}


