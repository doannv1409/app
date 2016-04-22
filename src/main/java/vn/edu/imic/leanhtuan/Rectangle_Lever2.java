package vn.edu.imic.leanhtuan;

import sun.org.mozilla.javascript.internal.ast.WithStatement;

public class Rectangle_Lever2 {
	
	protected double width = 1.0;
	protected double height = 1.0;
	protected String color = "white";
	
	public Rectangle_Lever2(){
		
	}
	
	public Rectangle_Lever2(double height, double width){
		this.height = height;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double Area(){
		double Area = height * width;
		return Area;
	}
	
	public double Perimeter(){
		double Perimeter = (height + width) * 2;
		return Perimeter;
	}
	
	public void display(){
		System.out.println("Area : " + Area() + ", Perimeter : " + Perimeter());
	}
	
	public static void main(String [] args){
		Rectangle_Lever2 hcn1 = new Rectangle_Lever2();
		Rectangle_Lever2 hcn2 = new Rectangle_Lever2();
		
		hcn1.height = 40;
		hcn1.width = 4;
		hcn2.height = 35.9;
		hcn2.width = 3.5;
		
		hcn1.display();
		hcn2.display();
		
	}
}
