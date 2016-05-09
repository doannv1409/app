package vn.edu.imic.taind;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class LoginControllerImpl implements LoginController {

	@Override
	public void validate(UserDetail user) {
		// TODO Auto-generated method stub
		if(user.getUsername() == null) {
			throw new UserNotFoundException("01", "empty username");
		}
		
		if(user.getPassword() == null) {
			throw new UserNotFoundException("02", "empty password");
		}
		
		if(!"imic".equals(user.getUsername()) || !"123456".equals(user.getPassword())){
			throw new UserNotFoundException("03", "invalid username or password");
		}
	}
	

}
