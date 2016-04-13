package vn.edu.imic.haiyen;

public class B1_ToyotaiQ1 extends B1_ToyotaiQ{
	protected String thongso1;
	
	public B1_ToyotaiQ1() {
		// TODO Auto-generated constructor stub
	}

	public B1_ToyotaiQ1(String thongso1){
		super();
		this.thongso1=thongso1;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("2-Phu kien di rieng cho dong xe nay:\n + Guong dieu khien dien va co suoi \n + Am thanh 6 loa \n + Den suong mu");
	}
	
	
	

}
