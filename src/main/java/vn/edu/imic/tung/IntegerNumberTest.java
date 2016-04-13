package vn.edu.imic.tung;

import vn.edu.imic.hoangnd.IntegerNumber;

public class IntegerNumberTest {
	public static void main(String[] args){
		
		IntegerNumber number1 = new IntegerNumber(2);
		IntegerNumber number2 = new IntegerNumber(3);
		IntegerNumber number3 = sum(number1, number2);
		System.out.println("tong 2 so la:"+number3.value); 
		
	}
	public static IntegerNumber sum(IntegerNumber number1, IntegerNumber number2){
			IntegerNumber result = new IntegerNumber();
			result.value = number1.value + number2.value;
			return result;
		}
	}
	


