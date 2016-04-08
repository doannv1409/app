package vn.edu.imic.hoangnd;

public class IntegerNumberTest {
	public static void main(String[] args) {
		
//		IntegerNumber sum(IntegerNumber num1, IntegerNumber num2){
//			num1.value =1;
//			num2.va
//			return (num1+num2);
//		}
		IntegerNumber so1 = new IntegerNumber(1);
		IntegerNumber so2 = new IntegerNumber(2);
		
		IntegerNumber so3 = sum(so1, so2);
		
		System.out.println("Tong 2 so: " + so3.getValue());
		
	}
	
	public static IntegerNumber sum(IntegerNumber num1, 
			IntegerNumber num2){
		IntegerNumber result = new IntegerNumber();
		result.setValue(num1.getValue() + num2.getValue());
		return result;
	}
	
	public static IntegerNumber multiple(IntegerNumber num1, 
			IntegerNumber num2) {
		int multiValue = num1.getValue() * num2.getValue();
		return new IntegerNumber(multiValue); 
	}
	
}
