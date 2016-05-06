package vn.edu.imic.linh;

public class TestArrayAlg {
	public static void main(String[] args){
		ArrayAlg<Integer> arrayAlg = new ArrayAlg<Integer>();
		Integer[] test = {9,3,8,1};
		
		arrayAlg.print(test);
		arrayAlg.print(test, 0, 2);
		arrayAlg.maxTwo(test);
	}
}
