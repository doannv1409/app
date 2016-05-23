package vn.edu.imic.hoangnd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws ParseException {
		String date_s = "2011-01-18 00:00:00.0";
		String str = "";
		// *** note that it's "yyyy-MM-dd hh:mm:ss" not "yyyy-mm-dd hh:mm:ss"
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = dt.parse(date_s);

		// *** same for the format String below
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dt1.format(date));

		System.out.println("Nhap ngay: ");
		Scanner scanner1 = new Scanner(System.in);
		str = scanner1.next();
		Date date1 = dt1.parse(str);
		System.out.println(dt.format(date1));

	}
}
