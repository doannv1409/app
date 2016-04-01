package vn.edu.imic.hoangnd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lecture2 {
	public static void main(String[] args) {
		System.out.println("Chon bai toan (1-6): ");
		String bt = "";
		do {
			Scanner baiToan = new Scanner(System.in);
			bt = baiToan.next();
		} while (!isNumericBaiToan(bt));
		int baitoan = Integer.parseInt(bt);
		switch (baitoan) {
		case 1:
			System.out.println("Bai 1: DANG NHAP HE THONG");
			String str = "";
			String str2 = "";
			int count = 0;
			do {
				if (count != 0) {
					System.out.println("Sai thong tin dang nhap. Vui long nhap lai !");
				}
				System.out.println("Ten dang nhap:");
				Scanner scanner1 = new Scanner(System.in);
				str = scanner1.next();
				System.out.println("Mat khau:");
				Scanner scanner2 = new Scanner(System.in);
				str2 = scanner2.next();
				count++;
			} while (!str.equals("hoangnd") || !str2.equals("tieuthulonton"));
			System.out.println("Dang nhap thanh cong !");
			break;
		case 2:
			System.out.println("Bai 2: TINH TOAN");
			str = "";
			str2 = "";
			String pheptoan = "";
			System.out.println("Nhap so a:");
			do {
				Scanner scanner1 = new Scanner(System.in);
				str = scanner1.next();
			} while (!isNumeric(str));

			System.out.println("Nhap so b");
			do {
				Scanner scanner2 = new Scanner(System.in);
				str2 = scanner2.next();
			} while (!isNumeric(str2));

			System.out.println("Chon phep toan: Cong-1; Tru-2; Nhan-3; Chia-4");
			do {
				Scanner tthn = new Scanner(System.in);
				pheptoan = tthn.next();
			} while (!isNumericPhepToan(pheptoan));
			int pt = Integer.parseInt(pheptoan);
			double a = Double.parseDouble(str);
			double b = Double.parseDouble(str2);
			switch (pt) {
			case 1:
				System.out.println("Ket qua: a + b = " + a + " + " + b + " = " + (a + b));
				break;
			case 2:
				System.out.println("Ket qua: a - b = " + a + " - " + b + " = " + (a - b));
				break;
			case 3:
				System.out.println("Ket qua: a x b = " + a + " x " + b + " = " + (a * b));
				break;
			default:
				if (a == 0 && b == 0) {
					System.out.println("Ket qua: a/b = " + a + "/" + b + " = Khong xac dinh duoc ket qua");
				} else if (a != 0 && b == 0) {
					System.out.println("Ket qua: a/b = " + a + "/" + b + " = Khong the chia cho 0");
				} else
					System.out.println("Ket qua: a/b = " + a + "/" + b + " = " + (a / b));
				break;
			}
			break;
		case 3:
			System.out.println("Bai 3: CHUYEN DOI KILOGRAM -> POUND");
			str = "";
			str2 = "";
			System.out.println("Nhap so Kilogram:");
			do {
				Scanner scanner1 = new Scanner(System.in);
				str = scanner1.next();
			} while (!isNumeric(str));
			double pounds = Double.parseDouble(str) * 2.2;
			DecimalFormat df = new DecimalFormat("0.00");
			String pound = df.format(pounds);
			System.out.println("Ket qua: " + str + " Kilogram = " + pound + " Pounds");
			break;
		case 4:
			System.out.println("Bai 4: TINH SO NGAY TRONG THANG");
			str = "";
			str2 = "";
			String strMon = "";
			String strYear = "";
			System.out.println("Nhap thang: ");
			do {
				Scanner scanner1 = new Scanner(System.in);
				str = scanner1.next();
			} while (!isNumericMonth(str));
			System.out.println("Nhap nam: ");
			do {
				Scanner scanner2 = new Scanner(System.in);
				str2 = scanner2.next();
			} while (!isNumericYear(str2));
			int month = Integer.parseInt(str);
			int year = Integer.parseInt(str2);
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				strMon = "30";
			} else if (month == 2) {
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					strMon = "29";
				} else
					strMon = "28";
			} else
				strMon = "31";
			System.out.println("==> Thang " + month + " Nam " + year + " co " + strMon + " Ngay");
			break;
		case 5:
			System.out.println("Bai 5: CAP DOI");
			String strTuoi = "";
			String strTTHN = "";
			String strGT = "";

			System.out.println("Nhap ten: ");
			Scanner ten = new Scanner(System.in);
			String strTen = ten.nextLine();

			System.out.println("Nhap tuoi: ");
			do {
				Scanner tuoi = new Scanner(System.in);
				strTuoi = tuoi.nextLine();
			} while (!isNumericTuoi(strTuoi));

			System.out.println("Tinh trang hon nhan: Chua co gia dinh-1; Co gia dinh-2; Ly hon-3");
			do {
				Scanner tthn = new Scanner(System.in);
				strTTHN = tthn.next();
			} while (!isNumericThongTin(strTTHN));

			System.out.println("Gioi tinh: Nam-1; Nu-2; Khac-3");
			do {
				Scanner gt = new Scanner(System.in);
				strGT = gt.next();
			} while (!isNumericThongTin(strGT));

			System.out.println("Thong tin dang ky:");
			System.out.println("Ho va ten: " + strTen);
			System.out.println("Tuoi: " + strTuoi);
			String noti1 = Integer.parseInt(strTTHN) == 1 ? "Chua co gia dinh"
					: Integer.parseInt(strTTHN) == 2 ? "Co gia dinh" : "Ly hon";
			System.out.println("Tinh trang hon nhan: " + noti1);
			String noti2 = Integer.parseInt(strGT) == 1 ? "Nam" : Integer.parseInt(strGT) == 2 ? "Nu" : "Khac";
			System.out.println("Gioi tinh: " + noti2);
			String noti3 = "";
			if (Integer.parseInt(strGT) == 1 && Integer.parseInt(strTuoi) >= 22
					&& (Integer.parseInt(strTTHN) == 1 || Integer.parseInt(strTTHN) == 3)) {
				noti3 = "Duoc phep tham gia";
			} else if (Integer.parseInt(strGT) == 2 && Integer.parseInt(strTuoi) >= 19
					&& (Integer.parseInt(strTTHN) == 1 || Integer.parseInt(strTTHN) == 3)) {
				noti3 = "Duoc phep tham gia";
			} else
				noti3 = "Khong duoc phep tham gia";
			System.out.println("\nKet qua dang ky: " + noti3);
			break;
		default:
			System.out.println("Bai 6: IN RA DAY SO CHAN, LE");
			str = "";
			str2 = "";
			System.out.println("Nhap so:");
			do {
				Scanner scanner1 = new Scanner(System.in);
				str = scanner1.next();
			} while (!isNumeric(str));
			System.out.println("So da nhap = " + str);
			System.out.println("Chon kieu chan hoac le: Chan-1; Le-2");
			do {
				Scanner scanner2 = new Scanner(System.in);
				str2 = scanner2.next();
			} while (!isNumericSo(str2));
			String noti = Integer.parseInt(str2) == 1 ? "So Chan" : "So Le";
			int num1 = Integer.parseInt(str);
			int num2 = Integer.parseInt(str2);
			System.out.println("Kieu da chon la " + noti);
			int i = 0;
			count = 0;
			if (num2 == 1) {
				System.out.println("Danh sach so chan: ");
				while (i <= num1) {
					if (i % 2 == 0) {
						System.out.print(i + " ");
						count++;
					}
					i++;
				}
				System.out.println("\nCo tat ca " + count + " so chan");
			} else if (num2 == 2) {
				System.out.println("Danh sach so le: ");
				while (i <= num1) {
					if (i % 2 != 0) {
						System.out.print(i + " ");
						count++;
					}
					i++;
				}
				System.out.println("\nCo tat ca " + count + " so le");
			}
			break;
		}
	}

	public static boolean isNumericBaiToan(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d > 0 && d < 7) {
				return true;
			} else {
				System.out.println("Chon bai toan (1-6): ");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Chon bai toan (1-6): ");
			return false;
		}
	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
			return true;
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap kieu so");
			return false;
		}
	}

	public static boolean isNumericPhepToan(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d > 0 && d < 5) {
				return true;
			} else {
				System.out.println("Chon phep toan: Cong-1; Tru-2; Nhan-3; Chia-4");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Chon phep toan: Cong-1; Tru-2; Nhan-3; Chia-4");
			return false;
		}
	}
	
	public static boolean isNumericMonth(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d > 0 && d < 13) {
				return true;
			} else {
				System.out.println("Nhap thang tu 1 den 12");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap thang tu 1 den 12");
			return false;
		}
	}

	public static boolean isNumericYear(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d > 0 && d <= 9999) {
				return true;
			} else {
				System.out.println("Nhap nam tu 0 den 9999");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap nam tu 0 den 9999");
			return false;
		}
	}
	
	public static boolean isNumericThongTin(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d == 1 || d == 2 || d == 3) {
				return true;
			} else {
				System.out.println("Chi nhap 1 hoac 2 hoac 3");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Chi nhap 1 hoac 2 hoac 3");
			return false;
		}
	}

	public static boolean isNumericTuoi(String str) {
		try {
			double d = Double.parseDouble(str);
			return true;
		} catch (NumberFormatException nfe) {
			System.out.println("Nhap lai tuoi: ");
			return false;
		}
	}
	
	public static boolean isNumericSo(String str) {
		try {
			int d = Integer.parseInt(str);
			if (d == 1 || d == 2) {
				return true;
			} else {
				System.out.println("Chi nhap 1 hoac 2");
				return false;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Chi nhap 1 hoac 2");
			return false;
		}
	}
}
