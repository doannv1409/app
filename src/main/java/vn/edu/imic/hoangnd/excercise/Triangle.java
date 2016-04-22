package vn.edu.imic.hoangnd.excercise;

public class Triangle {
	protected double side1 = 1;
	protected double side2 = 1;
	protected double side3 = 1;

	public Triangle() {

	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public static double Area(double p, Triangle triangle) {
		double area = Math.sqrt(p * (p - triangle.side1) * (p - triangle.side2) * (p - triangle.side3));
		return area;
	}

	public static double Perimeter(Triangle triangle) {
		double perimeter = triangle.side1 + triangle.side2 + triangle.side3;
		return perimeter;
	} 

	@Override
	public String toString() {
		return "Triangle [side1= " + side1 + ", side2= " + side2 + ", side3= " + side3 + "]";
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);
		System.out.println(triangle.toString());
		double p = (triangle.side1 + triangle.side2 + triangle.side3);
		System.out.println("Area: " + Area(p, triangle));
		System.out.println("Perimeter: " + Perimeter(triangle));
	}
}
