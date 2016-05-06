package vn.edu.imic.trinhnv;

public class TestArrayAlg {
	public static void main(String[] args) {
		Integer[] arr = {11,32,100,43,56,28,56};
		ArrayAlg<Integer[]> i = new ArrayAlg<Integer[]>(arr);
		System.out.print("Array: ");
		i.print(arr);
		System.out.println("-------------");
		ArrayAlg.<Integer>print(arr, 1, 3);
		i.maxTwo(arr);
	}
}
