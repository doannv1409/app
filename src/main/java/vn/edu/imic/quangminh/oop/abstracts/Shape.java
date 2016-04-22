package vn.edu.imic.quangminh.oop.abstracts;

public abstract class Shape {
	protected int x;
	protected int y;
	
	public abstract void computeArea();
	
	protected void erase() {
		System.out.println(
				String.format("Xoa hinh x = %s, y = %s", 
						x, y));
	}
}
