package vn.edu.imic.tung.array;

public class ArrayAlg {
	public <T> void printArray( T [] array){
		for(int i =0; i<array.length; i++){
			System.out.println(" "+array[i]);
		};
	}	
	public <T> void printAS(T [] array, int start, int end){
		if(start>= end){
			System.out.println("gia tri bat dau va ket thuc khong hop le");}
			else {
				for(int i = start; i<=end ;i++){
					System.out.println(" "+array[i]);
					
				}
				
				
		}
		
	}
	/*public static <T> T maxTwo( T [] array){
		T max= array[0];
		for(int i =0; i<=array.length;i++){
			if(max< array[i]){
				
			}
			
		}
		return null;
	}
	*/

}
