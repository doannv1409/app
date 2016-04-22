package vn.edu.imic.quangminh.oop.abstracts;

public class LoginControllerImpl implements LoginController, 
				SecondFactorAuthenticate {
	private String username;
	
	@Override
	public boolean auth(String username, String password) {
		if("imic".equals(username) && "123".equals(password)) {
			setUsername(username);
			return true;
		}
		
		return false;
	}

	public void sayHello() {
		System.out.println("Xin chao: " + username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public boolean checkOtp(String otp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}
}
