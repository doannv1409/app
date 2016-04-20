package vn.edu.imic.quangminh.oop.abstracts;

public class Rectangle extends Shape {

	public Rectangle(int a, int b) {
		this.x = a;
		this.y = b;
	}

	@Override
	public void computeArea() {
		System.out.println("Dien tich hinh chu nhat: ");
		System.out.println(x*y);
	}

}
