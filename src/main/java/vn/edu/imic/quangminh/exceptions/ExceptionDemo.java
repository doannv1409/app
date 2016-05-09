package vn.edu.imic.quangminh.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static void checkUserName(String username) throws Exception {
		if(!"imic".equals(username)) {
			throw new Exception("username not found");
		}
	}
	
	public static void validateUsername(String username) {
		if(!"imic".equals(username)) {
			throw new RuntimeException("username not found");
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int nextInt = scanner.nextInt();
			System.out.println("number: " + nextInt);
			scanner.close();
		} catch(InputMismatchException e) {
			System.out.println("Co loi xay ra");
		} catch (Exception e) {
			//LOG ra file
			e.printStackTrace();
		} finally {
			//Bao h cung duoc chay block finally
			System.out.println("End program");
		}
		
		
		try {
			checkUserName("abc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			validateUsername("username");
		} catch(RuntimeException e) {
			System.out.println("Loi Runtime");
		}
	}
}
