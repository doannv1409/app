package vn.edu.imic.trinhnv;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class LoginControllerImpl implements LoginController {

	@Override
	public void validate(UserDetail user) {
		// TODO Auto-generated method stub
		if(user.getUsername().isEmpty()){
			throw new UserNotFoundException("Empty username", "code1");
		}
		if (user.getPassword().isEmpty()) {
			throw new UserNotFoundException("Empty password", "code2");
		}
		if ("imic".equals(user.getUsername()) && ("123456").equals(user.getPassword())) {
			throw new UserNotFoundException("Login ok", "code3");
		}else {
			throw new UserNotFoundException("Invalid username or password", "code4");
		}
	}
	
}
