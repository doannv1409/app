package vn.edu.imic.tunglam.Exceptions;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException {
	private String code;
	
	public UserNotFoundException(String message, String code) {
		super(message);
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

}
