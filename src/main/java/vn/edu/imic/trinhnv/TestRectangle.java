package vn.edu.imic.trinhnv;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4, 40);
		System.out.println(rectangle.toString());
		rectangle.Area();
		rectangle.Perimeter();
		
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println(rectangle2.toString());
		rectangle2.Area();
		rectangle2.Perimeter();
	}
}
