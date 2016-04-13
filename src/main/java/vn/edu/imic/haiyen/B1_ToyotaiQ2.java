package vn.edu.imic.haiyen;

public class B1_ToyotaiQ2 extends B1_ToyotaiQ {
	protected String thongso2;

	public B1_ToyotaiQ2() {
		// TODO Auto-generated constructor stub
	}

	public B1_ToyotaiQ2(String thongso2) {
		super();
		this.thongso2 = thongso2;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("2-Phu kien di rieng cho dong xe nay:\n + Guong dieu khien dien va co suoi \n + Den suong mu \n + He thong khoa thong minh");
	}

}
