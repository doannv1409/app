package vn.edu.imic.hoangnd.excercise;

public class TestArrayAlg {

	public static void main(String[] args) {
		Integer[] intArray = { 2, 20, 3, 4, 5, 11, 7, 8, 9, 10 };
		// in cac phan tu cua mang
		ArrayAlg<Integer> arr = new ArrayAlg<>();
		arr.print(intArray);
		// in cac phan tu tu vi tri start den end
		arr.print(intArray, 2, 10);
		// in ra 2 phan tu co gia tri lon nhat
		arr.find2Max(intArray);
		//find2Maxs(intArray);
	}
}
