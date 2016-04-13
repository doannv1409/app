package vn.edu.imic.quocthinh;

public class Toyotaiq1 extends Toyota{
	public String loa;
	public Toyotaiq1(String vanh,String den,String can,String xylanh,String tieuthu,String khithai,String dieuhoa){
		super(vanh, den, can, xylanh, tieuthu, khithai, dieuhoa);
	}
	public void Thongso(){
		System.out.println(vanh + den + can + xylanh + tieuthu+ tieuthu+ khithai+ dieuhoa+ loa);
		
	}
	

}
