package vn.edu.imic.quangminh.generic;

public class GeometryControllerImpl implements GeometryController {

	@Override
	public double computeArea(Object obj) {
		
		if(obj instanceof Triangle) {
			Triangle triangle = (Triangle) obj;
			double p = (triangle.getA() + triangle.getB() + 
						triangle.getC()) /2;
			double area = Math.sqrt(p * (p - triangle.getA()) * 
									(p - triangle.getB()) * 
									(p - triangle.getC()));
			return area;
		} else if (obj instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) obj;
			return rectangle.getA() * rectangle.getB();
		}
		
		throw new RuntimeException("Invalid Geometry");
	}

}
