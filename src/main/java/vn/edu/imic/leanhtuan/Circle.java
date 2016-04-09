package vn.edu.imic.leanhtuan;

public class Circle {

	private String name;
	private double dRadius = 1.0;

	public Circle(String name, double dRadius) {
		this.name = name;
		this.dRadius = dRadius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDRadius(double dRadius) {
		this.dRadius = dRadius;
	}

	public double getDRadius() {
		return this.dRadius;
	}

	public static void main(String[] args) {

		Circle circle1 = new Circle("objC01", 30.5);
		Circle circle2 = new Circle("objC02", 40);
		Circle circle3 = new Circle("objC03", 120.5);
		Circle circle4 = new Circle("objC04", 88.5);

		System.out.println("----------------" + "Lan Thuc Hien Thu 1" + "-----------------");
		Area(circle1);
		System.out.println("----------------" + "Lan Thuc Hien Thu 2" + "-----------------");
		Area(circle2);
		System.out.println("----------------" + "Lan Thuc Hien Thu 3" + "-----------------");
		Area(circle3);
		System.out.println("----------------" + "Lan Thuc Hien Thu 4" + "-----------------");
		Area(circle4);

		System.out.println("--------Sau Khi Thay Doi Ban Kinh-------");
		
		circle1.setDRadius(30.5);
		circle2.setDRadius(25.5);
		circle3.setDRadius(60);

		System.out.println("----------------" + "Lan Thuc Hien Thu 1" + "-----------------");
		Area(circle1);
		System.out.println("----------------" + "Lan Thuc Hien Thu 2" + "-----------------");
		Area(circle2);
		System.out.println("----------------" + "Lan Thuc Hien Thu 3" + "-----------------");
		Area(circle3);

	}

	public static double Area(Circle circle) {
		double result = circle.getDRadius() * circle.getDRadius() * Math.PI;
		System.out.println("Ket Qua La :" + result);
		return result;
	}

}
