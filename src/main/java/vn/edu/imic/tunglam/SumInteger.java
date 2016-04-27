package vn.edu.imic.tunglam;

import vn.edu.imic.tunglam.IntegerNumber;

public class SumInteger {
public static void main(String[] args){
	IntegerNumber number1 = new IntegerNumber();
	number1.value = 5;
	IntegerNumber number2 = new IntegerNumber();
	number2.value = 2;
	
	IntegerNumber result = sum(number1, number2);
	IntegerNumber multiValue= multiple(number1, number2);
	
	
	System.out.println("Tong 2 so: " + result.value);
	System.out.println(" Tich: " + multiValue.value);
}
public static IntegerNumber sum(IntegerNumber num1, 
		IntegerNumber num2){
	IntegerNumber result = new IntegerNumber();
	result.value = num1.value + num2.value;
	return result;
}

public static IntegerNumber multiple(IntegerNumber num1,
		IntegerNumber num2){
	IntegerNumber multiValue= new IntegerNumber();
	multiValue.value= num1.value * num2.value;
	return multiValue;
	
}


}
