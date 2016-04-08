package vn.edu.imic.quocthinh;

import vn.edu.imic.hoangnd.IntegerNumber;

public class IntegernumberTest {
	public static void main(String agrs[]) {
		IntegerNumber number1 = new IntegerNumber(1);
		number1.value = 1;
		IntegerNumber number2 = new IntegerNumber(2);
		number2.value = 2;
		IntegerNumber result = sum(number1, number2);	

		System.out.println("tong 2 so: " + result.value);
	}

	public static IntegerNumber sum(IntegerNumber num1, IntegerNumber num2) {
		IntegerNumber result = new IntegerNumber();
		result.value = num1.value + num2.value;
		return result;
	}

}
