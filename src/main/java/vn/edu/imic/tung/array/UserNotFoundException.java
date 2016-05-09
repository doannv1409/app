package vn.edu.imic.tung.array;

public class UserNotFoundException extends RuntimeException{
	private String code;
	private String message;
	public UserNotFoundException(String message, String code){}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	};
	

}
