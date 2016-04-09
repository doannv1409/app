package vn.edu.imic.leanhtuan;

public class IntegerNumberTest {
		public static void main (String[] args){
			IntegerNumber number1 = new IntegerNumber(10);
			IntegerNumber number2 = new IntegerNumber(20);
			IntegerNumber result = sum(number1,number2);
			
			System.out.println("Tong la : " + result.getValue());
		}
		
		public static IntegerNumber sum(IntegerNumber number1, IntegerNumber number2){
			IntegerNumber result = new IntegerNumber(0);
			result.setValue(number1.getValue() + number2.getValue());
			return result;
			
		}
		//Chua implement ham tinh tong
}
