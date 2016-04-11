package vn.edu.imic.nguyenvanduc;

public class Baitap03OOP {
	public static void main(String[] args) {
		Circle cbjC01 = new Circle(30.5);
		Circle cbjC02 = new Circle(40);
		Circle cbjC03 = new Circle(120.5);
		Circle cbjC04 = new Circle(88.5);
		System.out.print("-------------------- Láº§n thá»±c hiá»‡n 1 ------------------------");
		System.out.print("# Ä�á»‘i tÆ°á»£ng 1 cĂ³ tĂªn : objC01, khá»Ÿi táº¡o vá»›i bĂ¡n kĂ­nh = ");
		print(cbjC01);
		System.out.print("-------------------- Láº§n thá»±c hiá»‡n 2 ------------------------");
		System.out.println("# Ä�á»‘i tÆ°á»£ng 2 cĂ³ tĂªn : objC02, khá»Ÿi táº¡o vá»›i bĂ¡n kĂ­nh = ");
		print(cbjC02);
		System.out.print("-------------------- Láº§n thá»±c hiá»‡n 3 ------------------------");
		System.out.println("# Ä�á»‘i tÆ°á»£ng 3 cĂ³ tĂªn : objC03, khá»Ÿi táº¡o vá»›i bĂ¡n kĂ­nh = ");
		print(cbjC03);
		System.out.print("-------------------- Láº§n thá»±c hiá»‡n 4 ------------------------");
		System.out.println("# Ä�á»‘i tÆ°á»£ng 4 cĂ³ tĂªn : objC04, khá»Ÿi táº¡o vá»›i bĂ¡n kĂ­nh = ");
		print(cbjC04);
	}

	private static void print(Circle circle) {
		System.out.println(circle.getdRadius());
	}

}

class Circle {
	// Datafield
	double dRadius;
	
	// Method khá»Ÿi dá»±ng khĂ´ng tham sá»‘ Ä‘áº§u vĂ o
	public Circle() {
		
	}
	
	// Method khá»Ÿi dá»±ng tham sá»‘ Ä‘áº§u vĂ o
	public Circle(double dRadius) {
		this.dRadius = dRadius;
		
	}
	
	public double getdRadius() {
		return dRadius;
	}
	
	public void setdRadius(double dRadius) {
		this.dRadius = dRadius;
	}
	
	// Method tĂ­nh diá»‡n tĂ­ch
	public double Area() {
		return dRadius * dRadius * Math.PI;
	}
	
}
