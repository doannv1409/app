package vn.edu.imic.haiyen;

public class Rectangle extends Shape{
	
 public Rectangle(int a, int b) {
	 this.x=a;
	 this.y=b;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("dien tich hcn:");
		System.out.println(x*y);
		// TODO Auto-generated method stub
		
	}

}
