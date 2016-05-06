package vn.edu.imic.hoangnd.excercise;

import vn.edu.imic.hoangnd.Pair;

public class TestArrayAlg {
	public static <T> void print(T[] t) {
		System.out.println("Cac phan tu cua mang: ");
		for (T element : t) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static <T> void print(T[] t, int start, int end) {
		if (start < end && start >= 0 && end <= t.length) {
			System.out.println("\nCac phan tu cua mang tu vi tri thu " + start + " den " + end + ": ");
			for (int i = start; i <= end - 1; i++) {
				System.out.print(t[i] + " ");
			}
			System.out.println();
		} else
			throw new RuntimeException("Gia tri bat dau va ket thuc khong hop le !");
	}

	public static <T> void find2Max(T[] t) {
		int max1 = (int) t[0];
		int max2 = (int) t[0];
		int tg = 0;
		for (int i = 0; i < t.length - 1; i++) {
			if (max1 < (int) t[i + 1]) {
				tg = max1;
				max1 = (int) t[i + 1];
				if (max2 < tg) {
					max2 = tg;
				}
			} else if (max2 < (int) t[i + 1]) {
				max2 = (int) t[i + 1];
			}
		}
		Pair<Integer> max = new Pair<Integer>(max2, max1);
		System.out.println("\n2 phan tu co gia tri lon nhat: " + max.toString());
	}

	public static <T> void find2Maxs(T[] t) {
		int max1 = (int) t[0];
		int max2 = (int) t[0];
		int pos = 0;
		for (int i = 0; i < t.length; i++) {
			if (max1 <= (int) t[i]) {
				max1 = (int) t[i];
				pos = i;
			}
		}
		for (int i = 0; i < t.length; i++) {
			if (i == pos)
				continue;
			if (max2 <= (int) t[i]) {
				max2 = (int) t[i];
			}
		}
		Pair<Integer> max = new Pair<Integer>(max2, max1);
		System.out.println("\n2 phan tu co gia tri lon nhat: " + max.toString());
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 20, 3, 4, 5, 11, 7, 8, 9, 10 };
		// in cac phan tu cua mang
		print(intArray);
		// in cac phan tu tu vi tri start den end
		print(intArray, 2, 10);
		// in ra 2 phan tu co gia tri lon nhat
		find2Max(intArray);
		//find2Maxs(intArray);
	}
}
