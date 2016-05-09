package vn.edu.imic.vumanh;
import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;;
public class LoginControllerImpl implements LoginController{
	
	@Override
	public void validate(UserDetail user) {
		if(user.getUsername()==null||user.getUsername().isEmpty())
		{
			throw new UserNotFoundException("empty Username", "001");
		}
		if(user.getPassword()==null||user.getPassword().isEmpty())
		{
			throw new UserNotFoundException("empty password","002");	
		}
		if(user.getUsername()=="imic"||user.getPassword()=="123456"){
			throw new UserNotFoundException("invalid username or password","003");
		}
		System.out.println("login ok");
	}

}
