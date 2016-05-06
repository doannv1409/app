package vn.edu.imic.haiyen;

public class ArrayAlgTest {
	public static void main(String[] args) {
		Integer[] intArray={10, 20, 30, 3, 4, 19, 18, 57, 89};
		ArrayAlg al=new ArrayAlg();
		System.out.println("- mang a: ");
		al.print(intArray);
		System.out.println("- phan tu tu a[start] den a[end]: ");
		al.print(intArray, 2, 7);
		System.out.println("- hai so lon nhat: ");
		al.maxTwo(intArray);
	}

}
