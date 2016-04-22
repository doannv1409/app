package vn.edu.imic.haiyen;

public class HDT_TriangleTest {
	public static void main(String[] args) {
		HDT_TriangleAbstract test = new HDT_TriangleAbstract();
		test.side1 = 10;
		test.side2 = 30;
		test.side3 = 35;
		test.Area();
		test.Perimeter();
	}
}
