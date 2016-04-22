package vn.edu.imic.leanhtuan;


public class Triangle_Lever2 {

	protected double side1 = 1.0;
	protected double side2 = 1.0;
	protected double side3 = 1.0;
	
	public Triangle_Lever2(){

	}
	
	public Triangle_Lever2(double side1, double side2, double side3){
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
	
	public double Area(){
		double p = (side1 + side2 + side3)/2;
		double Area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return Area;
		
	}
	
	public double Perimeter(){
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
		
	}
	
	public void display(){
		System.out.println("Area = " + Area() + ", Perimeter = " + Perimeter());
	}
	
	public String toString(){
		return "Triangle: Side1 = " + side1 +"Side2 = " + side2 + "Side3 = " +side3;
		
	}

	public static void main(String [] args){
		Triangle_Lever2 tamgiac = new Triangle_Lever2();
		tamgiac.side1 = 20;
		tamgiac.side2 = 20;
		tamgiac.side3 = 30;

		
		tamgiac.display();
		tamgiac.toString();
	}
}
