package vn.edu.imic.hoangnd.excercise;

public class Rectangle {
	protected double width = 1;
	protected double height = 1;
	protected String color = "white";

	public void Rectangle() {

	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static double Area(Rectangle rectangle) {
		return rectangle.width * rectangle.height;
	}

	public static double Perimeter(Rectangle rectangle) {
		return (rectangle.width + rectangle.height) * 2;
	}  

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3, 40);
		rectangle1.setColor("red");
		rectangle2.setColor("red");
		System.out.println("Rectangle1: " + rectangle1.toString());
		System.out.println("Area: " + Area(rectangle1));
		System.out.println("Perimeter: " + Perimeter(rectangle1));
		System.out.println("\nRectangle2: " + rectangle2.toString());
		System.out.println("Area: " + Area(rectangle2));
		System.out.println("Perimeter: " + Perimeter(rectangle2));
	}

	@Override
	public String toString() {
		return "[width=" + width + ", height=" + height + ", color=" + color + "]";
	}
}
