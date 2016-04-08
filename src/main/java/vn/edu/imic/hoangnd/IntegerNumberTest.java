package vn.edu.imic.hoangnd;

public class IntegerNumberTest {
	public static void main(String[] args) {
		
//		IntegerNumber sum(IntegerNumber num1, IntegerNumber num2){
//			num1.value =1;
//			num2.va
//			return (num1+num2);
//		}
		public static IntegerNumber sum(IntegerNumber num1, IntegerNumber num2){
			return num1+num2;
		}
		IntegerNumber number1 = new IntegerNumber();
		number1.value = 1;
		IntegerNumber number2 = new IntegerNumber();
		number2.value = 2;
		sum(number1, number2);
		System.out.println(sum);
	}
}
