package vn.edu.imic.quangminh.oop.abstracts;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt(100));
	}
}
