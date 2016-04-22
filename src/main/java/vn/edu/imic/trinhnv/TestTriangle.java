package vn.edu.imic.trinhnv;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3.5, 4.5, 5.5);
		System.out.println(triangle.toString()); 
		triangle.Area();
		triangle.Perimeter();
	}
}
