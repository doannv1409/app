package vn.edu.imic.tunglam;

public class Toyota_iQ {


	public void thongso() {
		System.out.println("+ Thong so chung cho cac dong xe: ");
		System.out.println("+ Vanh duc hop kim 15inch");
		System.out.println("+ Den pha cam bien anh sang");
		System.out.println("+ Can gat nuoc cam bien");
		System.out.println("+ Xy lanh VVT -I dung tich 1 lit/3 chiec");
		System.out.println("+ Tieu thu nhien lieu: 3.6lit/100km");
		System.out.println("+ Nong do khi thai 99g/km");
	}

	public class ToyotaiQ01 extends Toyota_iQ {
 

		public void thongso() {
			super.thongso();
			System.out.println("+ Phu kien di rieng cho dong xe nay: ");
			System.out.println("+ Guong dieu khien va co suoi");
			System.out.println("+ Am thanh 6 loa");
			System.out.println("+ Den suong mu");
		}
	}

	public void ToyotaiQ01() {

	}
	

	public class ToyotaiQ02 extends Toyota_iQ {

		public void thongso() {
			super.thongso();
			System.out.println("+ Phu kien di rieng cho dong xe nay: ");
			System.out.println("+ Guong dieu khien va co suoi");
			System.out.println("+ Den suong mu");
			System.out.println("+ He thong khoao thong minh");
		}
	}

	public void ToyotaiQ02() {
		// TODO Auto-generated method stub

	}

}
