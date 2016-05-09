package vn.edu.imic.tunglam.generic;

public class ArrayAglTest {
	public static void main(String[] args) {
		Integer[] numbers = {2,3,4,5,60,7,6};
		ArrayAgl.<Integer>print(numbers,0,1);
		String[] names = { "Jonh", "LAm", "Nam" };
		String middle = ArrayAgl.getMiddle(names);
		System.out.println(middle);
		ArrayAgl<Integer> arrayAgl = new ArrayAgl<>();
		Pair<Integer> s1= arrayAgl.maxTwo(numbers);
		System.out.print(s1);
	}
}
