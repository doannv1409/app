package vn.edu.imic.quangminh.oop.abstracts;

import java.util.Scanner;

public class LoginFrame {
	private LoginController controller;
	
	public void setController(LoginController controller) {
		this.controller =  controller;
	}
	
	public void checkUserPass() {
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		String password = scanner.nextLine();
		
		if(controller.auth(username, password)) {
			System.out.println("Dang nhap thanh cong");
		} else {
			System.out.println("Sai username||password");
		}
		
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		
		LoginController controller = new LoginController() {
			@Override
			public boolean auth(String username, String password) {
				return true;
			}

			@Override
			public boolean login() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		controller.login();
		LoginFrame frame = new LoginFrame();
		frame.setController(controller);
		
		frame.checkUserPass();
		
	}
}
