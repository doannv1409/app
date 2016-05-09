package vn.edu.imic.hieu.exceptions;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class LoginControllerImpl implements LoginController{

	@Override
	public void validate(UserDetail user) throws UserNotFoundException {
		if (user.getUsername() == null) throw new UserNotFoundException("username","empty username");
		if (user.getPassword() == null) throw new UserNotFoundException("password", "empty password");
		if (!user.getUsername().equals("imic")|| !user.getPassword().equals("123456"))
			throw new UserNotFoundException("Fail", "invalid username or password");
	}

}
