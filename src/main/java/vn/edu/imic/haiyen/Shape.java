package vn.edu.imic.haiyen;

public abstract class Shape {
	protected int x;
	protected int y;
	public abstract void draw();
	
	protected void erase(){
		System.out.println(String.format("xoa diem x = %s, y= %s", x, y));
	}

}
