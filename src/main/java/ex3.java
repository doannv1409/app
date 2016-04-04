import java.util.Scanner;;
public class ex3 {
	public static void main(String[] args){
		//khai bao bien 
		Scanner sc=new Scanner(System.in);
		System.out.println("so kilogram");
		int kg=sc.nextInt();
		int pounds=(int) (kg*2.2);
		System.out.println("Result:"+ kg +"kg = " + pounds+ " pounds");
	}
}
