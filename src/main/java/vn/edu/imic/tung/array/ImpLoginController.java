package vn.edu.imic.tung.array;

import vn.edu.imic.quangminh.exceptions.LoginController;
import vn.edu.imic.quangminh.exceptions.UserDetail;

public class ImpLoginController implements LoginController {

	@Override
	public void validate(UserDetail user) {
		// TODO Auto-generated method stub
		if(user.getPassword().isEmpty()){ 
			throw new UserNotFoundException(" moi ban nhap password", "loi loai 1");
		}
		if(user.getUsername().isEmpty()){
			throw new UserNotFoundException("moi nhap username ", "loi loai 2");
		}
		if (("imic").equals(user.getUsername())&&("123456").equals(user.getPassword())){
			throw new UserNotFoundException("login ok", "ok roi");
		}
		else throw new UserNotFoundException("khong hop le", "loi loi qua");
	}

}
