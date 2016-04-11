package vn.edu.imic.hoangnd;

public class Circle {
	double dRadius = 1.0;
	
	public Circle(){
		
	}
	public Circle(double NewdRadius) {
		dRadius = NewdRadius;
	}

	public double Area() {
		return dRadius * dRadius * Math.PI;
	}
	public void setDRadius(double dRadius) {
		this.dRadius = dRadius;
	}

	public double getDRadius() {
		return this.dRadius;
	}
	
	
}
