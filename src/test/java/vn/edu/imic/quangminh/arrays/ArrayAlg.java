package vn.edu.imic.quangminh.arrays;

public class ArrayAlg<T> {
	protected T start;
	protected T end;
	protected T a;

	public ArrayAlg() {

	}

	public ArrayAlg(T a, T start, T end) {
		this.start = start;
		this.end = end;
		this.a = a;

	}

	public static <T> void print(T[] a) {
		for(T i : a){
		System.out.println(i);
		}
	}

	public void print(T[] a, int start, int end){
		int i;
		if(start < end) {
		for(i = start; i < end; i++){
			System.out.println(a);
			}
		
		System.out.println(i);
		
		}else{
			
		}
		throw new RuntimeException("Gia Tri Bat Dau Va Ket Thuc Khong Hop Le");
	}
	
	public void maxTwo(T[] a){
			
	}

}
