package vn.edu.imic.leanhtuan;

public class IntegerNumberTest {
		public static void main (String[] args){
			IntegerNumber number1 = new IntegerNumber(10);
			IntegerNumber number2 = new IntegerNumber(20);
			
			printSum(number1);
		}
		
		static IntegerNumber printSum(IntegerNumber number){
			System.out.println(number.getIntegerNumber(0));
			return number;
			
		}
		//Chua implement ham tinh tong
}
