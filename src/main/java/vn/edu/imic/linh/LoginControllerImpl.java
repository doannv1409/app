package vn.edu.imic.linh;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class LoginControllerImpl implements LoginController {

	@Override
	public void validate(UserDetail user) {
		if(user.getUsername() == null || user.getUsername().isEmpty()){
			throw new UserNotFoundException("empty username", "#111");
		}
		if(user.getPassword() == null || user.getPassword().isEmpty()){
			throw new UserNotFoundException("empty password", "#112");
		}
		if(!"imic".equals(user.getUsername()) || !"123456".equals(user.getPassword())){
			throw new UserNotFoundException("invalid username or password", "#113");
		}
		
		System.out.println("Login Ok");
		
	}
	
	

}
