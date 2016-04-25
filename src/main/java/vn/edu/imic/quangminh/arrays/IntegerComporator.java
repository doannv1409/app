package vn.edu.imic.quangminh.arrays;

import java.util.Comparator;

public class IntegerComporator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
