package vn.edu.imic.quocthinh;

public class quocthinh {
	public static void main(String[] args) {
		//print say hello
		System.out.println("say Hello");
		// khai bao bien
		int a=0;
		float b=12.4f;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		float sum=a+b;
		System.out.println("a+b=" +sum );
		
		// ++ --
		if(a++ ==2) {
			System.out.println("a==2: true " + a );
		} else {
			System.out.println("a==2: false " +a );
		}
	}
}
