package vn.edu.imic.tung.array;

public class TestArrayAlg {
	public static void main (String[] args){
		Integer [] a ={1,4,7,5,7};
		ArrayAlg at = new  ArrayAlg();
		 System.out.println(" tat ca cac phan tu trong mang");
		 at.printArray(a);
		 System.out.println(" in gia tri bat dau:");
		 at.printAS(a, 1, 3);
		
	}

}
