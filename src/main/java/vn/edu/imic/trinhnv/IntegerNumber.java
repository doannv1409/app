package vn.edu.imic.trinhnv;

public class IntegerNumber {
    private  int value;

    public IntegerNumber() {
    }
    
    public int getValue(){
    return value;
}
    public void setValue(int value){
        this.value = value;
    }
    
    public IntegerNumber(int value) {
        this.value = value;
    }

}

class IntegerNumberTest{
    public static void main(String[] args) {
        IntegerNumber num1 = new IntegerNumber(1);
        IntegerNumber num2 = new IntegerNumber(3);
        
        IntegerNumber num3 = sum(num1, num2);
        System.out.println("Sum = " + num3.getValue());
        
        IntegerNumber num4 = add(num1, num2);
        System.out.println("Add = " + num4.getValue());
    }
    
    public static IntegerNumber sum(IntegerNumber so1, IntegerNumber so2){
        IntegerNumber result = new IntegerNumber();
        result.setValue(so1.getValue() + so2.getValue());
        return result;
    }
    
    public static IntegerNumber add(IntegerNumber so1, IntegerNumber so2){
        IntegerNumber multi = new IntegerNumber();
        multi.setValue(so1.getValue() * so2.getValue());
        return multi;
    }
}
