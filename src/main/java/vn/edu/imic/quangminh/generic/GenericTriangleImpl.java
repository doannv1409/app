package vn.edu.imic.quangminh.generic;

public class GenericTriangleImpl implements GenericGeometry<Triangle>{

	@Override
	public double computeArea(Triangle triangle) {
		double p = (triangle.getA() + triangle.getB() + 
				triangle.getC()) /2;
		double area = Math.sqrt(p * (p - triangle.getA()) * 
							(p - triangle.getB()) * 
							(p - triangle.getC()));
		return area;
	}

}
