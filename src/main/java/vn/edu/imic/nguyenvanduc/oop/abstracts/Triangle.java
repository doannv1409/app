package vn.edu.imic.nguyenvanduc.oop.abstracts;

public class Triangle {
	int side1 = 1;
	int side2 = 1;
	int side3 = 1;

	public void Triangle() {

	}

	public void Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double Area() {
		double p = (side1+ side2+side3)/2;
		double Area = (Math.sqrt(p*(p-side1)* (p-side2)*(p-side3)));
		return Area;
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}

	public double Perimeter() {
		return side1+side2+side3;
	}

}
