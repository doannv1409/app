import java.util.Scanner;
public class ex6 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap 1 so:");
		int so=sc.nextInt();
		System.out.println("chon kieu: chan, le");
		int kieu=sc.nextInt();
		
		
		if(kieu==0){
			System.out.println("cac so chan :");
			for(int i=0;i<so;i++)
			{
				if(i%2==0){
					System.out.println(i+ " ");
				}
			}
		}else
			System.out.println("cac so le  :");
			for(int i=0;i<so;i++){
				if(i%2!=0){
					System.out.println(i+ " ");
				}
			}
	}

}
