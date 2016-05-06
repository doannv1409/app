package vn.edu.imic.tunglam.generic;

public class ArrayAgl<T> {
	public static <T> T getMiddle(T[] a) {
		return a[a.length / 2];
	}

	public static <T> void print(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}

	public static <T> void print(T[] a, int start, int end) {
		if (start>=end){
			throw new RuntimeException("Gia tri nhap vao khong hop le");
		} 
		for (int i = start; i <= end; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}

	public Pair<T> maxTwo(T[] a) {
		this.bubblesort(a);
		Pair<T> b = new Pair<T>(a[a.length - 2], a[a.length - 1]);
		return b;
	}

	private void bubblesort(T[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if ((a[i])>(a[j]) {
					T temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		
	}
}
}
