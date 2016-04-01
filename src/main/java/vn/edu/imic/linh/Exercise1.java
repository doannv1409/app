package vn.edu.imic.linh;
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ten tai khoan: ");
		String userName = scanner.nextLine();
		
		System.out.println("Nhap mat khau: ");
		String passWord = scanner.nextLine();
		
		if(userName.equals("doannv")&&passWord.equals("imic.edu.vn")){
			System.out.println("Ban da dang nhap thanh cong!");
		}
		else{
			System.out.println("Dang nhap khong thanh cong. Vui long kiem tra thong tin dang nhap!");
		}
	}

}
