package vn.edu.imic.vumanh;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten cua ban:");
		String ten = sc.nextLine();
		System.out.println("tuoi cua ban:");
		String sotuoi = sc.nextLine();
		System.out.println("tinh trang hon nhan:chua co gia dinh,ly hon,da ket hon ");
		String tinhtrang = sc.nextLine();
		
		System.out.println("gioi tinh: nam,nu");
		String gt = sc.nextLine();

		int tuoi = 0;
		if (ten.isEmpty()) {
			System.out.println("ban chua nhap ten");
		}
		if (sotuoi.isEmpty()) {
			System.out.println("ban chua nhap tuoi");
		} else {
			tuoi = Integer.parseInt(sotuoi);
		}
		if (tinhtrang.isEmpty()) {
			System.out.println("ban chua nhap tinh trang");
		}
		if (gt.isEmpty()) {
			System.out.println("ban chua nhap gioi tinh");
		}
		if (tuoi < 19) {
			System.out.println("khong duoc tham gia");
		} else {

				if (gt.equals("nu") && tuoi < 19 && tinhtrang.equals("da co gia dinh")) {
						System.out.println("khong duoc phep tham gia");
				}else {
						System.out.println("duoc phep tham gia");
				}if (gt.equals("nam") && tuoi < 22 && tinhtrang.equals("da co gia dinh")) {
						System.out.println("khong duoc phep tham gia");
				} else {
						System.out.println("duoc phep tham gia");
				}
			}
		}
}