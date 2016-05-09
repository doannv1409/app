package vn.edu.imic.tunglam.Exceptions;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class IplmLoginController implements LoginController {

	@Override
	public void validate(UserDetail user) {
		if (user.getUsername().isEmpty()) {
			throw new UserNotFoundException("empty username", "c1");
		}
		if (user.getPassword().isEmpty()) {
			throw new UserNotFoundException("empty password", "c2");
		}
		if (("imic").equals(user.getUsername())&& ("123456").equals(user.getPassword())){
			System.out.println("login ok");
		} else {
			throw new UserNotFoundException("Invalid username or passwork", "c3");
		}
	}
}
