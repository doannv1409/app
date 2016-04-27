package vn.edu.imic.trinhnv;

import java.util.Scanner;

public class Array_Exercise1 {
	public static void main(String[] args) {
		int n;
		int sum = 0;
		int max = 0;
		int min = 1;
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of elements array: ");
	    n = input.nextInt();
		int array[] = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter elements "+ (i + 1) +" of array : " );
			array[i] = input.nextInt();
		}
	    input.close();
	    
	    System.out.println("Each elements of this array is: ");
	    for (int i = 0; i < array.length; i++) {
	    	sum += array[i];
	    	if (max < array[i]) {
				max = array[i];
			}
	    	if (min > array[i]) {
				min = array[i];
			}
			System.out.println(array[i]);
		}

	    System.out.println("Sum all elements of this array is: " + sum);
	    System.out.println("The biggest element in this array is: " + max);
	    System.out.println("The smallest element in this array is: " + min);
	}
}
