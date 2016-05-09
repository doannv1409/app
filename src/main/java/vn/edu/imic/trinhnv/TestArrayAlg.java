package vn.edu.imic.trinhnv;

public class TestArrayAlg {
	public static void main(String[] args) {
		ArrayAlg<Double> arrayAlg = new ArrayAlg<>();
		Double[] doubleNumbers = new Double[]{-12.3, 24.6, 0.0, 1.0};
		arrayAlg.print(doubleNumbers);
		arrayAlg.print(doubleNumbers, 0, 2);
		Pair<Double> maxTwo = arrayAlg.maxTwo(doubleNumbers);
		System.out.println(maxTwo);
		
		ArrayAlg<String> arrayAlg2 = new ArrayAlg<>();
		String[] strs = new String[]{"John", "Lam", "Nam"};
		arrayAlg2.print(strs);
		arrayAlg2.print(strs, 0, 2);
		Pair<String> maxTwo2 = arrayAlg2.maxTwo(strs);
		System.out.println(maxTwo2);
	}
}
