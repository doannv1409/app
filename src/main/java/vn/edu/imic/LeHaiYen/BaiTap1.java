package vn.edu.imic.LeHaiYen;

public class BaiTap1 {
	public static void main(String[] args) {
		int a = 2;
		float b = (float) 5.6;
		float c = (float) ((float) (Math.sqrt(a)) * Math.pow(b, 2) + 4 * a * Math.sqrt(b));

	//	float c = (float) (Math.sqrt(a) * b * b + 4 * a * Math.sqrt(b));
		System.out.println(c);
	}

}
