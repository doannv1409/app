package vn.edu.imic.linh;

public class UserDetail {
	private String username;
	private String password;
	
	public UserDetail(String username, String passwork){
		this.username = username;
		this.password = password;
	}
	
	public String getUserName(){
		return this.username;
	}
	
	public String setPassWord(){
		return this.password;
	}

}
