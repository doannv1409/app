package vn.edu.imic.vumanh;

public class IntegerNumber1 {
	public static void main(String[] args) {
		

		IntegerNumber Number1 = new IntegerNumber();
		Number1.value = 1;
		IntegerNumber Number2 = new IntegerNumber();
		Number2.value = 2;
		
		IntegerNumber result = sum(Number1, Number2);
		
		System.out.println("Tong 2 so: " + result.value);
	}
	public static IntegerNumber sum(IntegerNumber Number1, 
			IntegerNumber Number2){
		IntegerNumber result = new IntegerNumber();
		result.value = Number1.value + Number2.value;
		return result;
	}
	
}