package vn.edu.imic.haiyen;

import java.util.Arrays;
import java.util.List;

public class ArrayAlg {

	public <T> void print(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}

	public <T> void print(T[] a, int start, int end) {
		int dem = 0;
		if (start < end && start > 0 && end <= a.length) {
			for (int i = start; i < end; i++) {
				System.out.print(a[i] + "  ");
				dem++;
			}
			System.out.println();
			System.out.println("so phan tu la: " + dem);
		} else
			throw new RuntimeException("gia tri khong hop le");
	}

	public <T> void maxTwo(T[] a) {
//		int max1 = (int) a[0], max2 = (int) a[0];
//		for (int i = 0; i < a.length - 1; i++) {
//			if ((int) a[i] > max1) {
//				max2 = max1;
//				max1 = (int) a[i];
//			} else if ((int) a[i] < max1 && (int) a[i] > max2 || max1 == max2) {
//				max2 = (int) a[i];
//			}
//		}
//		Pair<Integer> max = new Pair<Integer>(max2, max1);
//		System.out.println(max.toString());

	}

}
