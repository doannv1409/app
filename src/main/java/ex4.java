import java.util.Scanner;
public class ex4 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("nhap thang can xem:");
		int thang = sc.nextInt();
		
		System.out.println("nhap nam can xem :");
		int nam = sc.nextInt();
		if(thang < 1||thang > 12){
			System.out.println("Ban nhap lai thang");
		}
			else if(thang==4 ||thang==6 ||thang==9 ||thang==11){
				System.out.println("thang 30 ngay");
		}	else if(thang==1 ||thang==3 || thang==5 || thang==7 ||thang==8||thang==10 ||thang==12){
				System.out.println("thang 31 ngay");
		}	else{
				if(nam%4==0 || nam%400==0 && nam%100 !=0){
					System.out.println("thang 29 ngay"+" nam nhuan");
				}
				else
					System.out.println("thang co 28 ngay");
		}
	}
	

}
