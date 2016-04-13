package vn.edu.imic.quocthinh;

public class People {
public int id;
public String hoten;
public int sochan;
public int sotay;
public String toc;
public String ngonngu;
public String gioitinh;

	People(int id, String hoten, int sochan, int sotay, String toc, String ngonngu, String gioitinh ){
		this.id= id;
		this.hoten= hoten;
		this.sochan= sochan;
		this.sotay= sotay;
		this.toc = toc;
		this.ngonngu = ngonngu;
		this.gioitinh = gioitinh;
	}
	
	public static void print(People nguoi){
		System.out.println(nguoi.hoten);
		System.out.println("sochan"+nguoi.sochan +"-"+"sotay"+nguoi.sotay +"mautoc:"+nguoi.toc);
		System.out.println(nguoi.ngonngu);
		System.out.println(nguoi.gioitinh);
		
	}
	public static void main (String agrs[]){
		People p1 = new People(1,"nguyen van a",2,2,"do","VNI","nam");
		print(p1);
	}
}
