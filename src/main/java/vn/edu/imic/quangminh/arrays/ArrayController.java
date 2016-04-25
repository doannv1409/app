package vn.edu.imic.quangminh.arrays;

public class ArrayController {

	public int sum(int[] input) {
		int sum = 0;
		for(int i=0; i < input.length; i++) {
			sum += input[i];
		}
		
		return sum;
	}

	public int findMin(int[] input) {
		this.bubbleSort(input);
		return input[0];
	}
	
	public int findMax(int[] input) {
		this.bubbleSort(input);
		
		return input[input.length - 1];
	}
	
	private void bubbleSort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[j] < input[i]) {
					int temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
		}
	}
}
