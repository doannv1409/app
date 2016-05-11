package vn.edu.imic.leanhtuan.exception;

import vn.edu.imic.quangminh.exceptions.ErrorCodes;
import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;
import vn.edu.imic.quangminh.exceptions.UserNotFoundException;

public class LoginControllerImpl implements LoginController{
	

	@Override
	public void validate(UserDetail user) throws UsernameNotFoundException{
		if(user.getUsername() == null || user.getUsername().isEmpty()){
//			throw new UsernameNotFoundException("empty username", "username");
			ErrorCodes err = ErrorCodes.EMPTY_USERNAME;
			throw new UserNotFoundException(err.message(), err.code());
		}

		
		
		//TODO check empty
		if(user.getPassword() == null || user.getPassword().isEmpty()){
//			throw new UsernameNotFoundException("empty password", "password");
			ErrorCodes err = ErrorCodes.EMPTY_PASSWORD;
			throw new UserNotFoundException(err.message(), err.code());
		}
	
		
		
		
		if(!user.getUsername().equals("imic") || !user.getPassword().equals("123456")){
//			throw new UsernameNotFoundException("invalid username or password", "user");
			ErrorCodes err = ErrorCodes.INVALID_USER;
			throw new UserNotFoundException(err.message(), err.code());
	
		}
		
	}

}
