package vn.edu.imic.quocthinh;
import java.util.Scanner;
public class Toyota {
	public String vanh;
	public String den;
	public String can;
	public String xylanh;
	public String tieuthu;
	public String khithai;
	public String dieuhoa;

	Toyota(String vanh, String den, String can, String xylanh, String tieuthu, String khithai, String dieuhoa) {
		this.vanh = vanh;
		this.den = den;
		this.can = can;
		this.xylanh = xylanh;
		this.tieuthu = tieuthu;
		this.khithai = khithai;
		this.dieuhoa = dieuhoa;
	}

	public void Thongso() {
		System.out.println(vanh + den + can + xylanh + tieuthu + khithai + dieuhoa);
	}

	
	public static void main (String agrs[]){
		System.out.println("nhap loai xe muon chon: 1/ Toyota iQ1  **** 2/ Toyota iQ2 ");
		Scanner sc = new Scanner(System.in);
		int loai = sc.nextInt();
		
		switch(loai)
		{
		case(1):
			Toyotaiq1 iq1 = new Toyotaiq1("15inch","\nden pha cam bien anh sanh" ," \ncan gat nuoc cam bien",
					"\nxy lanh dung tich 1l/3chiec", "\ntieu thu 3.6l/100km", "\nnong do khi thai99g/km", "\ndieu hoa nhiet do");
		iq1.loa = "\nam thanh 6 loa";
		iq1.Thongso();
		break;
		
		case(2):
			Toyotaiq2 iq2 = new Toyotaiq2("15inch","\nden pha cam bien anh sanh" ," \ncan gat nuoc cam bien",
					"\nxy lanh dung tich 1l/3chiec", "\ntieu thu 3.6l/100km", "\nnong do khi thai99g/km", "\ndieu hoa nhiet do");
		iq2.chiakhoa = " chia khoa thong minh";
		iq2.Thongso();
		break;
		}
		sc.close();
	}
}

