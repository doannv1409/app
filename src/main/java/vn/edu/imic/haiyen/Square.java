package vn.edu.imic.haiyen;

public class Square extends Shape {
	public Square(int a) {
		this.x = a;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("dien tich hinh vuong");
		System.out.println(Math.pow(x, 2));
		// TODO Auto-generated method stub

	}

}
