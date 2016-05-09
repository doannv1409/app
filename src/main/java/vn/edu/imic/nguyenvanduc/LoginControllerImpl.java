package vn.edu.imic.nguyenvanduc;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class LoginControllerImpl implements LoginController {

	@Override
	public void validate(UserDetail user) throws UserNotFoundException {
		if (user.getUsername() == null)
			throw new UserNotFoundException("username", "empty username");
		if (user.getUsername().isEmpty())
			throw new UserNotFoundException("username", "empty username");
		if (user.getPassword() == null)
			throw new UserNotFoundException("password", "empty password");
		if (!user.getPassword().equals("123456") || !user.getUsername().equals("imic"))
			throw new UserNotFoundException("user", "invalid username or password");
	}

}
