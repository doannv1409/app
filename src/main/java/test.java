import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// khai bao bien
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap UseName:");
		String Usename = sc.nextLine();
		System.out.println("nhap passWord:");
		String password = sc.nextLine();

	if (Usename.isEmpty() || password.isEmpty()) 
	{
		System.out.println("Ban chua nhap ten truy cap ban can nhap lai");
	}
	if(Usename.equals("doannv") && password.equals("imic.edu.vn")){
		System.out.println("ban da dang nhap thanh cong ");
	}
	else{
		System.out.println("ban dang nhap k thanh cong vui long dang nhap lai~~");
	}
	}
}

