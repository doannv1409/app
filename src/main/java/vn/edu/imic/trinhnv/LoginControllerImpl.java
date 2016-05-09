package vn.edu.imic.trinhnv;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class LoginControllerImpl implements LoginController {

	@Override
	public void validate(UserDetail user) {
		// TODO Auto-generated method stub
		if(user.getUsername().isEmpty() || user.getUsername() == null){
			throw new UserNotFoundException("empty username", "code1");
		}
		if (user.getPassword().isEmpty() || user.getPassword() == null) {
			throw new UserNotFoundException("empty password", "code2");
		}
		if (!"imic".equals(user.getUsername()) && !"123456".equals(user.getPassword())) {
			throw new UserNotFoundException("invalid username or password", "code3");
		}
		System.out.println("Login ok");
	}
	
}
