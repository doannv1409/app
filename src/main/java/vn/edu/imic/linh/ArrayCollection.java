package vn.edu.imic.linh;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ArrayCollection {
	
	private int[] a;
	private int arrayLenght;
	
	public ArrayCollection(int arrayLenght){
		this.arrayLenght = arrayLenght;
		this.a = new int[this.arrayLenght];
	}
	
	public void setArrayValue(int index, int value){
		this.a[index] = value;
	}
	
	public int getArrayValue(int index){
		return this.a[index];
	}
	
	public int findMax(){
		int max = this.a[0];
		for(int i=1;i<this.arrayLenght;i++){
			if(max<this.a[i]){
				max = a[i];
			}
		}
		return max;
	}
	
	public int findMin(){
		int min = this.a[0];
		for(int i=1;i<this.arrayLenght;i++){
			if(min>this.a[i]){
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		ArrayCollection array = new ArrayCollection(5);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap mang: ");
		StringBuffer string = new StringBuffer();
		for(int i=0;i<5;i++){
			try{
				System.out.printf("Nhap phan tu %d: \n", i);
				array.setArrayValue(i, scanner.nextInt());
				string.append(array.getArrayValue(i));
				if(i<4){
					string.append(", ");
				}
			}
			catch(InputMismatchException e){
				System.out.println(e);
				string.setLength(0);
			}
		}
		
		System.out.printf("Mang nhap vao la: %s \n", string.toString());
		System.out.printf("Phan tu nho nhat la: %d \n", array.findMin());
		System.out.printf("Phan tu lon nhat la: %d \n", array.findMax());
		
		scanner.close();
	}
	
}
