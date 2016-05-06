package vn.edu.imic.hoangnd;

public class TestPair {
	public static void main(String[] args) {
		Pair<String> str = new Pair<String>("1st", "2nd");
		System.out.println("test: " + str.toString());
		
		Pair<Integer> intt = new Pair<Integer>(1, 2);
		System.out.println("test: " + intt.toString()); 
	}
}
