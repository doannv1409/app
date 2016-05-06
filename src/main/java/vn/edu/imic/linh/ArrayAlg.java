package vn.edu.imic.linh;

public class ArrayAlg<T extends Integer> {

	public void print(T[] array){
		StringBuffer string = new StringBuffer("Mang da nhap: ");
		for(T a : array){
			string.append(a).append(" ");
		}
		System.out.println(string.toString());
	}
	
	public void print(T[] array, int start, int end){
		StringBuffer string = new StringBuffer("Mang can cam tim la: ");
		if(start < 0 || end > array.length || start >= end){
			throw new RuntimeException("Invalid");
		}
		for(int i=start;i<end;i++){
			string.append(array[i]).append(" ");
		}
		System.out.println(string.toString());
		
	}
	
	public void maxTwo(T[] array){
		int lenght = array.length;
		for(int i = 0; i<lenght-2;i++){
			for(int j=i+1;j<lenght-1;j++){
				if(array[i] > array[j]){
					T tmp = array[i];
					array[i] = array[j];
					array[j] = array[i];
				}
			}
		}
		
		Pair<Integer> pair = new Pair(array[lenght-2], array[lenght-1]);
		System.out.println(pair.toString());

	}
	
}
