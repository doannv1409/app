package vn.edu.imic.nguyenvanduc;

public class Baitap03OOP {

	public static void main(String[] args) {
		Circle cbjC01 = new Circle(30.5);
		Circle cbjC02 = new Circle(40);
		Circle cbjC03 = new Circle(120.5);
		Circle cbjC04 = new Circle(88.5);
		System.out.print("-------------------- Lần thực hiện 1 ------------------------");
		System.out.print("# Đối tượng 1 có tên : objC01, khởi tạo với bán kính = ");
		print(cbjC01);
		System.out.print("-------------------- Lần thực hiện 2 ------------------------");
		System.out.println("# Đối tượng 2 có tên : objC02, khởi tạo với bán kính = ");
		print(cbjC02);
		System.out.print("-------------------- Lần thực hiện 3 ------------------------");
		System.out.println("# Đối tượng 3 có tên : objC03, khởi tạo với bán kính = ");
		print(cbjC03);
		System.out.print("-------------------- Lần thực hiện 4 ------------------------");
		System.out.println("# Đối tượng 4 có tên : objC04, khởi tạo với bán kính = ");
		print(cbjC04);
	}


	private static void print(Circle circle) {
		System.out.println(circle.getdRadius());
	}

class Circle {
		// Datafield
		double dRadius;

		// Method khởi dựng không tham số đầu vào
		public Circle() {

		}

		// Method khởi dựng tham số đầu vào
		public Circle(double dRadius) {
			this.dRadius = dRadius;
			
		}

		public double getdRadius() {
			return dRadius;
		}

		public void setdRadius(double dRadius) {
			this.dRadius = dRadius;
		}

		// Method tính diện tích
		public double Area() {
			return dRadius * dRadius * Math.PI;
		}

}
}

