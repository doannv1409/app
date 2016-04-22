package vn.edu.imic.trinhnv;

public class Rectangle {
	private double width = 1.0;
	private double height = 1.0;
	private String color = "White";
	
	public Rectangle(){
		
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double Area(){
		double Area = width * height;
		System.out.println("Area of rectangle: " + Area);
		return Area ;
	}
	
	public double Perimeter(){
		double Peri = (width + height) * 2;
		System.out.println("Preimeter of rectangle: " + Peri);
		System.out.println("\n");
		return Peri;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("width = ").append(width)
		.append(" height = ").append(height);
		return str.toString();
	}
}
