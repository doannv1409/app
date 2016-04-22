package vn.edu.imic.trinhnv;

public class Triangle {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
		
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double Area(){
		double p = (side1 + side2 + side3)/2;
		double Area = Math.sqrt(p * (p - side1)* (p - side2) * (p - side3));
		System.out.println("Area of this triangle:  " + Area);
		return Area;
	}
	
	public double Perimeter(){
		double Peri = side1 + side2 + side3;
		System.out.println("Perimeter of this triangle: " + Peri);
		return Peri;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("side1 = ").append(side1)
		.append(" side2 = ").append(side2)
		.append(" side3 = ").append(side3);
		
		return str.toString();		
	}
}
