package vn.edu.imic.hoangnd;

public class CircleTest {
	public static void main(String[] args) {
		Circle objC01 = new Circle(30.5);
		Circle objC02 = new Circle(40);
		Circle objC03 = new Circle(120.5);
		Circle objC04 = new Circle(88.5);

		System.out.println("-----------------Lan thuc hien 1 -----------------");
		System.out.println("Doi tuong objC01: Voi ban kinh = " + objC01.dRadius + ". Dien tich = " + Area(objC01));
		System.out.println("Doi tuong objC02: Voi ban kinh = " + objC02.dRadius + ". Dien tich = " + Area(objC02));
		System.out.println("Doi tuong objC03: Voi ban kinh = " + objC03.dRadius + ". Dien tich = " + Area(objC03));
		System.out.println("Doi tuong objC04: Voi ban kinh = " + objC04.dRadius + ". Dien tich = " + Area(objC04));

		objC02.setDRadius(25.5);
		objC03.setDRadius(60);

		System.out.println("\n-----------------Lan thuc hien 2 -----------------");
		System.out.println("Doi tuong objC01: Voi ban kinh = " + objC01.dRadius + ". Dien tich = " + Area(objC01));
		System.out.println("Doi tuong objC02: Voi ban kinh = " + objC02.dRadius + ". Dien tich = " + Area(objC02));
		System.out.println("Doi tuong objC03: Voi ban kinh = " + objC03.dRadius + ". Dien tich = " + Area(objC03));
		System.out.println("Doi tuong objC04: Voi ban kinh = " + objC04.dRadius + ". Dien tich = " + Area(objC04));
	}

	public static double Area(Circle circle) {
		double result = circle.getDRadius() * circle.getDRadius() * Math.PI;
		return result;
	}
}
