package vn.edu.imic.quangminh.oop.abstracts;

public class Square extends Shape {
	public Square(int a) {
		this.x = a;
	}
	
	@Override
	public void computeArea() {
		System.out.println("Dien tich hinh vuong: ");
		System.out.println(Math.pow(x, 2));
	}
}
