package vn.edu.imic.quangminh.generic;

public class GenericRectangleImpl implements GenericGeometry<Rectangle>{

	@Override
	public double computeArea(Rectangle rectangle) {
		return rectangle.getA() * rectangle.getB();
	}

	//Generic method
	public <T> void print(T t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		GenericRectangleImpl geRectangleImpl = new GenericRectangleImpl();
		
		geRectangleImpl.<String>print("Nguyen Van A");
		geRectangleImpl.print("Nguyen Van A");
	}
}
