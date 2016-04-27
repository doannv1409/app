package vn.edu.imic.quangminh.oop.abstracts;

public class LoginController2 implements LoginController {

	@Override
	public boolean auth(String username, String password) {
		return false;
	}

	@Override
	public boolean login() {
		return false;
	}

}
