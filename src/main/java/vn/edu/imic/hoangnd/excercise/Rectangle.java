package vn.edu.imic.hoangnd.excercise;

public class Rectangle {
	protected double width = 1;
	protected double height = 1;
	protected String color = "white";

	public Rectangle() {

	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}  

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3, 40);
		rectangle1.setColor("red");
		rectangle2.setColor("red");
		System.out.println("Rectangle1: " + rectangle1.toString());
		System.out.println("Area: " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());
		System.out.println("\nRectangle2: " + rectangle2.toString());
		System.out.println("Area: " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter());
	}

	@Override
	public String toString() {
		return "[width=" + width + ", height=" + height + ", color=" + color + "]";
	}
}
