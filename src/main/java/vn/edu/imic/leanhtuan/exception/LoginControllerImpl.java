package vn.edu.imic.leanhtuan.exception;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class LoginControllerImpl implements LoginController{


	@Override
	public void validate(UserDetail user) throws UsernameNotFoundException{
		if(user.getUsername() == null){
			throw new UsernameNotFoundException("empty username", "username");
		
		} 
		
		if(user.getUsername().isEmpty()){
			throw new UsernameNotFoundException("empty username", "username");
		}
		
		if(user.getPassword() == null){
			throw new UsernameNotFoundException("empty password", "password");
		}
		
		
		if(!user.getUsername().equals("imic") || !user.getPassword().equals("123456")){
			throw new UsernameNotFoundException("invalid username or password", "user");
		}
		
	}

}
