package vn.edu.imic.taind;

public class IntegerNumber {
	//Viet lai lop doi tuong chi chua 1 gia tri 
	//int la thuoc tinh 
	private int number;
	private int number2;

	public IntegerNumber(int number, int number2){
		this.setValue(number, number2);
	}
	
	public int getNumber1(){
		return number;
	}
	
	public int getNumber2(){
		return number2;
	}
	
	public void setValue(int number, int number2){
		this.number = number;
		this.number2 = number2;
	}
}
