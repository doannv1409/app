package vn.edu.imic.haiyen;

public abstract class HDT_Triangle {
	protected double side1;
	protected double side2;
	protected double side3;

	public HDT_Triangle() {
		// TODO Auto-generated constructor stub
	}

	public HDT_Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public abstract void Area();
	
	public abstract void Perimeter();
	
	public abstract String toString();
	
}
