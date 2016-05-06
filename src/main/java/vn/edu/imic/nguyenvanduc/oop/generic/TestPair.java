package vn.edu.imic.nguyenvanduc.oop.generic;

public class TestPair {
	public static void main(String[] args) {
		Pair<String> string=new Pair<String>("1","2");
		System.out.println(string);
		Pair<Integer> integer=new Pair<Integer>(1,2);
		System.out.println(integer);
	}
}
