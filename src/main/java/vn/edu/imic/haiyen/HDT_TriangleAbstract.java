package vn.edu.imic.haiyen;

public class HDT_TriangleAbstract extends HDT_Triangle {

	@Override
	public void Area() {
		double p = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		System.out.println("p la: " + p);
		System.out.println("dien tich tam giac la: " + area);
	}

	@Override
	public void Perimeter() {
		double peri = side1 + side2 + side3;
		System.out.println("chu vi tam giac la: " + peri);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "side1: " + side1 + "side2: " + side2 + "side3: " + side3;
	}

}