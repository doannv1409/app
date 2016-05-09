package vn.edu.imic.quangminh.exceptions;

public class LoginControllerImpl implements LoginController {

	@Override
	public void validate(UserDetail user) {
		String username = user.getUsername();
		String password = user.getPassword();
		
		if(username == null || username.isEmpty()) {
			ErrorCodes err = ErrorCodes.EMPTY_USERNAME;
			throw new UserNotFoundException(err.message(), err.code());
		}

		if(password == null || password.isEmpty()) {
			ErrorCodes err = ErrorCodes.EMPTY_PASSWORD;
			throw new UserNotFoundException(err.message(), err.code());
		}
		
		if(!"imic".equals(username) || !"123456".equals(password)) {
			ErrorCodes err = ErrorCodes.INVALID_USER;
			throw new UserNotFoundException(err.message(), err.code());
		}
		
	}

}
