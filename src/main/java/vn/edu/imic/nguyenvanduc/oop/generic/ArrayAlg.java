package vn.edu.imic.nguyenvanduc.oop.generic;

public class ArrayAlg {
	public static <T> void printArray(T[] a) {
		for (T i : a) {
			System.out.printf("%s ", i);
		}
	}
	public static <T> void printArray(T[] a,int start,int end) {
		if(start<0|| end<0||start>=end){
			throw new RuntimeException("Giá trị bắt đầu và kết thúc không hợp lệ");
	}
		else{
		for(int i=start;i<end;i++)
		{
			System.out.printf("%s ", i);
		}
		}
		/*public  Pair<T>  maxTwo(T[] a) {
			
		}*/
}
	
}
